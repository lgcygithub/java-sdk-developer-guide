package org.lgcy.Legacy.core.transaction;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import org.lgcy.Legacy.core.utils.ByteArray;
import org.lgcy.Legacy.proto.Chain;
import org.lgcy.Legacy.proto.Contract;

import static org.lgcy.Legacy.core.ApiWrapper.toHex;

public class TransactionCapsule {

  public TransactionCapsule(com.google.protobuf.Message message, Chain.Transaction.Contract.ContractType contractType) throws InvalidProtocolBufferException {
    System.out.println("message"+message);
    Chain.Transaction.raw.Builder transactionBuilder = Chain.Transaction.raw.newBuilder().addContract(
        Chain.Transaction.Contract.newBuilder().setType(contractType).setParameter(
            (message instanceof Any ? (Any) message : Any.pack(message))).build());
     // Any any = Any.parseFrom(transactionBuilder.getContractBuilderList().listIterator().next().getParameter().getValue());

    // Deserialize the Any object to TransferContract
    Contract.TransferContract transferContract = transactionBuilder.getContractBuilderList().listIterator().next().getParameter().unpack(Contract.TransferContract.class);
    System.out.println("transferContract"+transferContract);
    System.out.println("Hex"+toHex(transactionBuilder.getContractBuilderList().listIterator().next().getParameter().getValue()));
    System.out.println("input"+transactionBuilder.getContractBuilderList().listIterator().next().getParameter().getValue());
    transaction = Chain.Transaction.newBuilder().setRawData(transactionBuilder.build()).build();

  }

  private Chain.Transaction transaction;

  private boolean isVerified = false;

  private long blockNum = -1;


  private long time;

  private long order;

  private boolean isTransactionCreate = false;

  public boolean isTransactionCreate() {
    return isTransactionCreate;
  }

  public void setTransactionCreate(boolean transactionCreate) {
    isTransactionCreate = transactionCreate;
  }


  public Chain.Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Chain.Transaction transaction) {
    this.transaction = transaction;
  }

  public boolean isVerified() {
    return isVerified;
  }

  public void setVerified(boolean verified) {
    isVerified = verified;
  }

  public long getBlockNum() {
    return blockNum;
  }

  public void setBlockNum(long blockNum) {
    this.blockNum = blockNum;
  }

  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }

  public long getOrder() {
    return order;
  }

  public void setOrder(long order) {
    this.order = order;
  }

  public void setReference(long blockNum, byte[] blockHash) {
    byte[] refBlockNum = ByteArray.fromLong(blockNum);
    Chain.Transaction.raw rawData = this.transaction.getRawData().toBuilder()
        .setRefBlockHash(ByteString.copyFrom(ByteArray.subArray(blockHash, 8, 16)))
        .setRefBlockBytes(ByteString.copyFrom(ByteArray.subArray(refBlockNum, 6, 8)))
        .build();
    this.transaction = this.transaction.toBuilder().setRawData(rawData).build();
  }

  public void setExpiration(long expiration) {
    Chain.Transaction.raw rawData = this.transaction.getRawData().toBuilder().setExpiration(expiration)
        .build();
    this.transaction = this.transaction.toBuilder().setRawData(rawData).build();
  }

  public void setTimestamp() {
    Chain.Transaction.raw rawData = this.transaction.getRawData().toBuilder()
        .setTimestamp(System.currentTimeMillis())
        .build();
    this.transaction = this.transaction.toBuilder().setRawData(rawData).build();
  }
}
