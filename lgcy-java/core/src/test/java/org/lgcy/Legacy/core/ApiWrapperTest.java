package org.lgcy.Legacy.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.bouncycastle.util.encoders.Hex;
import org.junit.jupiter.api.Test;
import org.lgcy.Legacy.abi.FunctionEncoder;
import org.lgcy.Legacy.abi.TypeReference;
import org.lgcy.Legacy.abi.datatypes.Address;
import org.lgcy.Legacy.abi.datatypes.Bool;
import org.lgcy.Legacy.abi.datatypes.Function;
import org.lgcy.Legacy.abi.datatypes.generated.Uint256;
import org.lgcy.Legacy.proto.Chain;
import org.lgcy.Legacy.proto.Contract;
//import org.lgcy.Legacy.proto.Response;

import java.math.BigInteger;
import java.util.Arrays;

public class ApiWrapperTest {
//    @Test
//    public void testGetNowBlockQuery() {
//        ApiWrapper client = ApiWrapper.ofShasta("3333333333333333333333333333333333333333333333333333333333333333");
//        BlockExtention block = client.blockingStub.getNowBlock2(EmptyMessage.newBuilder().build());
//
//        System.out.println(block.getBlockHeader());
//        assertTrue(block.getBlockHeader().getRawDataOrBuilder().getNumber() > 0);
//    }

//    @Test
//    public void testSendTrc20Transaction() {
//        ApiWrapper client = ApiWrapper.testNet("b9f6ec3929cc21f9b40291e2bf3dcf8adec68a0b2520e3386d4088856136008d");
//
//        // transfer(address,uint256) returns (bool)
//        Function trc20Transfer = new Function("transfer",
//            Arrays.asList(new Address("LfRmBzrQn7tnsJ5zNnq2BXtvVD8Pqv3ZPX"),
//                new Uint256(BigInteger.valueOf(10).multiply(BigInteger.valueOf(10).pow(18)))),
//            Arrays.asList(new TypeReference<Bool>() {}));
//
//        String encodedHex = FunctionEncoder.encode(trc20Transfer);
//
//        Contract.TriggerSmartContract trigger =
//            Contract.TriggerSmartContract.newBuilder()
//                .setOwnerAddress(ApiWrapper.parseAddress("LfRmBzrQn7tnsJ5zNnq2BXtvVD8Pqv3ZPX"))
//                .setContractAddress(ApiWrapper.parseAddress("TF17BgPaZYbz8oxbjhriubPDsA7ArKoLX3"))
//                .setData(ApiWrapper.parseHex(encodedHex))
//                .build();
//
//        System.out.println("trigger:\n" + trigger);
//
//        Response.TransactionExtention txnExt = client.blockingStub.triggerContract(trigger);
//        System.out.println("txn id => " + Hex.toHexString(txnExt.getTxid().toByteArray()));
//
//        Chain.Transaction signedTxn = client.signTransaction(txnExt);
//
//        System.out.println(signedTxn.toString());
//        Response.TransactionReturn ret = client.blockingStub.broadcastTransaction(signedTxn);
//        System.out.println("======== Result ========\n" + ret.toString());
//    }

    @Test
    public void testGenerateAddress() {
        ApiWrapper.generateAddress();
    }
}
