package org.lgcy.Legacy.core;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;
import org.lgcy.Legacy.core.transaction.TransactionBuilder;
import org.lgcy.Legacy.core.transaction.TransactionCapsule;
import org.lgcy.Legacy.abi.FunctionEncoder;
import org.lgcy.Legacy.abi.datatypes.Function;
import org.lgcy.Legacy.api.GrpcAPI;
import org.lgcy.Legacy.api.GrpcAPI.BytesMessage;

import org.lgcy.Legacy.core.contract.Contract;

import org.lgcy.Legacy.core.contract.ContractFunction;
import org.lgcy.Legacy.core.exceptions.IllegalException;
import org.lgcy.Legacy.core.key.KeyPair;
import org.lgcy.Legacy.core.utils.Sha256Hash;
import org.lgcy.Legacy.core.utils.Utils;
import org.lgcy.Legacy.proto.Chain;
import org.lgcy.Legacy.proto.Chain.Transaction;

import org.lgcy.Legacy.proto.Chain.Block;

import org.lgcy.Legacy.proto.Common;
import org.lgcy.Legacy.proto.Common.SmartContract;

import org.lgcy.Legacy.proto.Contract.TransferAssetContract;
import org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract;
import org.lgcy.Legacy.proto.Contract.FreezeBalanceContract;
import org.lgcy.Legacy.proto.Contract.TransferContract;
import org.lgcy.Legacy.proto.Contract.VoteWitnessContract;
import org.lgcy.Legacy.proto.Contract.TriggerSmartContract;
import org.lgcy.Legacy.proto.Contract.AccountUpdateContract;
import org.lgcy.Legacy.proto.Contract.AccountCreateContract;
import org.lgcy.Legacy.proto.Contract.AssetIssueContract;
import org.lgcy.Legacy.proto.Contract.SetAccountIdContract;
import org.lgcy.Legacy.proto.Contract.UpdateAssetContract;
import org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract;
import org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract;
import org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract;
import org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract;
import org.lgcy.Legacy.proto.NewTransactionOuterClass;
import org.lgcy.Legacy.proto.Response;
import org.lgcy.Legacy.proto.Response.TransactionExtention;
import org.lgcy.Legacy.proto.Response.TransactionReturn;
import org.lgcy.Legacy.proto.Response.NodeInfo;
import org.lgcy.Legacy.proto.Response.WitnessList;
import org.lgcy.Legacy.proto.Response.BlockExtention;
import org.lgcy.Legacy.proto.Response.BlockListExtention;
import org.lgcy.Legacy.proto.Response.Proposal;
import org.lgcy.Legacy.proto.Response.Exchange;

import org.lgcy.Legacy.proto.Response.DelegatedResourceAccountIndex;
import org.lgcy.Legacy.api.GrpcAPI.NumberMessage;
import org.lgcy.Legacy.api.GrpcAPI.EmptyMessage;
import org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage;
import org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage;
import org.lgcy.Legacy.api.GrpcAPI.BlockLimit;
import org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage;
import org.lgcy.Legacy.utils.Base58Check;

import org.lgcy.Legacy.proto.Contract.UnDelegateResourceContract;
import org.lgcy.Legacy.proto.Contract.WithdrawExpireUnfreezeContract;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


import java.nio.ByteBuffer;
import java.util.*;

import org.bouncycastle.jcajce.provider.digest.SHA256;
import org.bouncycastle.util.encoders.Hex;
import org.lgcy.Legacy.proto.Response.NodeList;
import org.lgcy.Legacy.proto.Response.TransactionInfoList;
import org.lgcy.Legacy.proto.Response.TransactionInfo;
import org.lgcy.Legacy.proto.Response.Account;
import org.lgcy.Legacy.proto.Response.AccountResourceMessage;
import org.lgcy.Legacy.proto.Response.AccountNetMessage;
import org.lgcy.Legacy.proto.Response.ChainParameters;
import org.lgcy.Legacy.proto.Response.AssetIssueList;
import org.lgcy.Legacy.proto.Response.ProposalList;
import org.lgcy.Legacy.proto.Response.ExchangeList;
import org.lgcy.Legacy.proto.Response.TransactionSignWeight;
import org.lgcy.Legacy.proto.Response.TransactionApprovedList;

import javax.xml.bind.DatatypeConverter;

/**
 * A {@code ApiWrapper} object is the entry point for calling the functions.
 *
 *<p>A {@code ApiWrapper} object is bind with a private key and a full node.
 * {@link #broadcastTransaction}, {@link #signTransaction} and other transaction related
 * operations can be done via a {@code ApiWrapper} object.</p>
 *
 * @since java version 1.8.0_231
 * @see Contract
 * @see org.lgcy.Legacy.proto.Chain.Transaction
 * @see org.lgcy.Legacy.proto.Contract
 */

public class ApiWrapper {
    public static final long TRANSACTION_DEFAULT_EXPIRATION_TIME = 60 * 1_000L; //60 seconds

    public final WalletGrpc.WalletBlockingStub blockingStub;

    public final KeyPair keyPair;
    public final ManagedChannel channel;


    public ApiWrapper(String grpcEndpoint, String hexPrivateKey) {
        channel = ManagedChannelBuilder.forTarget(grpcEndpoint).usePlaintext().build();
        blockingStub = WalletGrpc.newBlockingStub(channel);
        keyPair = new KeyPair(hexPrivateKey);
    }




    public void close() {
        channel.shutdown();
    }

    /*public ApiWrapper(Channel channel, String hexPrivateKey) {
        blockingStub = WalletGrpc.newBlockingStub(channel);
        blockingStubSolidity = WalletSolidityGrpc.newBlockingStub(channel);
        keyPair = SECP256K1.KeyPair.create(SECP256K1.PrivateKey.create(Bytes32.fromHexString(hexPrivateKey)));
    }*/




    /**
     * The constuctor for  testnet. Use LgcyGrid as default.
     * @param hexPrivateKey the binding private key. Operations require private key will all use this unless the private key is specified elsewhere.
     * @param apiKey this function works with LgcyGrid, an API key is required.
     * @return a ApiWrapper object
     */
    public static ApiWrapper testNet(String hexPrivateKey) {
        return new ApiWrapper(Constant.TESTNET_GRPC_SERVER, hexPrivateKey);
    }


    public static ApiWrapper mainNet(String hexPrivateKey) {
        return new ApiWrapper(Constant.MAINNET_GRPC_SERVER, hexPrivateKey);
    }



    /**
     * Generate random address
     * @return A list, inside are the public key and private key
     */
    public static KeyPair generateAddress() {
        // generate random address
        return KeyPair.generate();
    }

    /**
     * The function receives addresses in any formats.
     * @param address account or contract address in any allowed formats.
     * @return hex address
     */



    public static ByteString parseAddress(String address) {
        byte[] raw = null;

        if (address.startsWith("L")) {
            raw = Base58Check.base58ToBytes(address);
        } else if (address.startsWith("30")) {
            raw = Hex.decode(address);
        } else if (address.startsWith("0x")) {
            raw = Hex.decode(address.substring(2));
        } else {
            try {
                raw = Hex.decode(address);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid address: " +ByteString.copyFrom(raw));
            }
        }
        return ByteString.copyFrom(raw);
    }



    public int getReward(String address){
        ByteString rawFrom = parseAddress(address);
        GrpcAPI.RewardMessage rewardMessage= GrpcAPI.RewardMessage.newBuilder()
                .setAddress(rawFrom).build();
         GrpcAPI.RewardOutput rewardOutput= blockingStub.getReward(rewardMessage);
        int rewardData = rewardOutput.getReward();
        return rewardData;
    }

    public static byte[] calculateTransactionHash (Transaction txn) {
        SHA256.Digest digest = new SHA256.Digest();
        digest.update(txn.getRawData().toByteArray());
        byte[] txid = digest.digest();

        return txid;
    }


    public Response.AddressPrKeyPairMessage generateaddress(){
        EmptyMessage emptyMessage= EmptyMessage.newBuilder().build();
        Response.AddressPrKeyPairMessage addressPrKeyPairMessage= blockingStub.generateAddress(emptyMessage);
        return addressPrKeyPairMessage;

    }

    public static byte[] calculateTransactionHash (NewTransactionOuterClass.NewTransaction txn) {
        SHA256.Digest digest = new SHA256.Digest();
        digest.update(txn.getRawData().toByteArray());
        byte[] txid = digest.digest();

        return txid;
    }

    public static ByteString parseHex(String hexString) {
        byte[] raw = Hex.decode(hexString);
        return ByteString.copyFrom(raw);
    }

    public static String toHex(byte[] raw) {
        return Hex.toHexString(raw);
    }

    public static String toHex(ByteString raw) {
        return Hex.toHexString(raw.toByteArray());
    }

    public Transaction signTransaction(TransactionExtention txnExt, KeyPair keyPair) {
        byte[] txid = txnExt.getTxid().toByteArray();

        byte[] signature = KeyPair.signTransaction(txid, keyPair);
        Transaction signedTxn =
                txnExt.getTransaction().toBuilder().addSignature(ByteString.copyFrom(signature)).build();

        return signedTxn;
    }

    public Transaction signTransaction(Transaction txn, KeyPair keyPair) {
        byte[] txid = calculateTransactionHash(txn);
        byte[] signature = KeyPair.signTransaction(txid, keyPair);
        Transaction signedTxn = txn.toBuilder().addSignature(ByteString.copyFrom(signature)).build();
        return signedTxn;
    }

    public Transaction signTransaction(TransactionExtention txnExt) {

        return signTransaction(txnExt, keyPair);
    }

    public Transaction signTransaction(Transaction txn) {
        return signTransaction(txn, keyPair);
    }






    /**
     * Estimate the bandwidth consumption of the transaction.
     * Please note that bandwidth estimations are based on signed transactions.
     * @param txn the transaction to be estimated.
     */
    public long estimateBandwidth(Transaction txn) {
        long byteSize = txn.toBuilder().clearRet().build().getSerializedSize() + 64;
        return byteSize;
    }

    /**
     * Resolve the result code from TransactionReturn objects.
     * @param code the result code.
     * @return the corresponding message.
     */
    private String resolveResultCode(int code) {
        String responseCode = "";
        switch (code) {
            case 0:
                responseCode = "SUCCESS";
            case 1:
                responseCode = "SIGERROR";
            case 2:
                responseCode = "CONTRACT_VALIDATE_ERROR";
            case 3:
                responseCode = "CONTRACT_EXE_ERROR";
            case 4:
                responseCode = "BANDWITH_ERROR";
            case 5:
                responseCode = "DUP_TRANSACTION_ERROR";
            case 6:
                responseCode = "TAPOS_ERROR";
            case 7:
                responseCode = "TOO_BIG_TRANSACTION_ERROR";
            case 8:
                responseCode = "TRANSACTION_EXPIRATION_ERROR";
            case 9:
                responseCode = "SERVER_BUSY";
            case 10:
                responseCode = "NO_CONNECTION";
            case 11:
                responseCode = "NOT_ENOUGH_EFFECTIVE_CONNECTION";
            case 20:
                responseCode = "OTHER_ERROR";
        }
        return responseCode;
    }

    /**
     * broadcast a transaction with the binding account.
     * @param Transaction a signed transaction ready to be broadcasted
     * @return a TransactionReturn object contains the broadcasting result
     * @throws RuntimeException if broadcastin fails
     */



    public Chain.TransactionReturnData broadcastTransaction(NewTransactionOuterClass.NewTransaction txn) throws RuntimeException{

        Chain.TransactionReturnData ret = blockingStub.broadcastTransactionData(txn);
          return ret;
    }







    public NewTransactionOuterClass.NewTransaction unfreezeBalance(String ownerAddress, String resourceCode) throws IllegalException {

        UnfreezeBalanceContract unfreeze =
                UnfreezeBalanceContract.newBuilder()
                        .setOwnerAddress(parseAddress(ownerAddress))
                        .setResource(Common.ResourceCode.valueOf(resourceCode))
                        .build();
        NewTransactionOuterClass.NewTransaction txnExt = blockingStub.unfreezeBalance(unfreeze);

        return txnExt;
    }


//new impl for create transaction
    public NewTransactionOuterClass.NewTransaction createtransaction(String ownerAddress, String toAddress, long amount) throws IllegalException {

        ByteString rawFrom = parseAddress(ownerAddress);
        ByteString rawTo = parseAddress(toAddress);

        TransferContract req = TransferContract.newBuilder()
                .setOwnerAddress(rawFrom)
                .setToAddress(rawTo)
                .setAmount(amount)
                .build();

        NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.createTransaction(req);

        return newTransaction;
    }






    public NewTransactionOuterClass.NewTransaction freezeBalance(String ownerAddress, long frozenBalance, long frozenDuration, String resourceCode) throws IllegalException {
        ByteString rawFrom = parseAddress(ownerAddress);

        FreezeBalanceContract freezeBalanceContract=
                FreezeBalanceContract.newBuilder()
                        .setOwnerAddress(rawFrom)
                        .setFrozenBalance(frozenBalance)
                        .setFrozenDuration(frozenDuration)
                        .setResource(Common.ResourceCode.valueOf(resourceCode))
                        .build();

        Common.ResourceCode data=freezeBalanceContract.getResource();

        NewTransactionOuterClass.NewTransaction txnExt = blockingStub.freezeBalance(freezeBalanceContract);

        return txnExt;
    }


    public NewTransactionOuterClass.NewTransaction transactionSign(NewTransactionOuterClass.NewTransaction newTransaction, String privateKey) throws InvalidProtocolBufferException {

        NewTransactionOuterClass.SignTransactionExtension  signTransactionExtension= NewTransactionOuterClass.SignTransactionExtension.newBuilder()
                .setTransaction(newTransaction)
                .setPrivateKey(privateKey).build();

        NewTransactionOuterClass.NewTransaction newTransaction1=blockingStub.signTransactionCreation(signTransactionExtension);


        return newTransaction1;
    }




    public NewTransactionOuterClass.NewTransaction createWitness(String address, String url){
        ByteString bsAddress = parseAddress(address);

        org.lgcy.Legacy.proto.Contract.WitnessCreateContract witnessCreateContract = org.lgcy.Legacy.proto.Contract.WitnessCreateContract.newBuilder()
                .setOwnerAddress(bsAddress)
                .setUrl(ByteString.copyFromUtf8(url)).build();

      NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.createWitness(witnessCreateContract);
      return newTransaction;


    }








    //new impl
    public  Block getBlockById(String value){
        ByteString rawOwner = parseAddress(value);
        BytesMessage bytesMessage= BytesMessage.newBuilder().setValue(rawOwner).build();
        Block block= blockingStub.getBlockById(bytesMessage);
        return block;
    }

    // new impl

    public Response.SmartContractDataWrapper getContractInfo(String value){
        ByteString rawOwner = parseAddress(value);
        BytesMessage bytesMessage= BytesMessage.newBuilder()
                .setValue(rawOwner).build();
        Response.SmartContractDataWrapper smartContractDataWrapper = blockingStub.getContractInfo(bytesMessage);
        return smartContractDataWrapper;
    }



    //new impl
    public Response.EasyTransferResponse easytransferbyprivate(String privateKey,String toAddress,long amount){
        ByteString private_key = parseAddress(privateKey);

        ByteString to_Address = parseAddress(toAddress);
        GrpcAPI.EasyTransferByPrivateMessage easyTransferByPrivateMessage= GrpcAPI.EasyTransferByPrivateMessage.newBuilder()
                .setPrivateKey(private_key)
                .setToAddress(to_Address)
                .setAmount(amount)
                .build();
        
        Response.EasyTransferResponse easyTransferResponse= blockingStub.easyTransferByPrivate(easyTransferByPrivateMessage);
        return easyTransferResponse;
    }



    public NewTransactionOuterClass.NewTransaction createProposal(String address, List<org.lgcy.Legacy.proto.Contract.ProposalCreateContract.Parameters> parametersList){

        ByteString private_key = parseAddress(address);
        org.lgcy.Legacy.proto.Contract.ProposalCreateContract.Builder proposalCreateContract= org.lgcy.Legacy.proto.Contract.ProposalCreateContract.newBuilder();
        proposalCreateContract.setOwnerAddress(toHex(private_key));
        proposalCreateContract.addAllParameters(parametersList);

        NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.proposalCreate(proposalCreateContract.build());

        return newTransaction;

    }










    /**
     * Vote for witnesses
     * @param ownerAddress owner address
     * @param votes <vote address, vote count>
     * @return TransactionExtention
     * IllegalNumException if fail to vote witness
     */
    public NewTransactionOuterClass.NewTransaction voteWitness(String ownerAddress,List<org.lgcy.Legacy.proto.Contract.VoteWitnessContract.Vote> voteList) throws IllegalException {
        ByteString rawFrom = parseAddress(ownerAddress);

        VoteWitnessContract voteWitnessContract= VoteWitnessContract.newBuilder()
                .setOwnerAddress(toHex(rawFrom))
                .addAllVotes(voteList).build() ;


      NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.voteWitnessAccount(voteWitnessContract);


       // TransactionExtention txnExt = createTransactionExtention(voteWitnessContract, Transaction.Contract.ContractType.VoteWitnessContract);

        return newTransaction;
    }





    /**
     * Query the latest block information
     * @return Block
     * @throws IllegalException if fail to get now block
     */
    public Block getNowBlock() throws IllegalException {
        Block block = blockingStub.getNowBlock(EmptyMessage.newBuilder().build());
        if(!block.hasBlockHeader()){
            throw new IllegalException("Fail to get latest block.");
        }
        return block;
    }


    public GrpcAPI.Transactioncountbyblocknum getTransactionCountByBlockNum(long num) {
        NumberMessage numberMessage= NumberMessage.newBuilder().setNum(num).build();
        GrpcAPI.Transactioncountbyblocknum block = blockingStub.getTransactionCountByBlockNum(numberMessage);

        return block;
    }

    public NewTransactionOuterClass.NewTransaction proposalapprove(String owner_address, long proposal_id, boolean is_add_approval){
        ByteString bsOwnerAddress = parseAddress(owner_address);
        org.lgcy.Legacy.proto.Contract.ProposalApproveContract proposalApproveContract= org.lgcy.Legacy.proto.Contract.ProposalApproveContract.newBuilder()
                .setOwnerAddress(bsOwnerAddress)
                .setProposalId(proposal_id)
                .setIsAddApproval(is_add_approval)
                .build();

        NewTransactionOuterClass.NewTransaction transactionExtention = blockingStub.proposalApprove(proposalApproveContract);
        return transactionExtention;

    }



    public NewTransactionOuterClass.NewTransaction proposalDelete(String owner_address, long proposal_id){
        ByteString bsOwnerAddress = parseAddress(owner_address);
        org.lgcy.Legacy.proto.Contract.ProposalDeleteContract proposalDeleteContract=org.lgcy.Legacy.proto.Contract.ProposalDeleteContract.newBuilder()
                .setOwnerAddress(bsOwnerAddress)
                .setProposalId(proposal_id).build();

        NewTransactionOuterClass.NewTransaction transactionExtention = blockingStub.proposalDelete(proposalDeleteContract);
        return transactionExtention;

    }



    public NewTransactionOuterClass.NewTransaction withdrawbalance(String address){
        ByteString bsOwnerAddress = parseAddress(address);
        org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract withdrawBalanceContract= org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract.newBuilder()
                .setOwnerAddress(bsOwnerAddress).build();
        NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.withdrawBalance(withdrawBalanceContract);
        return newTransaction;

    }



    /**
     * Returns the Block Object corresponding to the 'Block Height' specified (number of blocks preceding it)
     * @param blockNum The block height
     * @return BlockExtention block details
     * @throws IllegalException if the parameters are not correct
     */
    public BlockExtention getBlockByNum(long blockNum) throws IllegalException {
        NumberMessage.Builder builder = NumberMessage.newBuilder();
        builder.setNum(blockNum);
        BlockExtention block = blockingStub.getBlockByNum2(builder.build());

        if(!block.hasBlockHeader()){
            throw new IllegalException();
        }
        return block;
    }

    /**
     * Get some latest blocks
     * @param num Number of latest blocks
     * @return BlockListExtention
     * @throws IllegalException if the parameters are not correct
     */
    public BlockListExtention getblockbylastestnum(long num) throws IllegalException {
        NumberMessage numberMessage = NumberMessage.newBuilder().setNum(num).build();
        BlockListExtention blockListExtention = blockingStub.getBlockByLatestNum2(numberMessage);

        if(blockListExtention.getBlockCount() == 0){
            throw new IllegalException("The number of latest blocks must be between 1 and 99, please check it.");
        }
        return blockListExtention;
    }

    /**
     * Returns the list of Block Objects included in the 'Block Height' range specified
     * @param startNum Number of start block height, including this block
     * @param endNum Number of end block height, excluding this block
     * @return BlockListExtention
     * @throws IllegalException if the parameters are not correct
     */
    public BlockListExtention getBlockByLimitNext(long startNum, long endNum) throws IllegalException {
        BlockLimit blockLimit = BlockLimit.newBuilder()
                .setStartNum(startNum)
                .setEndNum(endNum)
                .build();
        BlockListExtention blockListExtention = blockingStub.getBlockByLimitNext2(blockLimit);

        if(endNum - startNum > 100){
            throw new IllegalException("The difference between startNum and endNum cannot be greater than 100, please check it.");
        }
        if(blockListExtention.getBlockCount() == 0){
            throw new IllegalException();
        }
        return blockListExtention;
    }

    /**
     * Get current API node’ info
     * @return NodeInfo
     * @throws IllegalException if fail to get nodeInfo
     */
    public NodeInfo getNodeInfo() throws IllegalException {
        NodeInfo nodeInfo = blockingStub.getNodeInfo(EmptyMessage.newBuilder().build());

        if(nodeInfo.getBlock().isEmpty()){
            throw new IllegalException("Fail to get node info.");
        }
        return nodeInfo;
    }

    /**
     * List all nodes that current API node is connected to
     * @return NodeList
     * @throws IllegalException if fail to get node list
     */
    public NodeList listNodes() throws IllegalException {
        NodeList nodeList = blockingStub.listNodes(EmptyMessage.newBuilder().build());

        if(nodeList.getNodesCount() == 0){
            throw new IllegalException("Fail to get node list.");
        }
        return nodeList;
    }


    public NumberMessage getNextMaintenanceTime(){
        NumberMessage numberMessage= blockingStub.getNextMaintenanceTime(EmptyMessage.newBuilder().build());
        return numberMessage;
    }

    /**
     * Get transactionInfo from block number
     * @param blockNum The block height
     * @return TransactionInfoList
     * @throws IllegalException no transactions or the blockNum is incorrect
     */
    public TransactionInfoList getTransactionInfoByBlockNum(long blockNum) throws IllegalException {
        NumberMessage numberMessage = NumberMessage.newBuilder().setNum(blockNum).build();
        TransactionInfoList transactionInfoList = blockingStub.getTransactionInfoByBlockNum(numberMessage);
        if(transactionInfoList.getTransactionInfoCount() == 0){
            throw new IllegalException("no transactions or the blockNum is incorrect.");
        }

        return transactionInfoList;
    }

    /**
     * Query the transaction fee, block height by transaction id
     * @param txID Transaction hash, i.e. transaction id
     * @return TransactionInfo
     * @throws IllegalException if the parameters are not correct
     */
    public TransactionInfo getTransactionInfoById(String txID) throws IllegalException {
        ByteString bsTxid = parseAddress(txID);
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(bsTxid)
                .build();
        TransactionInfo transactionInfo = blockingStub.getTransactionInfoById(request);

        if(transactionInfo.getBlockTimeStamp() == 0){
            throw new IllegalException();
        }
        return transactionInfo;
    }

    /**
     * Query transaction information by transaction id
     * @param txID Transaction hash, i.e. transaction id
     * @return Transaction
     * @throws IllegalException if the parameters are not correct
     */
    public NewTransactionOuterClass.NewTransaction getTransactionById(String txID) throws IllegalException {
        ByteString bsTxid = parseAddress(txID);
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(bsTxid)
                .build();
       NewTransactionOuterClass.NewTransaction transaction = blockingStub.getTransactionById3(request);

        if(transaction.getRetCount() == 0){
            throw new IllegalException();
        }
        return transaction;
    }

    /**
     * Get account info by address
     * @param address address, default hexString
     * @return Account
     */
    public Account getAccount(String address) {
        ByteString bsAddress = parseAddress(address);
        AccountAddressMessage accountAddressMessage = AccountAddressMessage.newBuilder()
                .setAddress(bsAddress)
                .build();

        Account account = blockingStub.getAccount(accountAddressMessage);

        return account;
    }

    /**
     * Query the resource information of an account(bandwidth,energy,etc)
     * @param address address, default hexString
     * @return AccountResourceMessage
     */
    public AccountResourceMessage getAccountResource(String address) {
        ByteString bsAddress = parseAddress(address);
        AccountAddressMessage account = AccountAddressMessage.newBuilder()
                .setAddress(bsAddress)
                .build();
        return blockingStub.getAccountResource(account);
    }

    /**
     * Query bandwidth information
     * @param address address, default hexString
     * @return AccountResourceMessage
     */
    public AccountNetMessage getAccountNet(String address) {
        ByteString bsAddress = parseAddress(address);
        AccountAddressMessage account = AccountAddressMessage.newBuilder()
                .setAddress(bsAddress)
                .build();
        return blockingStub.getAccountNet(account);
    }

    public long getAccountBalance(String address) {
        Account account = getAccount(address);
        long balance = account.getBalance();
        return balance;
    }


    public Account getAccountById(String id) {
        ByteString bsId = ByteString.copyFrom(id.getBytes());
        AccountIdMessage accountId = AccountIdMessage.newBuilder()
                .setId(bsId)
                .build();
        return blockingStub.getAccountById(accountId);
    }



    /**
     * All parameters that the blockchain committee can set
     * @return ChainParameters
     * @throws IllegalException if fail to get chain parameters
     */
    public ChainParameters getChainParameters() throws IllegalException {
        ChainParameters chainParameters = blockingStub.getChainParameters(EmptyMessage.newBuilder().build());

        if(chainParameters.getChainParameterCount() == 0){
            throw new IllegalException("Fail to get chain parameters.");
        }
        return chainParameters;
    }



    /**
     * Query the TRC10 token information issued by an account
     * @param address the Token Issuer account address
     * @return AssetIssueList, a list of Tokens that succeed the Token located at offset
     */
    public AssetIssueList getAssetIssueByAccount(String address) {
        ByteString addressBS = parseAddress(address);
        AccountAddressMessage request = AccountAddressMessage.newBuilder()
                .setAddress(addressBS)
                .build();
        AssetIssueList assetIssueList = blockingStub.getAssetIssueByAccount(request);
        return assetIssueList;
    }

    /**
     * Query a token by token id
     * @param assetId the ID of the TRC10 token
     * @return AssetIssueContract, the token object, which contains the token name
     */
    public AssetIssueContract getAssetIssueById(String assetId) {
        ByteString assetIdBs = ByteString.copyFrom(assetId.getBytes());
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(assetIdBs)
                .build();

        AssetIssueContract assetIssueContract = blockingStub.getAssetIssueById(request);
        return assetIssueContract;
    }

    /**
     * Query a token by token name
     * @param name the name of the TRC10 token
     * @return AssetIssueContract, the token object, which contains the token name
     */
    public AssetIssueContract getAssetIssueByName(String name) {
        ByteString assetNameBs = ByteString.copyFrom(name.getBytes());
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(assetNameBs)
                .build();

        AssetIssueContract assetIssueContract = blockingStub.getAssetIssueByName(request);
        return assetIssueContract;
    }

    /**
     * Query the list of all the TRC10 tokens by token name
     * @param name the name of the TRC10 token
     * @return AssetIssueList
     */
    public AssetIssueList getAssetIssueListByName(String name) {
        ByteString assetNameBs = ByteString.copyFrom(name.getBytes());
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(assetNameBs)
                .build();

        AssetIssueList assetIssueList = blockingStub.getAssetIssueListByName(request);
        return assetIssueList;
    }




    /**
     * List all proposals
     * @return ProposalList
     */
    public ProposalList listProposals() {
        ProposalList proposalList = blockingStub.listProposals(EmptyMessage.newBuilder().build());

        return proposalList;
    }

    /**
     * Query proposal based on ID
     * @param id proposal id
     * @return Proposal, proposal details
     * @throws IllegalException if fail to get proposal
     */


    public Proposal getProposalById(int id) throws IllegalException {


        GrpcAPI.ProposalInput request = GrpcAPI.ProposalInput.newBuilder()
                .setId(id)
                .build();
        Proposal proposal = blockingStub.getProposalById(request);

//        if(proposal.getApprovalsCount() == 0){
//            throw new IllegalException();
//        }
        return proposal;
    }

    /**
     * List all witnesses that current API node is connected to
     * @return WitnessList
     */
    public WitnessList listWitnesses() {
        WitnessList witnessList = blockingStub
                .listWitnesses(EmptyMessage.newBuilder().build());
        return witnessList;
    }


    /**
     * Query exchange pair based on id
     * @param id transaction pair id
     * @return Exchange
     * @throws IllegalException if fail to get exchange pair
     */
    public Exchange getExchangeById(String id) throws IllegalException {
        ByteString bsTxid = ByteString.copyFrom(ByteBuffer.allocate(8).putLong(Long.parseLong(id)).array());

        BytesMessage request = BytesMessage.newBuilder()
                .setValue(bsTxid)
                .build();
        Exchange exchange = blockingStub.getExchangeById(request);

        if(exchange.getSerializedSize() == 0){
            throw new IllegalException();
        }
        return exchange;
    }



    /**
     * Unfreeze a token that has passed the minimum freeze duration
     * @param contract AccountPermissionUpdateContract
     * @return TransactionExtention
     * @throws IllegalException if fail to update account permission
     */
    public NewTransactionOuterClass.NewTransaction accountPermissionUpdate(String address, Common.Permission owner, Common.Permission witness, List<Common.Permission> actives) throws IllegalException {
        ByteString bsAddress = parseAddress(address);
        AccountPermissionUpdateContract.Builder accountPermissionUpdateContract= AccountPermissionUpdateContract.newBuilder();
        accountPermissionUpdateContract.setOwnerAddress(toHex(bsAddress));

                accountPermissionUpdateContract.setOwner(owner);
                accountPermissionUpdateContract.setWitness(witness);
                accountPermissionUpdateContract.addAllActives(actives);

        NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.accountPermissionUpdate(accountPermissionUpdateContract.build());


        return newTransaction;
    }

    /**
     * Query transaction sign weight
     * @param usdlNum transaction object
     * @return TransactionSignWeight
     */
    public TransactionSignWeight getTransactionSignWeight(Transaction usdl) {

        TransactionSignWeight transactionSignWeight = blockingStub.getTransactionSignWeight(usdl);

        return transactionSignWeight;
    }


    public NewTransactionOuterClass.NewTransaction updateWitness(String ownerAddress, String updateUrl){
        ByteString bsAddress = parseAddress(ownerAddress);

        org.lgcy.Legacy.proto.Contract.WitnessUpdateContract  witnessUpdateContract= org.lgcy.Legacy.proto.Contract.WitnessUpdateContract.newBuilder()
                .setOwnerAddress(bsAddress)
                .setUpdateUrl(ByteString.copyFromUtf8(updateUrl)).build();

         NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.updateWitness(witnessUpdateContract);

        return newTransaction;
    }

    /**
     * Query transaction approvedList
     * @param usdlNum transaction object
     * @return TransactionApprovedList
     */
    public TransactionApprovedList getTransactionApprovedList(Transaction usdl)  {

        TransactionApprovedList transactionApprovedList = blockingStub.getTransactionApprovedList(usdl);

        return transactionApprovedList;
    }

    //All other solidified APIs start

    /**
     * Get solid account info by address
     * @param address address, default hexString
     * @return Account
     */
    public Account getAccountSolidity(String address) {
        ByteString bsAddress = parseAddress(address);
        AccountAddressMessage accountAddressMessage = AccountAddressMessage.newBuilder()
                .setAddress(bsAddress)
                .build();
        Account account = blockingStub.getAccount(accountAddressMessage);
        return account;
    }

    /**
     * Query the latest solid block information
     * @return BlockExtention
     * @throws IllegalException if fail to get now block
     */
    public BlockExtention getNowBlockSolidity() throws IllegalException {
        BlockExtention blockExtention = blockingStub.getNowBlock2(EmptyMessage.newBuilder().build());

        if(!blockExtention.hasBlockHeader()){
            throw new IllegalException("Fail to get latest block.");
        }
        return blockExtention;
    }



    //add new

    /**
     * Get transaction receipt info from a transaction id, must be in solid block
     * @param txID Transaction hash, i.e. transaction id
     * @return Transaction
     * @throws IllegalException if the parameters are not correct
     */
    public Transaction getTransactionByIdSolidity(String txID) throws IllegalException {
        ByteString bsTxid = parseAddress(txID);
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(bsTxid)
                .build();
        Transaction transaction = blockingStub.getTransactionById(request);

        if(transaction.getRetCount() == 0) {
            throw new IllegalException();
        }
        return transaction;
    }

    /**
     * Get the rewards that the voter has not received
     * @param address address, default hexString
     * @return NumberMessage
     */
    public NumberMessage getRewardSolidity(String address)  {
        ByteString bsAddress = parseAddress(address);
        BytesMessage bytesMessage = BytesMessage.newBuilder()
                .setValue(bsAddress)
                .build();
        NumberMessage numberMessage = blockingStub.getRewardInfo(bytesMessage);
        return numberMessage;
    }

    public static AccountUpdateContract createAccountUpdateContract(ByteString accountName,
                                                                    ByteString address) {
        AccountUpdateContract.Builder builder = AccountUpdateContract.newBuilder();
        builder.setAccountName(accountName);
        builder.setOwnerAddress(address);

        return builder.build();
    }

    public static AccountCreateContract createAccountCreateContract(
            ByteString owner, ByteString address) {
        AccountCreateContract.Builder builder = AccountCreateContract.newBuilder();
        builder.setOwnerAddress(owner);
        builder.setAccountAddress(address);
        return builder.build();
    }


    public NewTransactionOuterClass.NewTransaction createaccount(String owner_address, String account_address){
        ByteString ownerAddress = parseAddress(owner_address);
        ByteString accountAddress = parseAddress(account_address);

        AccountCreateContract accountCreateContract= AccountCreateContract.newBuilder()
                .setOwnerAddress(ownerAddress)
                .setAccountAddress(accountAddress).build();
        NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.createAccount(accountCreateContract);
        return newTransaction;
    }


    public static SetAccountIdContract createSetAccountIdContract(
            ByteString accountId, ByteString address) {
        SetAccountIdContract.Builder builder = SetAccountIdContract.newBuilder();
        builder.setAccountId(accountId);
        builder.setOwnerAddress(address);
        return builder.build();
    }


    public static UpdateAssetContract createUpdateAssetContract(
            ByteString address, ByteString description, ByteString url, long newLimit, long newPublicLimit) {
        UpdateAssetContract.Builder builder = UpdateAssetContract.newBuilder();
        builder.setDescription(description);
        builder.setUrl(url);
        builder.setNewLimit(newLimit);
        builder.setNewPublicLimit(newPublicLimit);
        builder.setOwnerAddress(address);

        return builder.build();
    }

    public static UnfreezeAssetContract createUnfreezeAssetContract(ByteString address) {

        UnfreezeAssetContract.Builder builder = UnfreezeAssetContract.newBuilder();
        builder.setOwnerAddress(address);
        return builder.build();
    }



    public long getBrokerageInfo(String address) {
        ByteString sr = parseAddress(address);
        BytesMessage param =
                BytesMessage.newBuilder()
                        .setValue(sr)
                        .build();
        return blockingStub.getBrokerageInfo(param).getNum();
    }

    public GrpcAPI.BrokerageMessage getBrokerage(String address) {

        GrpcAPI.InputBrokerage param =
                GrpcAPI.InputBrokerage.newBuilder()
                        .setAddress(address)
                        .build();
        GrpcAPI.BrokerageMessage brokerageMessage= blockingStub.getBrokerage(param);

        return brokerageMessage;
    }




    public NewTransactionOuterClass.NewTransaction updateBrokerage(String address, int brokerage){
        ByteString ownerAddr = parseAddress(address);
        UpdateBrokerageContract upContract =
                UpdateBrokerageContract.newBuilder()
                        .setOwnerAddress(ownerAddr)
                        .setBrokerage(brokerage)
                        .build();

          NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.updateBrokerage(upContract);
          return newTransaction;

    }



    public NewTransactionOuterClass.NewTransaction updateAccount(String address,String accountName){

        ByteString bsAddress = parseAddress(address);

        AccountUpdateContract.Builder builder = AccountUpdateContract.newBuilder();
        builder.setOwnerAddress(bsAddress);
        builder.setAccountName(ByteString.copyFromUtf8(accountName));


         NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.updateAccount(builder.build());
        return newTransaction;

    }




    public NewTransactionOuterClass.NewTransaction updateSetting(String onwerAddress, String contractAddress, long consumeUserResourcePercent){

        ByteString bsAddress = parseAddress(onwerAddress);
        ByteString conAddress = parseAddress(contractAddress);

        org.lgcy.Legacy.proto.Contract.UpdateSettingContract.Builder builder = org.lgcy.Legacy.proto.Contract.UpdateSettingContract.newBuilder();
        builder.setOwnerAddress(bsAddress);
        builder.setContractAddress(conAddress);
        builder.setConsumeUserResourcePercent(consumeUserResourcePercent);


       NewTransactionOuterClass.NewTransaction newTransaction= blockingStub.updateSetting(builder.build());
       return newTransaction;

    }





    /**
     * Obtain a {@code Contract} object via an address
     * @param contractAddress smart contract address
     * @return the smart contract obtained from the address
     * @throws Exception if contract address does not match
     */
    public SmartContract getContract(String contractAddress) {
        ByteString rawAddr = parseAddress(contractAddress);
        BytesMessage param =
                BytesMessage.newBuilder()
                        .setValue(rawAddr)
                        .build();

        SmartContract cntr = blockingStub.getContract(param);


        Contract contract =
                new Contract.Builder()
                        .setOriginAddr(ByteString.copyFromUtf8(cntr.getOriginAddress()))
                        .setCntrAddr(ByteString.copyFromUtf8(cntr.getContractAddress()))
                        .setBytecode(ByteString.copyFromUtf8(cntr.getBytecode()))
                        .setName(cntr.getName())
                        .setAbi(cntr.getAbi())
                        .setOriginEnergyLimit(cntr.getOriginEnergyLimit())
                        .setConsumeUserResourcePercent(cntr.getConsumeUserResourcePercent())
                        .build();


        return cntr;
    }

    /**
     * Check whether a given method is in the contract.
     * @param cntr the smart contract.
     * @param function the smart contract function.
     * @return ture if function exists in the contract.
     */
    private boolean isFuncInContract(Contract cntr, Function function) {
        List<ContractFunction> functions = cntr.getFunctions();
        for (int i = 0; i < functions.size(); i++) {
            if (functions.get(i).getName().equalsIgnoreCase(function.getName())) {
                return true;
            }
        }
        return false;
    }



    public NewTransactionOuterClass.TransactionExtention2 triggerconstantcontract(String address, String contract_address, String function_selector, String parameter){
        ByteString rawAddr = parseAddress(address);
        ByteString contractAddress = parseAddress(contract_address);
        TriggerSmartContract triggerSmartContract = TriggerSmartContract.newBuilder()
                .setOwnerAddress(rawAddr)
                .setContractAddress(contractAddress)
                .setFunctionSelector(function_selector)
                .setParameter(ByteString.fromHex(parameter)).build();
        NewTransactionOuterClass.TransactionExtention2 transactionExtention2 = blockingStub.triggerConstantContract2(triggerSmartContract);
     return transactionExtention2;
    }

    /**
     * call function without signature and broadcasting
     * @param ownerAddr the caller
     * @param cntr the contract
     * @param function the function called
     * @return TransactionExtention
     */
    private TransactionExtention callWithoutBroadcast(String ownerAddr, Contract cntr, Function function) {
        cntr.setOwnerAddr(parseAddress(ownerAddr));
        String encodedHex = FunctionEncoder.encode(function);
        // Make a TriggerSmartContract contract
        TriggerSmartContract trigger =
                TriggerSmartContract.newBuilder()
                        .setOwnerAddress(cntr.getOwnerAddr())
                        .setContractAddress(cntr.getCntrAddr())
                        .setData(parseHex(encodedHex))
                        .build();


        TransactionExtention txnExt = blockingStub.triggerConstantContract(trigger);

        return txnExt;
    }








}