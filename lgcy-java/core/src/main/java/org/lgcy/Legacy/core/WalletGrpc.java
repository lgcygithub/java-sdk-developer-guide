package org.lgcy.Legacy.core;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.31.0)",
        comments = "Source: api/api.proto")
public final class WalletGrpc {

  private WalletGrpc() {}

  public static final String SERVICE_NAME = "protocol.Wallet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction,
          org.lgcy.Legacy.proto.Response.TransactionReturn> getBroadcastTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "BroadcastTransaction",
          requestType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionReturn.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction,
          org.lgcy.Legacy.proto.Response.TransactionReturn> getBroadcastTransactionMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction, org.lgcy.Legacy.proto.Response.TransactionReturn> getBroadcastTransactionMethod;
    if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
          WalletGrpc.getBroadcastTransactionMethod = getBroadcastTransactionMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Chain.Transaction, org.lgcy.Legacy.proto.Response.TransactionReturn>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BroadcastTransaction"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionReturn.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BroadcastTransaction"))
                          .build();
        }
      }
    }
    return getBroadcastTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction,
          org.lgcy.Legacy.proto.Chain.TransactionReturnData> getBroadcastTransactionDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "BroadcastTransactionData",
          requestType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          responseType = org.lgcy.Legacy.proto.Chain.TransactionReturnData.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction,
          org.lgcy.Legacy.proto.Chain.TransactionReturnData> getBroadcastTransactionDataMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction, org.lgcy.Legacy.proto.Chain.TransactionReturnData> getBroadcastTransactionDataMethod;
    if ((getBroadcastTransactionDataMethod = WalletGrpc.getBroadcastTransactionDataMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBroadcastTransactionDataMethod = WalletGrpc.getBroadcastTransactionDataMethod) == null) {
          WalletGrpc.getBroadcastTransactionDataMethod = getBroadcastTransactionDataMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction, org.lgcy.Legacy.proto.Chain.TransactionReturnData>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BroadcastTransactionData"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.TransactionReturnData.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BroadcastTransactionData"))
                          .build();
        }
      }
    }
    return getBroadcastTransactionDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getCreateCommonTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateCommonTransaction",
          requestType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getCreateCommonTransactionMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction, org.lgcy.Legacy.proto.Response.TransactionExtention> getCreateCommonTransactionMethod;
    if ((getCreateCommonTransactionMethod = WalletGrpc.getCreateCommonTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateCommonTransactionMethod = WalletGrpc.getCreateCommonTransactionMethod) == null) {
          WalletGrpc.getCreateCommonTransactionMethod = getCreateCommonTransactionMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Chain.Transaction, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCommonTransaction"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateCommonTransaction"))
                          .build();
        }
      }
    }
    return getCreateCommonTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountCreateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateAccount",
          requestType = org.lgcy.Legacy.proto.Contract.AccountCreateContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountCreateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountCreateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getCreateAccountMethod;
    if ((getCreateAccountMethod = WalletGrpc.getCreateAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAccountMethod = WalletGrpc.getCreateAccountMethod) == null) {
          WalletGrpc.getCreateAccountMethod = getCreateAccountMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.AccountCreateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.AccountCreateContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAccount"))
                          .build();
        }
      }
    }
    return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountCreateContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getCreateAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateAccount2",
          requestType = org.lgcy.Legacy.proto.Contract.AccountCreateContract.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountCreateContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getCreateAccount2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountCreateContract, org.lgcy.Legacy.proto.Response.TransactionExtention> getCreateAccount2Method;
    if ((getCreateAccount2Method = WalletGrpc.getCreateAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAccount2Method = WalletGrpc.getCreateAccount2Method) == null) {
          WalletGrpc.getCreateAccount2Method = getCreateAccount2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.AccountCreateContract, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.AccountCreateContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAccount2"))
                          .build();
        }
      }
    }
    return getCreateAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountUpdateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UpdateAccount",
          requestType = org.lgcy.Legacy.proto.Contract.AccountUpdateContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountUpdateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateAccountMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountUpdateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateAccountMethod;
    if ((getUpdateAccountMethod = WalletGrpc.getUpdateAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAccountMethod = WalletGrpc.getUpdateAccountMethod) == null) {
          WalletGrpc.getUpdateAccountMethod = getUpdateAccountMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.AccountUpdateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccount"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.AccountUpdateContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAccount"))
                          .build();
        }
      }
    }
    return getUpdateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.SetAccountIdContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getSetAccountIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "SetAccountId",
          requestType = org.lgcy.Legacy.proto.Contract.SetAccountIdContract.class,
          responseType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.SetAccountIdContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getSetAccountIdMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.SetAccountIdContract, org.lgcy.Legacy.proto.Chain.Transaction> getSetAccountIdMethod;
    if ((getSetAccountIdMethod = WalletGrpc.getSetAccountIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getSetAccountIdMethod = WalletGrpc.getSetAccountIdMethod) == null) {
          WalletGrpc.getSetAccountIdMethod = getSetAccountIdMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.SetAccountIdContract, org.lgcy.Legacy.proto.Chain.Transaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccountId"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.SetAccountIdContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("SetAccountId"))
                          .build();
        }
      }
    }
    return getSetAccountIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getAccountPermissionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "AccountPermissionUpdate",
          requestType = org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getAccountPermissionUpdateMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getAccountPermissionUpdateMethod;
    if ((getAccountPermissionUpdateMethod = WalletGrpc.getAccountPermissionUpdateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAccountPermissionUpdateMethod = WalletGrpc.getAccountPermissionUpdateMethod) == null) {
          WalletGrpc.getAccountPermissionUpdateMethod = getAccountPermissionUpdateMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountPermissionUpdate"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AccountPermissionUpdate"))
                          .build();
        }
      }
    }
    return getAccountPermissionUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TransferContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
          requestType = org.lgcy.Legacy.proto.Contract.TransferContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TransferContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TransferContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = WalletGrpc.getCreateTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateTransactionMethod = WalletGrpc.getCreateTransactionMethod) == null) {
          WalletGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.TransferContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.TransferContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateTransaction"))
                          .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getSignTransactionCreationMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "SignTransactionCreation",
          requestType = org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getSignTransactionCreationMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getSignTransactionCreationMethod;
    if ((getSignTransactionCreationMethod = WalletGrpc.getSignTransactionCreationMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getSignTransactionCreationMethod = WalletGrpc.getSignTransactionCreationMethod) == null) {
          WalletGrpc.getSignTransactionCreationMethod = getSignTransactionCreationMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignTransactionCreation"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("SignTransactionCreation"))
                          .build();
        }
      }
    }
    return getSignTransactionCreationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AssetIssueContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getCreateAssetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateAssetIssue",
          requestType = org.lgcy.Legacy.proto.Contract.AssetIssueContract.class,
          responseType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AssetIssueContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getCreateAssetIssueMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AssetIssueContract, org.lgcy.Legacy.proto.Chain.Transaction> getCreateAssetIssueMethod;
    if ((getCreateAssetIssueMethod = WalletGrpc.getCreateAssetIssueMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAssetIssueMethod = WalletGrpc.getCreateAssetIssueMethod) == null) {
          WalletGrpc.getCreateAssetIssueMethod = getCreateAssetIssueMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.AssetIssueContract, org.lgcy.Legacy.proto.Chain.Transaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAssetIssue"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.AssetIssueContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAssetIssue"))
                          .build();
        }
      }
    }
    return getCreateAssetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AssetIssueContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getCreateAssetIssue2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateAssetIssue2",
          requestType = org.lgcy.Legacy.proto.Contract.AssetIssueContract.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AssetIssueContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getCreateAssetIssue2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.AssetIssueContract, org.lgcy.Legacy.proto.Response.TransactionExtention> getCreateAssetIssue2Method;
    if ((getCreateAssetIssue2Method = WalletGrpc.getCreateAssetIssue2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAssetIssue2Method = WalletGrpc.getCreateAssetIssue2Method) == null) {
          WalletGrpc.getCreateAssetIssue2Method = getCreateAssetIssue2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.AssetIssueContract, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAssetIssue2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.AssetIssueContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAssetIssue2"))
                          .build();
        }
      }
    }
    return getCreateAssetIssue2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateAssetContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getUpdateAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UpdateAsset",
          requestType = org.lgcy.Legacy.proto.Contract.UpdateAssetContract.class,
          responseType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateAssetContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getUpdateAssetMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateAssetContract, org.lgcy.Legacy.proto.Chain.Transaction> getUpdateAssetMethod;
    if ((getUpdateAssetMethod = WalletGrpc.getUpdateAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAssetMethod = WalletGrpc.getUpdateAssetMethod) == null) {
          WalletGrpc.getUpdateAssetMethod = getUpdateAssetMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.UpdateAssetContract, org.lgcy.Legacy.proto.Chain.Transaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsset"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.UpdateAssetContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAsset"))
                          .build();
        }
      }
    }
    return getUpdateAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateAssetContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getUpdateAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UpdateAsset2",
          requestType = org.lgcy.Legacy.proto.Contract.UpdateAssetContract.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateAssetContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getUpdateAsset2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateAssetContract, org.lgcy.Legacy.proto.Response.TransactionExtention> getUpdateAsset2Method;
    if ((getUpdateAsset2Method = WalletGrpc.getUpdateAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAsset2Method = WalletGrpc.getUpdateAsset2Method) == null) {
          WalletGrpc.getUpdateAsset2Method = getUpdateAsset2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.UpdateAssetContract, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsset2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.UpdateAssetContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAsset2"))
                          .build();
        }
      }
    }
    return getUpdateAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TransferAssetContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "TransferAsset",
          requestType = org.lgcy.Legacy.proto.Contract.TransferAssetContract.class,
          responseType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TransferAssetContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getTransferAssetMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TransferAssetContract, org.lgcy.Legacy.proto.Chain.Transaction> getTransferAssetMethod;
    if ((getTransferAssetMethod = WalletGrpc.getTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTransferAssetMethod = WalletGrpc.getTransferAssetMethod) == null) {
          WalletGrpc.getTransferAssetMethod = getTransferAssetMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.TransferAssetContract, org.lgcy.Legacy.proto.Chain.Transaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferAsset"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.TransferAssetContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TransferAsset"))
                          .build();
        }
      }
    }
    return getTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TransferAssetContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getTransferAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "TransferAsset2",
          requestType = org.lgcy.Legacy.proto.Contract.TransferAssetContract.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TransferAssetContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getTransferAsset2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TransferAssetContract, org.lgcy.Legacy.proto.Response.TransactionExtention> getTransferAsset2Method;
    if ((getTransferAsset2Method = WalletGrpc.getTransferAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTransferAsset2Method = WalletGrpc.getTransferAsset2Method) == null) {
          WalletGrpc.getTransferAsset2Method = getTransferAsset2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.TransferAssetContract, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferAsset2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.TransferAssetContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TransferAsset2"))
                          .build();
        }
      }
    }
    return getTransferAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getParticipateAssetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ParticipateAssetIssue",
          requestType = org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract.class,
          responseType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getParticipateAssetIssueMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract, org.lgcy.Legacy.proto.Chain.Transaction> getParticipateAssetIssueMethod;
    if ((getParticipateAssetIssueMethod = WalletGrpc.getParticipateAssetIssueMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getParticipateAssetIssueMethod = WalletGrpc.getParticipateAssetIssueMethod) == null) {
          WalletGrpc.getParticipateAssetIssueMethod = getParticipateAssetIssueMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract, org.lgcy.Legacy.proto.Chain.Transaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParticipateAssetIssue"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ParticipateAssetIssue"))
                          .build();
        }
      }
    }
    return getParticipateAssetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getParticipateAssetIssue2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ParticipateAssetIssue2",
          requestType = org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getParticipateAssetIssue2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract, org.lgcy.Legacy.proto.Response.TransactionExtention> getParticipateAssetIssue2Method;
    if ((getParticipateAssetIssue2Method = WalletGrpc.getParticipateAssetIssue2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getParticipateAssetIssue2Method = WalletGrpc.getParticipateAssetIssue2Method) == null) {
          WalletGrpc.getParticipateAssetIssue2Method = getParticipateAssetIssue2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParticipateAssetIssue2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ParticipateAssetIssue2"))
                          .build();
        }
      }
    }
    return getParticipateAssetIssue2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getUnfreezeAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UnfreezeAsset",
          requestType = org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract.class,
          responseType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract,
          org.lgcy.Legacy.proto.Chain.Transaction> getUnfreezeAssetMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract, org.lgcy.Legacy.proto.Chain.Transaction> getUnfreezeAssetMethod;
    if ((getUnfreezeAssetMethod = WalletGrpc.getUnfreezeAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeAssetMethod = WalletGrpc.getUnfreezeAssetMethod) == null) {
          WalletGrpc.getUnfreezeAssetMethod = getUnfreezeAssetMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract, org.lgcy.Legacy.proto.Chain.Transaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeAsset"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeAsset"))
                          .build();
        }
      }
    }
    return getUnfreezeAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getUnfreezeAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UnfreezeAsset2",
          requestType = org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getUnfreezeAsset2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract, org.lgcy.Legacy.proto.Response.TransactionExtention> getUnfreezeAsset2Method;
    if ((getUnfreezeAsset2Method = WalletGrpc.getUnfreezeAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeAsset2Method = WalletGrpc.getUnfreezeAsset2Method) == null) {
          WalletGrpc.getUnfreezeAsset2Method = getUnfreezeAsset2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeAsset2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeAsset2"))
                          .build();
        }
      }
    }
    return getUnfreezeAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.WitnessCreateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getCreateWitnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateWitness",
          requestType = org.lgcy.Legacy.proto.Contract.WitnessCreateContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.WitnessCreateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getCreateWitnessMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.WitnessCreateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getCreateWitnessMethod;
    if ((getCreateWitnessMethod = WalletGrpc.getCreateWitnessMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitnessMethod = WalletGrpc.getCreateWitnessMethod) == null) {
          WalletGrpc.getCreateWitnessMethod = getCreateWitnessMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.WitnessCreateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWitness"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.WitnessCreateContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness"))
                          .build();
        }
      }
    }
    return getCreateWitnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.WitnessUpdateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateWitnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UpdateWitness",
          requestType = org.lgcy.Legacy.proto.Contract.WitnessUpdateContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.WitnessUpdateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateWitnessMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.WitnessUpdateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateWitnessMethod;
    if ((getUpdateWitnessMethod = WalletGrpc.getUpdateWitnessMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateWitnessMethod = WalletGrpc.getUpdateWitnessMethod) == null) {
          WalletGrpc.getUpdateWitnessMethod = getUpdateWitnessMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.WitnessUpdateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWitness"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.WitnessUpdateContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateWitness"))
                          .build();
        }
      }
    }
    return getUpdateWitnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateBrokerageMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UpdateBrokerage",
          requestType = org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateBrokerageMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateBrokerageMethod;
    if ((getUpdateBrokerageMethod = WalletGrpc.getUpdateBrokerageMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateBrokerageMethod = WalletGrpc.getUpdateBrokerageMethod) == null) {
          WalletGrpc.getUpdateBrokerageMethod = getUpdateBrokerageMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBrokerage"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateBrokerage"))
                          .build();
        }
      }
    }
    return getUpdateBrokerageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.VoteWitnessContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getVoteWitnessAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "VoteWitnessAccount",
          requestType = org.lgcy.Legacy.proto.Contract.VoteWitnessContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.VoteWitnessContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getVoteWitnessAccountMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.VoteWitnessContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getVoteWitnessAccountMethod;
    if ((getVoteWitnessAccountMethod = WalletGrpc.getVoteWitnessAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getVoteWitnessAccountMethod = WalletGrpc.getVoteWitnessAccountMethod) == null) {
          WalletGrpc.getVoteWitnessAccountMethod = getVoteWitnessAccountMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.VoteWitnessContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteWitnessAccount"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.VoteWitnessContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("VoteWitnessAccount"))
                          .build();
        }
      }
    }
    return getVoteWitnessAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.FreezeBalanceContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getFreezeBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "FreezeBalance",
          requestType = org.lgcy.Legacy.proto.Contract.FreezeBalanceContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.FreezeBalanceContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getFreezeBalanceMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.FreezeBalanceContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getFreezeBalanceMethod;
    if ((getFreezeBalanceMethod = WalletGrpc.getFreezeBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getFreezeBalanceMethod = WalletGrpc.getFreezeBalanceMethod) == null) {
          WalletGrpc.getFreezeBalanceMethod = getFreezeBalanceMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.FreezeBalanceContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FreezeBalance"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.FreezeBalanceContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("FreezeBalance"))
                          .build();
        }
      }
    }
    return getFreezeBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUnfreezeBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UnfreezeBalance",
          requestType = org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUnfreezeBalanceMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUnfreezeBalanceMethod;
    if ((getUnfreezeBalanceMethod = WalletGrpc.getUnfreezeBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeBalanceMethod = WalletGrpc.getUnfreezeBalanceMethod) == null) {
          WalletGrpc.getUnfreezeBalanceMethod = getUnfreezeBalanceMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeBalance"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeBalance"))
                          .build();
        }
      }
    }
    return getUnfreezeBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getWithdrawBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance",
          requestType = org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getWithdrawBalanceMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getWithdrawBalanceMethod;
    if ((getWithdrawBalanceMethod = WalletGrpc.getWithdrawBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalanceMethod = WalletGrpc.getWithdrawBalanceMethod) == null) {
          WalletGrpc.getWithdrawBalanceMethod = getWithdrawBalanceMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawBalance"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance"))
                          .build();
        }
      }
    }
    return getWithdrawBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateSettingContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UpdateSetting",
          requestType = org.lgcy.Legacy.proto.Contract.UpdateSettingContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateSettingContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateSettingMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.UpdateSettingContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getUpdateSettingMethod;
    if ((getUpdateSettingMethod = WalletGrpc.getUpdateSettingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateSettingMethod = WalletGrpc.getUpdateSettingMethod) == null) {
          WalletGrpc.getUpdateSettingMethod = getUpdateSettingMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.UpdateSettingContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSetting"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.UpdateSettingContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateSetting"))
                          .build();
        }
      }
    }
    return getUpdateSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ProposalCreateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getProposalCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ProposalCreate",
          requestType = org.lgcy.Legacy.proto.Contract.ProposalCreateContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ProposalCreateContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getProposalCreateMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ProposalCreateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getProposalCreateMethod;
    if ((getProposalCreateMethod = WalletGrpc.getProposalCreateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalCreateMethod = WalletGrpc.getProposalCreateMethod) == null) {
          WalletGrpc.getProposalCreateMethod = getProposalCreateMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.ProposalCreateContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalCreate"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.ProposalCreateContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalCreate"))
                          .build();
        }
      }
    }
    return getProposalCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ProposalApproveContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getProposalApproveMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ProposalApprove",
          requestType = org.lgcy.Legacy.proto.Contract.ProposalApproveContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ProposalApproveContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getProposalApproveMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ProposalApproveContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getProposalApproveMethod;
    if ((getProposalApproveMethod = WalletGrpc.getProposalApproveMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalApproveMethod = WalletGrpc.getProposalApproveMethod) == null) {
          WalletGrpc.getProposalApproveMethod = getProposalApproveMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.ProposalApproveContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalApprove"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.ProposalApproveContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalApprove"))
                          .build();
        }
      }
    }
    return getProposalApproveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ProposalDeleteContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getProposalDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ProposalDelete",
          requestType = org.lgcy.Legacy.proto.Contract.ProposalDeleteContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ProposalDeleteContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getProposalDeleteMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.ProposalDeleteContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getProposalDeleteMethod;
    if ((getProposalDeleteMethod = WalletGrpc.getProposalDeleteMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalDeleteMethod = WalletGrpc.getProposalDeleteMethod) == null) {
          WalletGrpc.getProposalDeleteMethod = getProposalDeleteMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.ProposalDeleteContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalDelete"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.ProposalDeleteContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalDelete"))
                          .build();
        }
      }
    }
    return getProposalDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.CreateSmartContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getDeployContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "DeployContract",
          requestType = org.lgcy.Legacy.proto.Contract.CreateSmartContract.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.CreateSmartContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getDeployContractMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.CreateSmartContract, org.lgcy.Legacy.proto.Response.TransactionExtention> getDeployContractMethod;
    if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
          WalletGrpc.getDeployContractMethod = getDeployContractMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.CreateSmartContract, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployContract"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.CreateSmartContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("DeployContract"))
                          .build();
        }
      }
    }
    return getDeployContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TriggerSmartContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getTriggerContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "TriggerContract",
          requestType = org.lgcy.Legacy.proto.Contract.TriggerSmartContract.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TriggerSmartContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getTriggerContractMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TriggerSmartContract, org.lgcy.Legacy.proto.Response.TransactionExtention> getTriggerContractMethod;
    if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
          WalletGrpc.getTriggerContractMethod = getTriggerContractMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.TriggerSmartContract, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerContract"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.TriggerSmartContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerContract"))
                          .build();
        }
      }
    }
    return getTriggerContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TriggerSmartContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getTriggerConstantContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "TriggerConstantContract",
          requestType = org.lgcy.Legacy.proto.Contract.TriggerSmartContract.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TriggerSmartContract,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getTriggerConstantContractMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TriggerSmartContract, org.lgcy.Legacy.proto.Response.TransactionExtention> getTriggerConstantContractMethod;
    if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
          WalletGrpc.getTriggerConstantContractMethod = getTriggerConstantContractMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.TriggerSmartContract, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerConstantContract"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.TriggerSmartContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerConstantContract"))
                          .build();
        }
      }
    }
    return getTriggerConstantContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TriggerSmartContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2> getTriggerConstantContract2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "TriggerConstantContract2",
          requestType = org.lgcy.Legacy.proto.Contract.TriggerSmartContract.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TriggerSmartContract,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2> getTriggerConstantContract2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Contract.TriggerSmartContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2> getTriggerConstantContract2Method;
    if ((getTriggerConstantContract2Method = WalletGrpc.getTriggerConstantContract2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerConstantContract2Method = WalletGrpc.getTriggerConstantContract2Method) == null) {
          WalletGrpc.getTriggerConstantContract2Method = getTriggerConstantContract2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Contract.TriggerSmartContract, org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerConstantContract2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.TriggerSmartContract.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerConstantContract2"))
                          .build();
        }
      }
    }
    return getTriggerConstantContract2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.NodeInfo> getGetNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetNodeInfo",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.NodeInfo.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.NodeInfo> getGetNodeInfoMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.NodeInfo> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
          WalletGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.NodeInfo>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodeInfo"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.NodeInfo.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNodeInfo"))
                          .build();
        }
      }
    }
    return getGetNodeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.NodeList> getListNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ListNodes",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.NodeList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.NodeList> getListNodesMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.NodeList> getListNodesMethod;
    if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
          WalletGrpc.getListNodesMethod = getListNodesMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.NodeList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNodes"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.NodeList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListNodes"))
                          .build();
        }
      }
    }
    return getListNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.ChainParameters> getGetChainParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetChainParameters",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.ChainParameters.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.ChainParameters> getGetChainParametersMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.ChainParameters> getGetChainParametersMethod;
    if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
          WalletGrpc.getGetChainParametersMethod = getGetChainParametersMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.ChainParameters>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChainParameters"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.ChainParameters.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetChainParameters"))
                          .build();
        }
      }
    }
    return getGetChainParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getTotalTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "TotalTransaction",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.api.GrpcAPI.NumberMessage.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getTotalTransactionMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getTotalTransactionMethod;
    if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
          WalletGrpc.getTotalTransactionMethod = getTotalTransactionMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.api.GrpcAPI.NumberMessage>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalTransaction"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TotalTransaction"))
                          .build();
        }
      }
    }
    return getTotalTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetNextMaintenanceTime",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.api.GrpcAPI.NumberMessage.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;
    if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
          WalletGrpc.getGetNextMaintenanceTimeMethod = getGetNextMaintenanceTimeMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.api.GrpcAPI.NumberMessage>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextMaintenanceTime"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNextMaintenanceTime"))
                          .build();
        }
      }
    }
    return getGetNextMaintenanceTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction,
          org.lgcy.Legacy.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionSignWeight",
          requestType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionSignWeight.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction,
          org.lgcy.Legacy.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction, org.lgcy.Legacy.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod;
    if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
          WalletGrpc.getGetTransactionSignWeightMethod = getGetTransactionSignWeightMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Chain.Transaction, org.lgcy.Legacy.proto.Response.TransactionSignWeight>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSignWeight"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionSignWeight.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSignWeight"))
                          .build();
        }
      }
    }
    return getGetTransactionSignWeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction,
          org.lgcy.Legacy.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionApprovedList",
          requestType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionApprovedList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction,
          org.lgcy.Legacy.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Chain.Transaction, org.lgcy.Legacy.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod;
    if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
          WalletGrpc.getGetTransactionApprovedListMethod = getGetTransactionApprovedListMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Chain.Transaction, org.lgcy.Legacy.proto.Response.TransactionApprovedList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionApprovedList"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionApprovedList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionApprovedList"))
                          .build();
        }
      }
    }
    return getGetTransactionApprovedListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
          org.lgcy.Legacy.proto.Response.Account> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetAccount",
          requestType = org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.Account.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
          org.lgcy.Legacy.proto.Response.Account> getGetAccountMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage, org.lgcy.Legacy.proto.Response.Account> getGetAccountMethod;
    if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
          WalletGrpc.getGetAccountMethod = getGetAccountMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage, org.lgcy.Legacy.proto.Response.Account>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.Account.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccount"))
                          .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage,
          org.lgcy.Legacy.proto.Response.Account> getGetAccountByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetAccountById",
          requestType = org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.Account.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage,
          org.lgcy.Legacy.proto.Response.Account> getGetAccountByIdMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage, org.lgcy.Legacy.proto.Response.Account> getGetAccountByIdMethod;
    if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
          WalletGrpc.getGetAccountByIdMethod = getGetAccountByIdMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage, org.lgcy.Legacy.proto.Response.Account>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountById"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.Account.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountById"))
                          .build();
        }
      }
    }
    return getGetAccountByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
          org.lgcy.Legacy.proto.Response.AccountNetMessage> getGetAccountNetMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetAccountNet",
          requestType = org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.AccountNetMessage.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
          org.lgcy.Legacy.proto.Response.AccountNetMessage> getGetAccountNetMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage, org.lgcy.Legacy.proto.Response.AccountNetMessage> getGetAccountNetMethod;
    if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
          WalletGrpc.getGetAccountNetMethod = getGetAccountNetMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage, org.lgcy.Legacy.proto.Response.AccountNetMessage>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountNet"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.AccountNetMessage.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountNet"))
                          .build();
        }
      }
    }
    return getGetAccountNetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
          org.lgcy.Legacy.proto.Response.AccountResourceMessage> getGetAccountResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetAccountResource",
          requestType = org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.AccountResourceMessage.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
          org.lgcy.Legacy.proto.Response.AccountResourceMessage> getGetAccountResourceMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage, org.lgcy.Legacy.proto.Response.AccountResourceMessage> getGetAccountResourceMethod;
    if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
          WalletGrpc.getGetAccountResourceMethod = getGetAccountResourceMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage, org.lgcy.Legacy.proto.Response.AccountResourceMessage>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountResource"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.AccountResourceMessage.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountResource"))
                          .build();
        }
      }
    }
    return getGetAccountResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
          org.lgcy.Legacy.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByAccount",
          requestType = org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.AssetIssueList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
          org.lgcy.Legacy.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage, org.lgcy.Legacy.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod;
    if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
          WalletGrpc.getGetAssetIssueByAccountMethod = getGetAssetIssueByAccountMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage, org.lgcy.Legacy.proto.Response.AssetIssueList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByAccount"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.AssetIssueList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByAccount"))
                          .build();
        }
      }
    }
    return getGetAssetIssueByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByName",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.proto.Contract.AssetIssueContract.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod;
    if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueByNameMethod = getGetAssetIssueByNameMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Contract.AssetIssueContract>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByName"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.AssetIssueContract.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByName"))
                          .build();
        }
      }
    }
    return getGetAssetIssueByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueListByName",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.AssetIssueList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod;
    if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueListByNameMethod = getGetAssetIssueListByNameMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Response.AssetIssueList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueListByName"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.AssetIssueList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueListByName"))
                          .build();
        }
      }
    }
    return getGetAssetIssueListByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueById",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.proto.Contract.AssetIssueContract.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod;
    if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
          WalletGrpc.getGetAssetIssueByIdMethod = getGetAssetIssueByIdMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Contract.AssetIssueContract>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueById"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Contract.AssetIssueContract.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueById"))
                          .build();
        }
      }
    }
    return getGetAssetIssueByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.AssetIssueList> getGetAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueList",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.AssetIssueList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.AssetIssueList> getGetAssetIssueListMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.AssetIssueList> getGetAssetIssueListMethod;
    if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
          WalletGrpc.getGetAssetIssueListMethod = getGetAssetIssueListMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.AssetIssueList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueList"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.AssetIssueList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueList"))
                          .build();
        }
      }
    }
    return getGetAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage,
          org.lgcy.Legacy.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetPaginatedAssetIssueList",
          requestType = org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.AssetIssueList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage,
          org.lgcy.Legacy.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage, org.lgcy.Legacy.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod;
    if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
          WalletGrpc.getGetPaginatedAssetIssueListMethod = getGetPaginatedAssetIssueListMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage, org.lgcy.Legacy.proto.Response.AssetIssueList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedAssetIssueList"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.AssetIssueList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedAssetIssueList"))
                          .build();
        }
      }
    }
    return getGetPaginatedAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Chain.Block> getGetNowBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetNowBlock",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.proto.Chain.Block.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Chain.Block> getGetNowBlockMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Chain.Block> getGetNowBlockMethod;
    if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
          WalletGrpc.getGetNowBlockMethod = getGetNowBlockMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Chain.Block>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Block.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock"))
                          .build();
        }
      }
    }
    return getGetNowBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.BlockExtention> getGetNowBlock2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetNowBlock2",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.BlockExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.BlockExtention> getGetNowBlock2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.BlockExtention> getGetNowBlock2Method;
    if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
          WalletGrpc.getGetNowBlock2Method = getGetNowBlock2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.BlockExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.BlockExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock2"))
                          .build();
        }
      }
    }
    return getGetNowBlock2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.proto.Chain.Block> getGetBlockByNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum",
          requestType = org.lgcy.Legacy.api.GrpcAPI.NumberMessage.class,
          responseType = org.lgcy.Legacy.proto.Chain.Block.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.proto.Chain.Block> getGetBlockByNumMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.proto.Chain.Block> getGetBlockByNumMethod;
    if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
          WalletGrpc.getGetBlockByNumMethod = getGetBlockByNumMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.proto.Chain.Block>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Block.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum"))
                          .build();
        }
      }
    }
    return getGetBlockByNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.proto.Response.BlockExtention> getGetBlockByNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum2",
          requestType = org.lgcy.Legacy.api.GrpcAPI.NumberMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.BlockExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.proto.Response.BlockExtention> getGetBlockByNum2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.proto.Response.BlockExtention> getGetBlockByNum2Method;
    if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
          WalletGrpc.getGetBlockByNum2Method = getGetBlockByNum2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.proto.Response.BlockExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.BlockExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum2"))
                          .build();
        }
      }
    }
    return getGetBlockByNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Chain.Block> getGetBlockByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetBlockById",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.proto.Chain.Block.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Chain.Block> getGetBlockByIdMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Chain.Block> getGetBlockByIdMethod;
    if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
          WalletGrpc.getGetBlockByIdMethod = getGetBlockByIdMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Chain.Block>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockById"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Block.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockById"))
                          .build();
        }
      }
    }
    return getGetBlockByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BlockLimit,
          org.lgcy.Legacy.proto.Response.BlockList> getGetBlockByLimitNextMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BlockLimit.class,
          responseType = org.lgcy.Legacy.proto.Response.BlockList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BlockLimit,
          org.lgcy.Legacy.proto.Response.BlockList> getGetBlockByLimitNextMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BlockLimit, org.lgcy.Legacy.proto.Response.BlockList> getGetBlockByLimitNextMethod;
    if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
          WalletGrpc.getGetBlockByLimitNextMethod = getGetBlockByLimitNextMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BlockLimit, org.lgcy.Legacy.proto.Response.BlockList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BlockLimit.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.BlockList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext"))
                          .build();
        }
      }
    }
    return getGetBlockByLimitNextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BlockLimit,
          org.lgcy.Legacy.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext2",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BlockLimit.class,
          responseType = org.lgcy.Legacy.proto.Response.BlockListExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BlockLimit,
          org.lgcy.Legacy.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BlockLimit, org.lgcy.Legacy.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method;
    if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
          WalletGrpc.getGetBlockByLimitNext2Method = getGetBlockByLimitNext2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BlockLimit, org.lgcy.Legacy.proto.Response.BlockListExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BlockLimit.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.BlockListExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext2"))
                          .build();
        }
      }
    }
    return getGetBlockByLimitNext2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.proto.Response.BlockList> getGetBlockByLatestNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum",
          requestType = org.lgcy.Legacy.api.GrpcAPI.NumberMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.BlockList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.proto.Response.BlockList> getGetBlockByLatestNumMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.proto.Response.BlockList> getGetBlockByLatestNumMethod;
    if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
          WalletGrpc.getGetBlockByLatestNumMethod = getGetBlockByLatestNumMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.proto.Response.BlockList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.BlockList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum"))
                          .build();
        }
      }
    }
    return getGetBlockByLatestNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum2",
          requestType = org.lgcy.Legacy.api.GrpcAPI.NumberMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.BlockListExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method;
    if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
          WalletGrpc.getGetBlockByLatestNum2Method = getGetBlockByLatestNum2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.proto.Response.BlockListExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.BlockListExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum2"))
                          .build();
        }
      }
    }
    return getGetBlockByLatestNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum> getGetTransactionCountByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionCountByBlockNum",
          requestType = org.lgcy.Legacy.api.GrpcAPI.NumberMessage.class,
          responseType = org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum> getGetTransactionCountByBlockNumMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum> getGetTransactionCountByBlockNumMethod;
    if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionCountByBlockNumMethod = getGetTransactionCountByBlockNumMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionCountByBlockNum"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionCountByBlockNum"))
                          .build();
        }
      }
    }
    return getGetTransactionCountByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Chain.Transaction> getGetTransactionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionById",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Chain.Transaction> getGetTransactionByIdMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Chain.Transaction> getGetTransactionByIdMethod;
    if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
          WalletGrpc.getGetTransactionByIdMethod = getGetTransactionByIdMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Chain.Transaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionById"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionById"))
                          .build();
        }
      }
    }
    return getGetTransactionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getGetTransactionById3Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionById3",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getGetTransactionById3Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getGetTransactionById3Method;
    if ((getGetTransactionById3Method = WalletGrpc.getGetTransactionById3Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionById3Method = WalletGrpc.getGetTransactionById3Method) == null) {
          WalletGrpc.getGetTransactionById3Method = getGetTransactionById3Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionById3"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionById3"))
                          .build();
        }
      }
    }
    return getGetTransactionById3Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoById",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionInfo.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod;
    if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
          WalletGrpc.getGetTransactionInfoByIdMethod = getGetTransactionInfoByIdMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Response.TransactionInfo>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoById"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionInfo.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoById"))
                          .build();
        }
      }
    }
    return getGetTransactionInfoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoByBlockNum",
          requestType = org.lgcy.Legacy.api.GrpcAPI.NumberMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionInfoList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
          org.lgcy.Legacy.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;
    if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionInfoByBlockNumMethod = getGetTransactionInfoByBlockNumMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.NumberMessage, org.lgcy.Legacy.proto.Response.TransactionInfoList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoByBlockNum"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionInfoList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoByBlockNum"))
                          .build();
        }
      }
    }
    return getGetTransactionInfoByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Common.SmartContract> getGetContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetContract",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.proto.Common.SmartContract.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Common.SmartContract> getGetContractMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Common.SmartContract> getGetContractMethod;
    if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
          WalletGrpc.getGetContractMethod = getGetContractMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Common.SmartContract>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContract"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Common.SmartContract.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContract"))
                          .build();
        }
      }
    }
    return getGetContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetContractInfo",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.SmartContractDataWrapper.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod;
    if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
          WalletGrpc.getGetContractInfoMethod = getGetContractInfoMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Response.SmartContractDataWrapper>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContractInfo"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.SmartContractDataWrapper.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContractInfo"))
                          .build();
        }
      }
    }
    return getGetContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.WitnessList> getListWitnessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ListWitnesses",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.WitnessList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.WitnessList> getListWitnessesMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.WitnessList> getListWitnessesMethod;
    if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
          WalletGrpc.getListWitnessesMethod = getListWitnessesMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.WitnessList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWitnesses"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.WitnessList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListWitnesses"))
                          .build();
        }
      }
    }
    return getListWitnessesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetBrokerageInfo",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.api.GrpcAPI.NumberMessage.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;
    if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
          WalletGrpc.getGetBrokerageInfoMethod = getGetBrokerageInfoMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.api.GrpcAPI.NumberMessage>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrokerageInfo"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBrokerageInfo"))
                          .build();
        }
      }
    }
    return getGetBrokerageInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.InputBrokerage,
          org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage> getGetBrokerageMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetBrokerage",
          requestType = org.lgcy.Legacy.api.GrpcAPI.InputBrokerage.class,
          responseType = org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.InputBrokerage,
          org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage> getGetBrokerageMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.InputBrokerage, org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage> getGetBrokerageMethod;
    if ((getGetBrokerageMethod = WalletGrpc.getGetBrokerageMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBrokerageMethod = WalletGrpc.getGetBrokerageMethod) == null) {
          WalletGrpc.getGetBrokerageMethod = getGetBrokerageMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.InputBrokerage, org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrokerage"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.InputBrokerage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBrokerage"))
                          .build();
        }
      }
    }
    return getGetBrokerageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetRewardInfo",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.api.GrpcAPI.NumberMessage.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod;
    if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
          WalletGrpc.getGetRewardInfoMethod = getGetRewardInfoMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.api.GrpcAPI.NumberMessage>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRewardInfo"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRewardInfo"))
                          .build();
        }
      }
    }
    return getGetRewardInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.RewardMessage,
          org.lgcy.Legacy.api.GrpcAPI.RewardOutput> getGetRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetReward",
          requestType = org.lgcy.Legacy.api.GrpcAPI.RewardMessage.class,
          responseType = org.lgcy.Legacy.api.GrpcAPI.RewardOutput.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.RewardMessage,
          org.lgcy.Legacy.api.GrpcAPI.RewardOutput> getGetRewardMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.RewardMessage, org.lgcy.Legacy.api.GrpcAPI.RewardOutput> getGetRewardMethod;
    if ((getGetRewardMethod = WalletGrpc.getGetRewardMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRewardMethod = WalletGrpc.getGetRewardMethod) == null) {
          WalletGrpc.getGetRewardMethod = getGetRewardMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.RewardMessage, org.lgcy.Legacy.api.GrpcAPI.RewardOutput>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReward"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.RewardMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.RewardOutput.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetReward"))
                          .build();
        }
      }
    }
    return getGetRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.ProposalList> getListProposalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ListProposals",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.ProposalList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.ProposalList> getListProposalsMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.ProposalList> getListProposalsMethod;
    if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
          WalletGrpc.getListProposalsMethod = getListProposalsMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.ProposalList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProposals"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.ProposalList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListProposals"))
                          .build();
        }
      }
    }
    return getListProposalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.ProposalInput,
          org.lgcy.Legacy.proto.Response.Proposal> getGetProposalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetProposalById",
          requestType = org.lgcy.Legacy.api.GrpcAPI.ProposalInput.class,
          responseType = org.lgcy.Legacy.proto.Response.Proposal.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.ProposalInput,
          org.lgcy.Legacy.proto.Response.Proposal> getGetProposalByIdMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.ProposalInput, org.lgcy.Legacy.proto.Response.Proposal> getGetProposalByIdMethod;
    if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
          WalletGrpc.getGetProposalByIdMethod = getGetProposalByIdMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.ProposalInput, org.lgcy.Legacy.proto.Response.Proposal>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProposalById"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.ProposalInput.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.Proposal.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetProposalById"))
                          .build();
        }
      }
    }
    return getGetProposalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage,
          org.lgcy.Legacy.proto.Response.ProposalList> getGetPaginatedProposalListMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetPaginatedProposalList",
          requestType = org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.ProposalList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage,
          org.lgcy.Legacy.proto.Response.ProposalList> getGetPaginatedProposalListMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage, org.lgcy.Legacy.proto.Response.ProposalList> getGetPaginatedProposalListMethod;
    if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
          WalletGrpc.getGetPaginatedProposalListMethod = getGetPaginatedProposalListMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage, org.lgcy.Legacy.proto.Response.ProposalList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedProposalList"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.ProposalList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedProposalList"))
                          .build();
        }
      }
    }
    return getGetPaginatedProposalListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Response.Exchange> getGetExchangeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetExchangeById",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.Exchange.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.proto.Response.Exchange> getGetExchangeByIdMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Response.Exchange> getGetExchangeByIdMethod;
    if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
          WalletGrpc.getGetExchangeByIdMethod = getGetExchangeByIdMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.proto.Response.Exchange>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExchangeById"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.Exchange.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExchangeById"))
                          .build();
        }
      }
    }
    return getGetExchangeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage,
          org.lgcy.Legacy.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetPaginatedExchangeList",
          requestType = org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.ExchangeList.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage,
          org.lgcy.Legacy.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage, org.lgcy.Legacy.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod;
    if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
          WalletGrpc.getGetPaginatedExchangeListMethod = getGetPaginatedExchangeListMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage, org.lgcy.Legacy.proto.Response.ExchangeList>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedExchangeList"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.ExchangeList.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedExchangeList"))
                          .build();
        }
      }
    }
    return getGetPaginatedExchangeListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Response.TransactionSign,
          org.lgcy.Legacy.proto.Chain.Transaction> getGetTransactionSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign",
          requestType = org.lgcy.Legacy.proto.Response.TransactionSign.class,
          responseType = org.lgcy.Legacy.proto.Chain.Transaction.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Response.TransactionSign,
          org.lgcy.Legacy.proto.Chain.Transaction> getGetTransactionSignMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Response.TransactionSign, org.lgcy.Legacy.proto.Chain.Transaction> getGetTransactionSignMethod;
    if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
          WalletGrpc.getGetTransactionSignMethod = getGetTransactionSignMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Response.TransactionSign, org.lgcy.Legacy.proto.Chain.Transaction>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSign"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionSign.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Chain.Transaction.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign"))
                          .build();
        }
      }
    }
    return getGetTransactionSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Response.TransactionSign,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getGetTransactionSign2Method;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign2",
          requestType = org.lgcy.Legacy.proto.Response.TransactionSign.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Response.TransactionSign,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getGetTransactionSign2Method() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Response.TransactionSign, org.lgcy.Legacy.proto.Response.TransactionExtention> getGetTransactionSign2Method;
    if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
          WalletGrpc.getGetTransactionSign2Method = getGetTransactionSign2Method =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Response.TransactionSign, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSign2"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionSign.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign2"))
                          .build();
        }
      }
    }
    return getGetTransactionSign2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage,
          org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "EasyTransferAsset",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.EasyTransferResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage,
          org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage, org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod;
    if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
          WalletGrpc.getEasyTransferAssetMethod = getEasyTransferAssetMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage, org.lgcy.Legacy.proto.Response.EasyTransferResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferAsset"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.EasyTransferResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAsset"))
                          .build();
        }
      }
    }
    return getEasyTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
          org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "EasyTransferAssetByPrivate",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.EasyTransferResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
          org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage, org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod;
    if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferAssetByPrivateMethod = getEasyTransferAssetByPrivateMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage, org.lgcy.Legacy.proto.Response.EasyTransferResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferAssetByPrivate"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.EasyTransferResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAssetByPrivate"))
                          .build();
        }
      }
    }
    return getEasyTransferAssetByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage,
          org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "EasyTransfer",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.EasyTransferResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage,
          org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage, org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferMethod;
    if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
          WalletGrpc.getEasyTransferMethod = getEasyTransferMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage, org.lgcy.Legacy.proto.Response.EasyTransferResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransfer"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.EasyTransferResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransfer"))
                          .build();
        }
      }
    }
    return getEasyTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage,
          org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "EasyTransferByPrivate",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.EasyTransferResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage,
          org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage, org.lgcy.Legacy.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod;
    if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferByPrivateMethod = getEasyTransferByPrivateMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage, org.lgcy.Legacy.proto.Response.EasyTransferResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferByPrivate"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.EasyTransferResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferByPrivate"))
                          .build();
        }
      }
    }
    return getEasyTransferByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.api.GrpcAPI.BytesMessage> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateAddress",
          requestType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          responseType = org.lgcy.Legacy.api.GrpcAPI.BytesMessage.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
          org.lgcy.Legacy.api.GrpcAPI.BytesMessage> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.api.GrpcAPI.BytesMessage> getCreateAddressMethod;
    if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
          WalletGrpc.getCreateAddressMethod = getCreateAddressMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.BytesMessage, org.lgcy.Legacy.api.GrpcAPI.BytesMessage>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAddress"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAddress"))
                          .build();
        }
      }
    }
    return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GenerateAddress",
          requestType = org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.class,
          responseType = org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
          org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod;
    if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
          WalletGrpc.getGenerateAddressMethod = getGenerateAddressMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.api.GrpcAPI.EmptyMessage, org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAddress"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GenerateAddress"))
                          .build();
        }
      }
    }
    return getGenerateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Response.TransactionSign,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getAddSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "AddSign",
          requestType = org.lgcy.Legacy.proto.Response.TransactionSign.class,
          responseType = org.lgcy.Legacy.proto.Response.TransactionExtention.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Response.TransactionSign,
          org.lgcy.Legacy.proto.Response.TransactionExtention> getAddSignMethod() {
    io.grpc.MethodDescriptor<org.lgcy.Legacy.proto.Response.TransactionSign, org.lgcy.Legacy.proto.Response.TransactionExtention> getAddSignMethod;
    if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
          WalletGrpc.getAddSignMethod = getAddSignMethod =
                  io.grpc.MethodDescriptor.<org.lgcy.Legacy.proto.Response.TransactionSign, org.lgcy.Legacy.proto.Response.TransactionExtention>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSign"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionSign.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.lgcy.Legacy.proto.Response.TransactionExtention.getDefaultInstance()))
                          .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AddSign"))
                          .build();
        }
      }
    }
    return getAddSignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<WalletStub>() {
              @java.lang.Override
              public WalletStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new WalletStub(channel, callOptions);
              }
            };
    return WalletStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub>() {
              @java.lang.Override
              public WalletBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new WalletBlockingStub(channel, callOptions);
              }
            };
    return WalletBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletFutureStub newFutureStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub>() {
              @java.lang.Override
              public WalletFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new WalletFutureStub(channel, callOptions);
              }
            };
    return WalletFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WalletImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public void broadcastTransaction(org.lgcy.Legacy.proto.Chain.Transaction request,
                                     io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionReturn> responseObserver) {
      asyncUnimplementedUnaryCall(getBroadcastTransactionMethod(), responseObserver);
    }

    /**
     */
    public void broadcastTransactionData(org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction request,
                                         io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.TransactionReturnData> responseObserver) {
      asyncUnimplementedUnaryCall(getBroadcastTransactionDataMethod(), responseObserver);
    }

    /**
     */
    public void createCommonTransaction(org.lgcy.Legacy.proto.Chain.Transaction request,
                                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCommonTransactionMethod(), responseObserver);
    }

    /**
     */
    public void createAccount(org.lgcy.Legacy.proto.Contract.AccountCreateContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     */
    public void createAccount2(org.lgcy.Legacy.proto.Contract.AccountCreateContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccount2Method(), responseObserver);
    }

    /**
     */
    public void updateAccount(org.lgcy.Legacy.proto.Contract.AccountUpdateContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccountMethod(), responseObserver);
    }

    /**
     */
    public void setAccountId(org.lgcy.Legacy.proto.Contract.SetAccountIdContract request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccountIdMethod(), responseObserver);
    }

    /**
     */
    public void accountPermissionUpdate(org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract request,
                                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountPermissionUpdateMethod(), responseObserver);
    }

    /**
     */
    public void createTransaction(org.lgcy.Legacy.proto.Contract.TransferContract request,
                                  io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     */
    public void signTransactionCreation(org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension request,
                                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getSignTransactionCreationMethod(), responseObserver);
    }

    /**
     */
    public void createAssetIssue(org.lgcy.Legacy.proto.Contract.AssetIssueContract request,
                                 io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAssetIssueMethod(), responseObserver);
    }

    /**
     */
    public void createAssetIssue2(org.lgcy.Legacy.proto.Contract.AssetIssueContract request,
                                  io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAssetIssue2Method(), responseObserver);
    }

    /**
     */
    public void updateAsset(org.lgcy.Legacy.proto.Contract.UpdateAssetContract request,
                            io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAssetMethod(), responseObserver);
    }

    /**
     */
    public void updateAsset2(org.lgcy.Legacy.proto.Contract.UpdateAssetContract request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAsset2Method(), responseObserver);
    }

    /**
     */
    public void transferAsset(org.lgcy.Legacy.proto.Contract.TransferAssetContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferAssetMethod(), responseObserver);
    }

    /**
     */
    public void transferAsset2(org.lgcy.Legacy.proto.Contract.TransferAssetContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferAsset2Method(), responseObserver);
    }

    /**
     */
    public void participateAssetIssue(org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract request,
                                      io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getParticipateAssetIssueMethod(), responseObserver);
    }

    /**
     */
    public void participateAssetIssue2(org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract request,
                                       io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getParticipateAssetIssue2Method(), responseObserver);
    }

    /**
     */
    public void unfreezeAsset(org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUnfreezeAssetMethod(), responseObserver);
    }

    /**
     */
    public void unfreezeAsset2(org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUnfreezeAsset2Method(), responseObserver);
    }

    /**
     */
    public void createWitness(org.lgcy.Legacy.proto.Contract.WitnessCreateContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateWitnessMethod(), responseObserver);
    }

    /**
     */
    public void updateWitness(org.lgcy.Legacy.proto.Contract.WitnessUpdateContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateWitnessMethod(), responseObserver);
    }

    /**
     */
    public void updateBrokerage(org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBrokerageMethod(), responseObserver);
    }

    /**
     */
    public void voteWitnessAccount(org.lgcy.Legacy.proto.Contract.VoteWitnessContract request,
                                   io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getVoteWitnessAccountMethod(), responseObserver);
    }

    /**
     */
    public void freezeBalance(org.lgcy.Legacy.proto.Contract.FreezeBalanceContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getFreezeBalanceMethod(), responseObserver);
    }

    /**
     */
    public void unfreezeBalance(org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUnfreezeBalanceMethod(), responseObserver);
    }

    /**
     */
    public void withdrawBalance(org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawBalanceMethod(), responseObserver);
    }

    /**
     */
    public void updateSetting(org.lgcy.Legacy.proto.Contract.UpdateSettingContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSettingMethod(), responseObserver);
    }

    /**
     */
    public void proposalCreate(org.lgcy.Legacy.proto.Contract.ProposalCreateContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalCreateMethod(), responseObserver);
    }

    /**
     */
    public void proposalApprove(org.lgcy.Legacy.proto.Contract.ProposalApproveContract request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalApproveMethod(), responseObserver);
    }

    /**
     */
    public void proposalDelete(org.lgcy.Legacy.proto.Contract.ProposalDeleteContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalDeleteMethod(), responseObserver);
    }

    /**
     */
    public void deployContract(org.lgcy.Legacy.proto.Contract.CreateSmartContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getDeployContractMethod(), responseObserver);
    }

    /**
     */
    public void triggerContract(org.lgcy.Legacy.proto.Contract.TriggerSmartContract request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerContractMethod(), responseObserver);
    }

    /**
     */
    public void triggerConstantContract(org.lgcy.Legacy.proto.Contract.TriggerSmartContract request,
                                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerConstantContractMethod(), responseObserver);
    }

    /**
     */
    public void triggerConstantContract2(org.lgcy.Legacy.proto.Contract.TriggerSmartContract request,
                                         io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerConstantContract2Method(), responseObserver);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public void getNodeInfo(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                            io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.NodeInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNodeInfoMethod(), responseObserver);
    }

    /**
     */
    public void listNodes(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                          io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.NodeList> responseObserver) {
      asyncUnimplementedUnaryCall(getListNodesMethod(), responseObserver);
    }

    /**
     */
    public void getChainParameters(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                                   io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ChainParameters> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChainParametersMethod(), responseObserver);
    }

    /**
     */
    public void totalTransaction(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                                 io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                                       io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNextMaintenanceTimeMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(org.lgcy.Legacy.proto.Chain.Transaction request,
                                         io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionSignWeight> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSignWeightMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(org.lgcy.Legacy.proto.Chain.Transaction request,
                                           io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionApprovedList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionApprovedListMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public void getAccount(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request,
                           io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccountById(org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAccountNet(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AccountNetMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountNetMethod(), responseObserver);
    }

    /**
     */
    public void getAccountResource(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request,
                                   io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AccountResourceMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountResourceMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request,
                                       io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                    io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Contract.AssetIssueContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueListByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                  io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Contract.AssetIssueContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueList(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                                  io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request,
                                           io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    public void getNowBlock(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                            io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNowBlockMethod(), responseObserver);
    }

    /**
     */
    public void getNowBlock2(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNowBlock2Method(), responseObserver);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public void getBlockByNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByNumMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public void getBlockByNum2(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByNum2Method(), responseObserver);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public void getBlockById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByIdMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext(org.lgcy.Legacy.api.GrpcAPI.BlockLimit request,
                                    io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLimitNextMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext2(org.lgcy.Legacy.api.GrpcAPI.BlockLimit request,
                                     io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockListExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLimitNext2Method(), responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                                    io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLatestNumMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum2(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                                     io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockListExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLatestNum2Method(), responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionCountByBlockNumMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                   io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionById3(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                    io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionById3Method(), responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                       io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionInfoByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionInfoList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionInfoByBlockNumMethod(), responseObserver);
    }

    /**
     */
    public void getContract(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                            io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Common.SmartContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public void getContractInfo(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.SmartContractDataWrapper> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContractInfoMethod(), responseObserver);
    }

    /**
     */
    public void listWitnesses(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.WitnessList> responseObserver) {
      asyncUnimplementedUnaryCall(getListWitnessesMethod(), responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                 io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBrokerageInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     *add new method
     * </pre>
     */
    public void getBrokerage(org.lgcy.Legacy.api.GrpcAPI.InputBrokerage request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBrokerageMethod(), responseObserver);
    }

    /**
     */
    public void getRewardInfo(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRewardInfoMethod(), responseObserver);
    }

    /**
     */
    public void getReward(org.lgcy.Legacy.api.GrpcAPI.RewardMessage request,
                          io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.RewardOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRewardMethod(), responseObserver);
    }

    /**
     */
    public void listProposals(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ProposalList> responseObserver) {
      asyncUnimplementedUnaryCall(getListProposalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * changes
     *  rpc GetProposalById(BytesMessage) returns (Proposal) {}
     * </pre>
     */
    public void getProposalById(org.lgcy.Legacy.api.GrpcAPI.ProposalInput request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Proposal> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProposalByIdMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request,
                                         io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ProposalList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedProposalListMethod(), responseObserver);
    }

    /**
     */
    public void getExchangeById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Exchange> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExchangeByIdMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request,
                                         io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ExchangeList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedExchangeListMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public void getTransactionSign(org.lgcy.Legacy.proto.Response.TransactionSign request,
                                   io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSignMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionSign2(org.lgcy.Legacy.proto.Response.TransactionSign request,
                                    io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSign2Method(), responseObserver);
    }

    /**
     */
    public void easyTransferAsset(org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage request,
                                  io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferAssetMethod(), responseObserver);
    }

    /**
     */
    public void easyTransferAssetByPrivate(org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage request,
                                           io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferAssetByPrivateMethod(), responseObserver);
    }

    /**
     */
    public void easyTransfer(org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferMethod(), responseObserver);
    }

    /**
     */
    public void easyTransferByPrivate(org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage request,
                                      io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferByPrivateMethod(), responseObserver);
    }

    /**
     */
    public void createAddress(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    public void generateAddress(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateAddressMethod(), responseObserver);
    }

    /**
     */
    public void addSign(org.lgcy.Legacy.proto.Response.TransactionSign request,
                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getBroadcastTransactionMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Chain.Transaction,
                                      org.lgcy.Legacy.proto.Response.TransactionReturn>(
                                      this, METHODID_BROADCAST_TRANSACTION)))
              .addMethod(
                      getBroadcastTransactionDataMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction,
                                      org.lgcy.Legacy.proto.Chain.TransactionReturnData>(
                                      this, METHODID_BROADCAST_TRANSACTION_DATA)))
              .addMethod(
                      getCreateCommonTransactionMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Chain.Transaction,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_CREATE_COMMON_TRANSACTION)))
              .addMethod(
                      getCreateAccountMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.AccountCreateContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_CREATE_ACCOUNT)))
              .addMethod(
                      getCreateAccount2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.AccountCreateContract,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_CREATE_ACCOUNT2)))
              .addMethod(
                      getUpdateAccountMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.AccountUpdateContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_UPDATE_ACCOUNT)))
              .addMethod(
                      getSetAccountIdMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.SetAccountIdContract,
                                      org.lgcy.Legacy.proto.Chain.Transaction>(
                                      this, METHODID_SET_ACCOUNT_ID)))
              .addMethod(
                      getAccountPermissionUpdateMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_ACCOUNT_PERMISSION_UPDATE)))
              .addMethod(
                      getCreateTransactionMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.TransferContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_CREATE_TRANSACTION)))
              .addMethod(
                      getSignTransactionCreationMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_SIGN_TRANSACTION_CREATION)))
              .addMethod(
                      getCreateAssetIssueMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.AssetIssueContract,
                                      org.lgcy.Legacy.proto.Chain.Transaction>(
                                      this, METHODID_CREATE_ASSET_ISSUE)))
              .addMethod(
                      getCreateAssetIssue2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.AssetIssueContract,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_CREATE_ASSET_ISSUE2)))
              .addMethod(
                      getUpdateAssetMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.UpdateAssetContract,
                                      org.lgcy.Legacy.proto.Chain.Transaction>(
                                      this, METHODID_UPDATE_ASSET)))
              .addMethod(
                      getUpdateAsset2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.UpdateAssetContract,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_UPDATE_ASSET2)))
              .addMethod(
                      getTransferAssetMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.TransferAssetContract,
                                      org.lgcy.Legacy.proto.Chain.Transaction>(
                                      this, METHODID_TRANSFER_ASSET)))
              .addMethod(
                      getTransferAsset2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.TransferAssetContract,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_TRANSFER_ASSET2)))
              .addMethod(
                      getParticipateAssetIssueMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract,
                                      org.lgcy.Legacy.proto.Chain.Transaction>(
                                      this, METHODID_PARTICIPATE_ASSET_ISSUE)))
              .addMethod(
                      getParticipateAssetIssue2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_PARTICIPATE_ASSET_ISSUE2)))
              .addMethod(
                      getUnfreezeAssetMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract,
                                      org.lgcy.Legacy.proto.Chain.Transaction>(
                                      this, METHODID_UNFREEZE_ASSET)))
              .addMethod(
                      getUnfreezeAsset2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_UNFREEZE_ASSET2)))
              .addMethod(
                      getCreateWitnessMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.WitnessCreateContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_CREATE_WITNESS)))
              .addMethod(
                      getUpdateWitnessMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.WitnessUpdateContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_UPDATE_WITNESS)))
              .addMethod(
                      getUpdateBrokerageMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_UPDATE_BROKERAGE)))
              .addMethod(
                      getVoteWitnessAccountMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.VoteWitnessContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_VOTE_WITNESS_ACCOUNT)))
              .addMethod(
                      getFreezeBalanceMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.FreezeBalanceContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_FREEZE_BALANCE)))
              .addMethod(
                      getUnfreezeBalanceMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_UNFREEZE_BALANCE)))
              .addMethod(
                      getWithdrawBalanceMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_WITHDRAW_BALANCE)))
              .addMethod(
                      getUpdateSettingMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.UpdateSettingContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_UPDATE_SETTING)))
              .addMethod(
                      getProposalCreateMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.ProposalCreateContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_PROPOSAL_CREATE)))
              .addMethod(
                      getProposalApproveMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.ProposalApproveContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_PROPOSAL_APPROVE)))
              .addMethod(
                      getProposalDeleteMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.ProposalDeleteContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_PROPOSAL_DELETE)))
              .addMethod(
                      getDeployContractMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.CreateSmartContract,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_DEPLOY_CONTRACT)))
              .addMethod(
                      getTriggerContractMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.TriggerSmartContract,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_TRIGGER_CONTRACT)))
              .addMethod(
                      getTriggerConstantContractMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.TriggerSmartContract,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_TRIGGER_CONSTANT_CONTRACT)))
              .addMethod(
                      getTriggerConstantContract2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Contract.TriggerSmartContract,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2>(
                                      this, METHODID_TRIGGER_CONSTANT_CONTRACT2)))
              .addMethod(
                      getGetNodeInfoMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.proto.Response.NodeInfo>(
                                      this, METHODID_GET_NODE_INFO)))
              .addMethod(
                      getListNodesMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.proto.Response.NodeList>(
                                      this, METHODID_LIST_NODES)))
              .addMethod(
                      getGetChainParametersMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.proto.Response.ChainParameters>(
                                      this, METHODID_GET_CHAIN_PARAMETERS)))
              .addMethod(
                      getTotalTransactionMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.api.GrpcAPI.NumberMessage>(
                                      this, METHODID_TOTAL_TRANSACTION)))
              .addMethod(
                      getGetNextMaintenanceTimeMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.api.GrpcAPI.NumberMessage>(
                                      this, METHODID_GET_NEXT_MAINTENANCE_TIME)))
              .addMethod(
                      getGetTransactionSignWeightMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Chain.Transaction,
                                      org.lgcy.Legacy.proto.Response.TransactionSignWeight>(
                                      this, METHODID_GET_TRANSACTION_SIGN_WEIGHT)))
              .addMethod(
                      getGetTransactionApprovedListMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Chain.Transaction,
                                      org.lgcy.Legacy.proto.Response.TransactionApprovedList>(
                                      this, METHODID_GET_TRANSACTION_APPROVED_LIST)))
              .addMethod(
                      getGetAccountMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
                                      org.lgcy.Legacy.proto.Response.Account>(
                                      this, METHODID_GET_ACCOUNT)))
              .addMethod(
                      getGetAccountByIdMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage,
                                      org.lgcy.Legacy.proto.Response.Account>(
                                      this, METHODID_GET_ACCOUNT_BY_ID)))
              .addMethod(
                      getGetAccountNetMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
                                      org.lgcy.Legacy.proto.Response.AccountNetMessage>(
                                      this, METHODID_GET_ACCOUNT_NET)))
              .addMethod(
                      getGetAccountResourceMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
                                      org.lgcy.Legacy.proto.Response.AccountResourceMessage>(
                                      this, METHODID_GET_ACCOUNT_RESOURCE)))
              .addMethod(
                      getGetAssetIssueByAccountMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage,
                                      org.lgcy.Legacy.proto.Response.AssetIssueList>(
                                      this, METHODID_GET_ASSET_ISSUE_BY_ACCOUNT)))
              .addMethod(
                      getGetAssetIssueByNameMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.proto.Contract.AssetIssueContract>(
                                      this, METHODID_GET_ASSET_ISSUE_BY_NAME)))
              .addMethod(
                      getGetAssetIssueListByNameMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.proto.Response.AssetIssueList>(
                                      this, METHODID_GET_ASSET_ISSUE_LIST_BY_NAME)))
              .addMethod(
                      getGetAssetIssueByIdMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.proto.Contract.AssetIssueContract>(
                                      this, METHODID_GET_ASSET_ISSUE_BY_ID)))
              .addMethod(
                      getGetAssetIssueListMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.proto.Response.AssetIssueList>(
                                      this, METHODID_GET_ASSET_ISSUE_LIST)))
              .addMethod(
                      getGetPaginatedAssetIssueListMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage,
                                      org.lgcy.Legacy.proto.Response.AssetIssueList>(
                                      this, METHODID_GET_PAGINATED_ASSET_ISSUE_LIST)))
              .addMethod(
                      getGetNowBlockMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.proto.Chain.Block>(
                                      this, METHODID_GET_NOW_BLOCK)))
              .addMethod(
                      getGetNowBlock2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.proto.Response.BlockExtention>(
                                      this, METHODID_GET_NOW_BLOCK2)))
              .addMethod(
                      getGetBlockByNumMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
                                      org.lgcy.Legacy.proto.Chain.Block>(
                                      this, METHODID_GET_BLOCK_BY_NUM)))
              .addMethod(
                      getGetBlockByNum2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
                                      org.lgcy.Legacy.proto.Response.BlockExtention>(
                                      this, METHODID_GET_BLOCK_BY_NUM2)))
              .addMethod(
                      getGetBlockByIdMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.proto.Chain.Block>(
                                      this, METHODID_GET_BLOCK_BY_ID)))
              .addMethod(
                      getGetBlockByLimitNextMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BlockLimit,
                                      org.lgcy.Legacy.proto.Response.BlockList>(
                                      this, METHODID_GET_BLOCK_BY_LIMIT_NEXT)))
              .addMethod(
                      getGetBlockByLimitNext2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BlockLimit,
                                      org.lgcy.Legacy.proto.Response.BlockListExtention>(
                                      this, METHODID_GET_BLOCK_BY_LIMIT_NEXT2)))
              .addMethod(
                      getGetBlockByLatestNumMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
                                      org.lgcy.Legacy.proto.Response.BlockList>(
                                      this, METHODID_GET_BLOCK_BY_LATEST_NUM)))
              .addMethod(
                      getGetBlockByLatestNum2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
                                      org.lgcy.Legacy.proto.Response.BlockListExtention>(
                                      this, METHODID_GET_BLOCK_BY_LATEST_NUM2)))
              .addMethod(
                      getGetTransactionCountByBlockNumMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
                                      org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum>(
                                      this, METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM)))
              .addMethod(
                      getGetTransactionByIdMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.proto.Chain.Transaction>(
                                      this, METHODID_GET_TRANSACTION_BY_ID)))
              .addMethod(
                      getGetTransactionById3Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>(
                                      this, METHODID_GET_TRANSACTION_BY_ID3)))
              .addMethod(
                      getGetTransactionInfoByIdMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.proto.Response.TransactionInfo>(
                                      this, METHODID_GET_TRANSACTION_INFO_BY_ID)))
              .addMethod(
                      getGetTransactionInfoByBlockNumMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.NumberMessage,
                                      org.lgcy.Legacy.proto.Response.TransactionInfoList>(
                                      this, METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM)))
              .addMethod(
                      getGetContractMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.proto.Common.SmartContract>(
                                      this, METHODID_GET_CONTRACT)))
              .addMethod(
                      getGetContractInfoMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.proto.Response.SmartContractDataWrapper>(
                                      this, METHODID_GET_CONTRACT_INFO)))
              .addMethod(
                      getListWitnessesMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.proto.Response.WitnessList>(
                                      this, METHODID_LIST_WITNESSES)))
              .addMethod(
                      getGetBrokerageInfoMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.api.GrpcAPI.NumberMessage>(
                                      this, METHODID_GET_BROKERAGE_INFO)))
              .addMethod(
                      getGetBrokerageMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.InputBrokerage,
                                      org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage>(
                                      this, METHODID_GET_BROKERAGE)))
              .addMethod(
                      getGetRewardInfoMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.api.GrpcAPI.NumberMessage>(
                                      this, METHODID_GET_REWARD_INFO)))
              .addMethod(
                      getGetRewardMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.RewardMessage,
                                      org.lgcy.Legacy.api.GrpcAPI.RewardOutput>(
                                      this, METHODID_GET_REWARD)))
              .addMethod(
                      getListProposalsMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.proto.Response.ProposalList>(
                                      this, METHODID_LIST_PROPOSALS)))
              .addMethod(
                      getGetProposalByIdMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.ProposalInput,
                                      org.lgcy.Legacy.proto.Response.Proposal>(
                                      this, METHODID_GET_PROPOSAL_BY_ID)))
              .addMethod(
                      getGetPaginatedProposalListMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage,
                                      org.lgcy.Legacy.proto.Response.ProposalList>(
                                      this, METHODID_GET_PAGINATED_PROPOSAL_LIST)))
              .addMethod(
                      getGetExchangeByIdMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.proto.Response.Exchange>(
                                      this, METHODID_GET_EXCHANGE_BY_ID)))
              .addMethod(
                      getGetPaginatedExchangeListMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage,
                                      org.lgcy.Legacy.proto.Response.ExchangeList>(
                                      this, METHODID_GET_PAGINATED_EXCHANGE_LIST)))
              .addMethod(
                      getGetTransactionSignMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Response.TransactionSign,
                                      org.lgcy.Legacy.proto.Chain.Transaction>(
                                      this, METHODID_GET_TRANSACTION_SIGN)))
              .addMethod(
                      getGetTransactionSign2Method(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Response.TransactionSign,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_GET_TRANSACTION_SIGN2)))
              .addMethod(
                      getEasyTransferAssetMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage,
                                      org.lgcy.Legacy.proto.Response.EasyTransferResponse>(
                                      this, METHODID_EASY_TRANSFER_ASSET)))
              .addMethod(
                      getEasyTransferAssetByPrivateMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
                                      org.lgcy.Legacy.proto.Response.EasyTransferResponse>(
                                      this, METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE)))
              .addMethod(
                      getEasyTransferMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage,
                                      org.lgcy.Legacy.proto.Response.EasyTransferResponse>(
                                      this, METHODID_EASY_TRANSFER)))
              .addMethod(
                      getEasyTransferByPrivateMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage,
                                      org.lgcy.Legacy.proto.Response.EasyTransferResponse>(
                                      this, METHODID_EASY_TRANSFER_BY_PRIVATE)))
              .addMethod(
                      getCreateAddressMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage,
                                      org.lgcy.Legacy.api.GrpcAPI.BytesMessage>(
                                      this, METHODID_CREATE_ADDRESS)))
              .addMethod(
                      getGenerateAddressMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.api.GrpcAPI.EmptyMessage,
                                      org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage>(
                                      this, METHODID_GENERATE_ADDRESS)))
              .addMethod(
                      getAddSignMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.lgcy.Legacy.proto.Response.TransactionSign,
                                      org.lgcy.Legacy.proto.Response.TransactionExtention>(
                                      this, METHODID_ADD_SIGN)))
              .build();
    }
  }

  /**
   */
  public static final class WalletStub extends io.grpc.stub.AbstractAsyncStub<WalletStub> {
    private WalletStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public void broadcastTransaction(org.lgcy.Legacy.proto.Chain.Transaction request,
                                     io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionReturn> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void broadcastTransactionData(org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction request,
                                         io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.TransactionReturnData> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getBroadcastTransactionDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCommonTransaction(org.lgcy.Legacy.proto.Chain.Transaction request,
                                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCreateCommonTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccount(org.lgcy.Legacy.proto.Contract.AccountCreateContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccount2(org.lgcy.Legacy.proto.Contract.AccountCreateContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCreateAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccount(org.lgcy.Legacy.proto.Contract.AccountUpdateContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAccountId(org.lgcy.Legacy.proto.Contract.SetAccountIdContract request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getSetAccountIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountPermissionUpdate(org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract request,
                                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getAccountPermissionUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransaction(org.lgcy.Legacy.proto.Contract.TransferContract request,
                                  io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signTransactionCreation(org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension request,
                                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getSignTransactionCreationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAssetIssue(org.lgcy.Legacy.proto.Contract.AssetIssueContract request,
                                 io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCreateAssetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAssetIssue2(org.lgcy.Legacy.proto.Contract.AssetIssueContract request,
                                  io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCreateAssetIssue2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAsset(org.lgcy.Legacy.proto.Contract.UpdateAssetContract request,
                            io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAsset2(org.lgcy.Legacy.proto.Contract.UpdateAssetContract request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getUpdateAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferAsset(org.lgcy.Legacy.proto.Contract.TransferAssetContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferAsset2(org.lgcy.Legacy.proto.Contract.TransferAssetContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getTransferAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void participateAssetIssue(org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract request,
                                      io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getParticipateAssetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void participateAssetIssue2(org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract request,
                                       io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getParticipateAssetIssue2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unfreezeAsset(org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getUnfreezeAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unfreezeAsset2(org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getUnfreezeAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWitness(org.lgcy.Legacy.proto.Contract.WitnessCreateContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCreateWitnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWitness(org.lgcy.Legacy.proto.Contract.WitnessUpdateContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getUpdateWitnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBrokerage(org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getUpdateBrokerageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voteWitnessAccount(org.lgcy.Legacy.proto.Contract.VoteWitnessContract request,
                                   io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getVoteWitnessAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void freezeBalance(org.lgcy.Legacy.proto.Contract.FreezeBalanceContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getFreezeBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unfreezeBalance(org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getUnfreezeBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawBalance(org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getWithdrawBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSetting(org.lgcy.Legacy.proto.Contract.UpdateSettingContract request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getUpdateSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalCreate(org.lgcy.Legacy.proto.Contract.ProposalCreateContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getProposalCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalApprove(org.lgcy.Legacy.proto.Contract.ProposalApproveContract request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getProposalApproveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalDelete(org.lgcy.Legacy.proto.Contract.ProposalDeleteContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getProposalDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deployContract(org.lgcy.Legacy.proto.Contract.CreateSmartContract request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getDeployContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerContract(org.lgcy.Legacy.proto.Contract.TriggerSmartContract request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerConstantContract(org.lgcy.Legacy.proto.Contract.TriggerSmartContract request,
                                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerConstantContract2(org.lgcy.Legacy.proto.Contract.TriggerSmartContract request,
                                         io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getTriggerConstantContract2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public void getNodeInfo(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                            io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.NodeInfo> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNodes(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                          io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.NodeList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getListNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChainParameters(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                                   io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ChainParameters> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalTransaction(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                                 io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                                       io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(org.lgcy.Legacy.proto.Chain.Transaction request,
                                         io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionSignWeight> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(org.lgcy.Legacy.proto.Chain.Transaction request,
                                           io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionApprovedList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public void getAccount(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request,
                           io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Account> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountById(org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Account> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountNet(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AccountNetMessage> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountResource(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request,
                                   io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AccountResourceMessage> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request,
                                       io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                    io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Contract.AssetIssueContract> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                  io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Contract.AssetIssueContract> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueList(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                                  io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request,
                                           io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                            io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Block> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock2(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public void getBlockByNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Block> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public void getBlockByNum2(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                               io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public void getBlockById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Block> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext(org.lgcy.Legacy.api.GrpcAPI.BlockLimit request,
                                    io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext2(org.lgcy.Legacy.api.GrpcAPI.BlockLimit request,
                                     io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockListExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                                    io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum2(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                                     io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockListExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                   io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionById3(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                    io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetTransactionById3Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                       io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionInfo> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request,
                                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionInfoList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContract(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                            io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Common.SmartContract> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public void getContractInfo(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.SmartContractDataWrapper> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWitnesses(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.WitnessList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                 io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *add new method
     * </pre>
     */
    public void getBrokerage(org.lgcy.Legacy.api.GrpcAPI.InputBrokerage request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetBrokerageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRewardInfo(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReward(org.lgcy.Legacy.api.GrpcAPI.RewardMessage request,
                          io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.RewardOutput> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProposals(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ProposalList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getListProposalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * changes
     *  rpc GetProposalById(BytesMessage) returns (Proposal) {}
     * </pre>
     */
    public void getProposalById(org.lgcy.Legacy.api.GrpcAPI.ProposalInput request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Proposal> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request,
                                         io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ProposalList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExchangeById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Exchange> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request,
                                         io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ExchangeList> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public void getTransactionSign(org.lgcy.Legacy.proto.Response.TransactionSign request,
                                   io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSign2(org.lgcy.Legacy.proto.Response.TransactionSign request,
                                    io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferAsset(org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage request,
                                  io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferAssetByPrivate(org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage request,
                                           io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransfer(org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage request,
                             io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferByPrivate(org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage request,
                                      io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAddress(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request,
                              io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateAddress(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request,
                                io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSign(org.lgcy.Legacy.proto.Response.TransactionSign request,
                        io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getAddSignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WalletBlockingStub extends io.grpc.stub.AbstractBlockingStub<WalletBlockingStub> {
    private WalletBlockingStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletBlockingStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public org.lgcy.Legacy.proto.Response.TransactionReturn broadcastTransaction(org.lgcy.Legacy.proto.Chain.Transaction request) {
      return blockingUnaryCall(
              getChannel(), getBroadcastTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Chain.TransactionReturnData broadcastTransactionData(org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction request) {
      return blockingUnaryCall(
              getChannel(), getBroadcastTransactionDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention createCommonTransaction(org.lgcy.Legacy.proto.Chain.Transaction request) {
      return blockingUnaryCall(
              getChannel(), getCreateCommonTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction createAccount(org.lgcy.Legacy.proto.Contract.AccountCreateContract request) {
      return blockingUnaryCall(
              getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention createAccount2(org.lgcy.Legacy.proto.Contract.AccountCreateContract request) {
      return blockingUnaryCall(
              getChannel(), getCreateAccount2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction updateAccount(org.lgcy.Legacy.proto.Contract.AccountUpdateContract request) {
      return blockingUnaryCall(
              getChannel(), getUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Chain.Transaction setAccountId(org.lgcy.Legacy.proto.Contract.SetAccountIdContract request) {
      return blockingUnaryCall(
              getChannel(), getSetAccountIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction accountPermissionUpdate(org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract request) {
      return blockingUnaryCall(
              getChannel(), getAccountPermissionUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction createTransaction(org.lgcy.Legacy.proto.Contract.TransferContract request) {
      return blockingUnaryCall(
              getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction signTransactionCreation(org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension request) {
      return blockingUnaryCall(
              getChannel(), getSignTransactionCreationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Chain.Transaction createAssetIssue(org.lgcy.Legacy.proto.Contract.AssetIssueContract request) {
      return blockingUnaryCall(
              getChannel(), getCreateAssetIssueMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention createAssetIssue2(org.lgcy.Legacy.proto.Contract.AssetIssueContract request) {
      return blockingUnaryCall(
              getChannel(), getCreateAssetIssue2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Chain.Transaction updateAsset(org.lgcy.Legacy.proto.Contract.UpdateAssetContract request) {
      return blockingUnaryCall(
              getChannel(), getUpdateAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention updateAsset2(org.lgcy.Legacy.proto.Contract.UpdateAssetContract request) {
      return blockingUnaryCall(
              getChannel(), getUpdateAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Chain.Transaction transferAsset(org.lgcy.Legacy.proto.Contract.TransferAssetContract request) {
      return blockingUnaryCall(
              getChannel(), getTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention transferAsset2(org.lgcy.Legacy.proto.Contract.TransferAssetContract request) {
      return blockingUnaryCall(
              getChannel(), getTransferAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Chain.Transaction participateAssetIssue(org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract request) {
      return blockingUnaryCall(
              getChannel(), getParticipateAssetIssueMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention participateAssetIssue2(org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract request) {
      return blockingUnaryCall(
              getChannel(), getParticipateAssetIssue2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Chain.Transaction unfreezeAsset(org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract request) {
      return blockingUnaryCall(
              getChannel(), getUnfreezeAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention unfreezeAsset2(org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract request) {
      return blockingUnaryCall(
              getChannel(), getUnfreezeAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction createWitness(org.lgcy.Legacy.proto.Contract.WitnessCreateContract request) {
      return blockingUnaryCall(
              getChannel(), getCreateWitnessMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction updateWitness(org.lgcy.Legacy.proto.Contract.WitnessUpdateContract request) {
      return blockingUnaryCall(
              getChannel(), getUpdateWitnessMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction updateBrokerage(org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract request) {
      return blockingUnaryCall(
              getChannel(), getUpdateBrokerageMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction voteWitnessAccount(org.lgcy.Legacy.proto.Contract.VoteWitnessContract request) {
      return blockingUnaryCall(
              getChannel(), getVoteWitnessAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction freezeBalance(org.lgcy.Legacy.proto.Contract.FreezeBalanceContract request) {
      return blockingUnaryCall(
              getChannel(), getFreezeBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction unfreezeBalance(org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract request) {
      return blockingUnaryCall(
              getChannel(), getUnfreezeBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction withdrawBalance(org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract request) {
      return blockingUnaryCall(
              getChannel(), getWithdrawBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction updateSetting(org.lgcy.Legacy.proto.Contract.UpdateSettingContract request) {
      return blockingUnaryCall(
              getChannel(), getUpdateSettingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction proposalCreate(org.lgcy.Legacy.proto.Contract.ProposalCreateContract request) {
      return blockingUnaryCall(
              getChannel(), getProposalCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction proposalApprove(org.lgcy.Legacy.proto.Contract.ProposalApproveContract request) {
      return blockingUnaryCall(
              getChannel(), getProposalApproveMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction proposalDelete(org.lgcy.Legacy.proto.Contract.ProposalDeleteContract request) {
      return blockingUnaryCall(
              getChannel(), getProposalDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention deployContract(org.lgcy.Legacy.proto.Contract.CreateSmartContract request) {
      return blockingUnaryCall(
              getChannel(), getDeployContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention triggerContract(org.lgcy.Legacy.proto.Contract.TriggerSmartContract request) {
      return blockingUnaryCall(
              getChannel(), getTriggerContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention triggerConstantContract(org.lgcy.Legacy.proto.Contract.TriggerSmartContract request) {
      return blockingUnaryCall(
              getChannel(), getTriggerConstantContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2 triggerConstantContract2(org.lgcy.Legacy.proto.Contract.TriggerSmartContract request) {
      return blockingUnaryCall(
              getChannel(), getTriggerConstantContract2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public org.lgcy.Legacy.proto.Response.NodeInfo getNodeInfo(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetNodeInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.NodeList listNodes(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getListNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.ChainParameters getChainParameters(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetChainParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.api.GrpcAPI.NumberMessage totalTransaction(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getTotalTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.api.GrpcAPI.NumberMessage getNextMaintenanceTime(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetNextMaintenanceTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionSignWeight getTransactionSignWeight(org.lgcy.Legacy.proto.Chain.Transaction request) {
      return blockingUnaryCall(
              getChannel(), getGetTransactionSignWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionApprovedList getTransactionApprovedList(org.lgcy.Legacy.proto.Chain.Transaction request) {
      return blockingUnaryCall(
              getChannel(), getGetTransactionApprovedListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public org.lgcy.Legacy.proto.Response.Account getAccount(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.Account getAccountById(org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetAccountByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.AccountNetMessage getAccountNet(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetAccountNetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.AccountResourceMessage getAccountResource(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetAccountResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.AssetIssueList getAssetIssueByAccount(org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetAssetIssueByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Contract.AssetIssueContract getAssetIssueByName(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetAssetIssueByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.AssetIssueList getAssetIssueListByName(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetAssetIssueListByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Contract.AssetIssueContract getAssetIssueById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetAssetIssueByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.AssetIssueList getAssetIssueList(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.AssetIssueList getPaginatedAssetIssueList(org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetPaginatedAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Chain.Block getNowBlock(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetNowBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.BlockExtention getNowBlock2(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetNowBlock2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public org.lgcy.Legacy.proto.Chain.Block getBlockByNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetBlockByNumMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public org.lgcy.Legacy.proto.Response.BlockExtention getBlockByNum2(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetBlockByNum2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public org.lgcy.Legacy.proto.Chain.Block getBlockById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetBlockByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.BlockList getBlockByLimitNext(org.lgcy.Legacy.api.GrpcAPI.BlockLimit request) {
      return blockingUnaryCall(
              getChannel(), getGetBlockByLimitNextMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.BlockListExtention getBlockByLimitNext2(org.lgcy.Legacy.api.GrpcAPI.BlockLimit request) {
      return blockingUnaryCall(
              getChannel(), getGetBlockByLimitNext2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.BlockList getBlockByLatestNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetBlockByLatestNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.BlockListExtention getBlockByLatestNum2(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetBlockByLatestNum2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum getTransactionCountByBlockNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetTransactionCountByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Chain.Transaction getTransactionById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetTransactionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction getTransactionById3(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetTransactionById3Method(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionInfo getTransactionInfoById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetTransactionInfoByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionInfoList getTransactionInfoByBlockNum(org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetTransactionInfoByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Common.SmartContract getContract(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public org.lgcy.Legacy.proto.Response.SmartContractDataWrapper getContractInfo(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetContractInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.WitnessList listWitnesses(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getListWitnessesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.api.GrpcAPI.NumberMessage getBrokerageInfo(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetBrokerageInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *add new method
     * </pre>
     */
    public org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage getBrokerage(org.lgcy.Legacy.api.GrpcAPI.InputBrokerage request) {
      return blockingUnaryCall(
              getChannel(), getGetBrokerageMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.api.GrpcAPI.NumberMessage getRewardInfo(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetRewardInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.api.GrpcAPI.RewardOutput getReward(org.lgcy.Legacy.api.GrpcAPI.RewardMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.ProposalList listProposals(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getListProposalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * changes
     *  rpc GetProposalById(BytesMessage) returns (Proposal) {}
     * </pre>
     */
    public org.lgcy.Legacy.proto.Response.Proposal getProposalById(org.lgcy.Legacy.api.GrpcAPI.ProposalInput request) {
      return blockingUnaryCall(
              getChannel(), getGetProposalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.ProposalList getPaginatedProposalList(org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetPaginatedProposalListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.Exchange getExchangeById(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetExchangeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.ExchangeList getPaginatedExchangeList(org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
              getChannel(), getGetPaginatedExchangeListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public org.lgcy.Legacy.proto.Chain.Transaction getTransactionSign(org.lgcy.Legacy.proto.Response.TransactionSign request) {
      return blockingUnaryCall(
              getChannel(), getGetTransactionSignMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention getTransactionSign2(org.lgcy.Legacy.proto.Response.TransactionSign request) {
      return blockingUnaryCall(
              getChannel(), getGetTransactionSign2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.EasyTransferResponse easyTransferAsset(org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage request) {
      return blockingUnaryCall(
              getChannel(), getEasyTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.EasyTransferResponse easyTransferAssetByPrivate(org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return blockingUnaryCall(
              getChannel(), getEasyTransferAssetByPrivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.EasyTransferResponse easyTransfer(org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage request) {
      return blockingUnaryCall(
              getChannel(), getEasyTransferMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.EasyTransferResponse easyTransferByPrivate(org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage request) {
      return blockingUnaryCall(
              getChannel(), getEasyTransferByPrivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.api.GrpcAPI.BytesMessage createAddress(org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
              getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage generateAddress(org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
              getChannel(), getGenerateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.lgcy.Legacy.proto.Response.TransactionExtention addSign(org.lgcy.Legacy.proto.Response.TransactionSign request) {
      return blockingUnaryCall(
              getChannel(), getAddSignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WalletFutureStub extends io.grpc.stub.AbstractFutureStub<WalletFutureStub> {
    private WalletFutureStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletFutureStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionReturn> broadcastTransaction(
            org.lgcy.Legacy.proto.Chain.Transaction request) {
      return futureUnaryCall(
              getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.TransactionReturnData> broadcastTransactionData(
            org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction request) {
      return futureUnaryCall(
              getChannel().newCall(getBroadcastTransactionDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> createCommonTransaction(
            org.lgcy.Legacy.proto.Chain.Transaction request) {
      return futureUnaryCall(
              getChannel().newCall(getCreateCommonTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> createAccount(
            org.lgcy.Legacy.proto.Contract.AccountCreateContract request) {
      return futureUnaryCall(
              getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> createAccount2(
            org.lgcy.Legacy.proto.Contract.AccountCreateContract request) {
      return futureUnaryCall(
              getChannel().newCall(getCreateAccount2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> updateAccount(
            org.lgcy.Legacy.proto.Contract.AccountUpdateContract request) {
      return futureUnaryCall(
              getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Transaction> setAccountId(
            org.lgcy.Legacy.proto.Contract.SetAccountIdContract request) {
      return futureUnaryCall(
              getChannel().newCall(getSetAccountIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> accountPermissionUpdate(
            org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract request) {
      return futureUnaryCall(
              getChannel().newCall(getAccountPermissionUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> createTransaction(
            org.lgcy.Legacy.proto.Contract.TransferContract request) {
      return futureUnaryCall(
              getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> signTransactionCreation(
            org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension request) {
      return futureUnaryCall(
              getChannel().newCall(getSignTransactionCreationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Transaction> createAssetIssue(
            org.lgcy.Legacy.proto.Contract.AssetIssueContract request) {
      return futureUnaryCall(
              getChannel().newCall(getCreateAssetIssueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> createAssetIssue2(
            org.lgcy.Legacy.proto.Contract.AssetIssueContract request) {
      return futureUnaryCall(
              getChannel().newCall(getCreateAssetIssue2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Transaction> updateAsset(
            org.lgcy.Legacy.proto.Contract.UpdateAssetContract request) {
      return futureUnaryCall(
              getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> updateAsset2(
            org.lgcy.Legacy.proto.Contract.UpdateAssetContract request) {
      return futureUnaryCall(
              getChannel().newCall(getUpdateAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Transaction> transferAsset(
            org.lgcy.Legacy.proto.Contract.TransferAssetContract request) {
      return futureUnaryCall(
              getChannel().newCall(getTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> transferAsset2(
            org.lgcy.Legacy.proto.Contract.TransferAssetContract request) {
      return futureUnaryCall(
              getChannel().newCall(getTransferAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Transaction> participateAssetIssue(
            org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract request) {
      return futureUnaryCall(
              getChannel().newCall(getParticipateAssetIssueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> participateAssetIssue2(
            org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract request) {
      return futureUnaryCall(
              getChannel().newCall(getParticipateAssetIssue2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Transaction> unfreezeAsset(
            org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract request) {
      return futureUnaryCall(
              getChannel().newCall(getUnfreezeAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> unfreezeAsset2(
            org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract request) {
      return futureUnaryCall(
              getChannel().newCall(getUnfreezeAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> createWitness(
            org.lgcy.Legacy.proto.Contract.WitnessCreateContract request) {
      return futureUnaryCall(
              getChannel().newCall(getCreateWitnessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> updateWitness(
            org.lgcy.Legacy.proto.Contract.WitnessUpdateContract request) {
      return futureUnaryCall(
              getChannel().newCall(getUpdateWitnessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> updateBrokerage(
            org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract request) {
      return futureUnaryCall(
              getChannel().newCall(getUpdateBrokerageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> voteWitnessAccount(
            org.lgcy.Legacy.proto.Contract.VoteWitnessContract request) {
      return futureUnaryCall(
              getChannel().newCall(getVoteWitnessAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> freezeBalance(
            org.lgcy.Legacy.proto.Contract.FreezeBalanceContract request) {
      return futureUnaryCall(
              getChannel().newCall(getFreezeBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> unfreezeBalance(
            org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract request) {
      return futureUnaryCall(
              getChannel().newCall(getUnfreezeBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> withdrawBalance(
            org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract request) {
      return futureUnaryCall(
              getChannel().newCall(getWithdrawBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> updateSetting(
            org.lgcy.Legacy.proto.Contract.UpdateSettingContract request) {
      return futureUnaryCall(
              getChannel().newCall(getUpdateSettingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> proposalCreate(
            org.lgcy.Legacy.proto.Contract.ProposalCreateContract request) {
      return futureUnaryCall(
              getChannel().newCall(getProposalCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> proposalApprove(
            org.lgcy.Legacy.proto.Contract.ProposalApproveContract request) {
      return futureUnaryCall(
              getChannel().newCall(getProposalApproveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> proposalDelete(
            org.lgcy.Legacy.proto.Contract.ProposalDeleteContract request) {
      return futureUnaryCall(
              getChannel().newCall(getProposalDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> deployContract(
            org.lgcy.Legacy.proto.Contract.CreateSmartContract request) {
      return futureUnaryCall(
              getChannel().newCall(getDeployContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> triggerContract(
            org.lgcy.Legacy.proto.Contract.TriggerSmartContract request) {
      return futureUnaryCall(
              getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> triggerConstantContract(
            org.lgcy.Legacy.proto.Contract.TriggerSmartContract request) {
      return futureUnaryCall(
              getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2> triggerConstantContract2(
            org.lgcy.Legacy.proto.Contract.TriggerSmartContract request) {
      return futureUnaryCall(
              getChannel().newCall(getTriggerConstantContract2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.NodeInfo> getNodeInfo(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.NodeList> listNodes(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getListNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.ChainParameters> getChainParameters(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> totalTransaction(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getNextMaintenanceTime(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionSignWeight> getTransactionSignWeight(
            org.lgcy.Legacy.proto.Chain.Transaction request) {
      return futureUnaryCall(
              getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionApprovedList> getTransactionApprovedList(
            org.lgcy.Legacy.proto.Chain.Transaction request) {
      return futureUnaryCall(
              getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.Account> getAccount(
            org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.Account> getAccountById(
            org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.AccountNetMessage> getAccountNet(
            org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.AccountResourceMessage> getAccountResource(
            org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.AssetIssueList> getAssetIssueByAccount(
            org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Contract.AssetIssueContract> getAssetIssueByName(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.AssetIssueList> getAssetIssueListByName(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Contract.AssetIssueContract> getAssetIssueById(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.AssetIssueList> getAssetIssueList(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.AssetIssueList> getPaginatedAssetIssueList(
            org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Block> getNowBlock(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.BlockExtention> getNowBlock2(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Block> getBlockByNum(
            org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.BlockExtention> getBlockByNum2(
            org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Block> getBlockById(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.BlockList> getBlockByLimitNext(
            org.lgcy.Legacy.api.GrpcAPI.BlockLimit request) {
      return futureUnaryCall(
              getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.BlockListExtention> getBlockByLimitNext2(
            org.lgcy.Legacy.api.GrpcAPI.BlockLimit request) {
      return futureUnaryCall(
              getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.BlockList> getBlockByLatestNum(
            org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.BlockListExtention> getBlockByLatestNum2(
            org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum> getTransactionCountByBlockNum(
            org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Transaction> getTransactionById(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction> getTransactionById3(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetTransactionById3Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionInfo> getTransactionInfoById(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionInfoList> getTransactionInfoByBlockNum(
            org.lgcy.Legacy.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Common.SmartContract> getContract(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.SmartContractDataWrapper> getContractInfo(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.WitnessList> listWitnesses(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getBrokerageInfo(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *add new method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage> getBrokerage(
            org.lgcy.Legacy.api.GrpcAPI.InputBrokerage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetBrokerageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.api.GrpcAPI.NumberMessage> getRewardInfo(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.api.GrpcAPI.RewardOutput> getReward(
            org.lgcy.Legacy.api.GrpcAPI.RewardMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.ProposalList> listProposals(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getListProposalsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * changes
     *  rpc GetProposalById(BytesMessage) returns (Proposal) {}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.Proposal> getProposalById(
            org.lgcy.Legacy.api.GrpcAPI.ProposalInput request) {
      return futureUnaryCall(
              getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.ProposalList> getPaginatedProposalList(
            org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.Exchange> getExchangeById(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.ExchangeList> getPaginatedExchangeList(
            org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Chain.Transaction> getTransactionSign(
            org.lgcy.Legacy.proto.Response.TransactionSign request) {
      return futureUnaryCall(
              getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> getTransactionSign2(
            org.lgcy.Legacy.proto.Response.TransactionSign request) {
      return futureUnaryCall(
              getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.EasyTransferResponse> easyTransferAsset(
            org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.EasyTransferResponse> easyTransferAssetByPrivate(
            org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.EasyTransferResponse> easyTransfer(
            org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.EasyTransferResponse> easyTransferByPrivate(
            org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.api.GrpcAPI.BytesMessage> createAddress(
            org.lgcy.Legacy.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage> generateAddress(
            org.lgcy.Legacy.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
              getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.lgcy.Legacy.proto.Response.TransactionExtention> addSign(
            org.lgcy.Legacy.proto.Response.TransactionSign request) {
      return futureUnaryCall(
              getChannel().newCall(getAddSignMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BROADCAST_TRANSACTION = 0;
  private static final int METHODID_BROADCAST_TRANSACTION_DATA = 1;
  private static final int METHODID_CREATE_COMMON_TRANSACTION = 2;
  private static final int METHODID_CREATE_ACCOUNT = 3;
  private static final int METHODID_CREATE_ACCOUNT2 = 4;
  private static final int METHODID_UPDATE_ACCOUNT = 5;
  private static final int METHODID_SET_ACCOUNT_ID = 6;
  private static final int METHODID_ACCOUNT_PERMISSION_UPDATE = 7;
  private static final int METHODID_CREATE_TRANSACTION = 8;
  private static final int METHODID_SIGN_TRANSACTION_CREATION = 9;
  private static final int METHODID_CREATE_ASSET_ISSUE = 10;
  private static final int METHODID_CREATE_ASSET_ISSUE2 = 11;
  private static final int METHODID_UPDATE_ASSET = 12;
  private static final int METHODID_UPDATE_ASSET2 = 13;
  private static final int METHODID_TRANSFER_ASSET = 14;
  private static final int METHODID_TRANSFER_ASSET2 = 15;
  private static final int METHODID_PARTICIPATE_ASSET_ISSUE = 16;
  private static final int METHODID_PARTICIPATE_ASSET_ISSUE2 = 17;
  private static final int METHODID_UNFREEZE_ASSET = 18;
  private static final int METHODID_UNFREEZE_ASSET2 = 19;
  private static final int METHODID_CREATE_WITNESS = 20;
  private static final int METHODID_UPDATE_WITNESS = 21;
  private static final int METHODID_UPDATE_BROKERAGE = 22;
  private static final int METHODID_VOTE_WITNESS_ACCOUNT = 23;
  private static final int METHODID_FREEZE_BALANCE = 24;
  private static final int METHODID_UNFREEZE_BALANCE = 25;
  private static final int METHODID_WITHDRAW_BALANCE = 26;
  private static final int METHODID_UPDATE_SETTING = 27;
  private static final int METHODID_PROPOSAL_CREATE = 28;
  private static final int METHODID_PROPOSAL_APPROVE = 29;
  private static final int METHODID_PROPOSAL_DELETE = 30;
  private static final int METHODID_DEPLOY_CONTRACT = 31;
  private static final int METHODID_TRIGGER_CONTRACT = 32;
  private static final int METHODID_TRIGGER_CONSTANT_CONTRACT = 33;
  private static final int METHODID_TRIGGER_CONSTANT_CONTRACT2 = 34;
  private static final int METHODID_GET_NODE_INFO = 35;
  private static final int METHODID_LIST_NODES = 36;
  private static final int METHODID_GET_CHAIN_PARAMETERS = 37;
  private static final int METHODID_TOTAL_TRANSACTION = 38;
  private static final int METHODID_GET_NEXT_MAINTENANCE_TIME = 39;
  private static final int METHODID_GET_TRANSACTION_SIGN_WEIGHT = 40;
  private static final int METHODID_GET_TRANSACTION_APPROVED_LIST = 41;
  private static final int METHODID_GET_ACCOUNT = 42;
  private static final int METHODID_GET_ACCOUNT_BY_ID = 43;
  private static final int METHODID_GET_ACCOUNT_NET = 44;
  private static final int METHODID_GET_ACCOUNT_RESOURCE = 45;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ACCOUNT = 46;
  private static final int METHODID_GET_ASSET_ISSUE_BY_NAME = 47;
  private static final int METHODID_GET_ASSET_ISSUE_LIST_BY_NAME = 48;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ID = 49;
  private static final int METHODID_GET_ASSET_ISSUE_LIST = 50;
  private static final int METHODID_GET_PAGINATED_ASSET_ISSUE_LIST = 51;
  private static final int METHODID_GET_NOW_BLOCK = 52;
  private static final int METHODID_GET_NOW_BLOCK2 = 53;
  private static final int METHODID_GET_BLOCK_BY_NUM = 54;
  private static final int METHODID_GET_BLOCK_BY_NUM2 = 55;
  private static final int METHODID_GET_BLOCK_BY_ID = 56;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT = 57;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT2 = 58;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM = 59;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM2 = 60;
  private static final int METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM = 61;
  private static final int METHODID_GET_TRANSACTION_BY_ID = 62;
  private static final int METHODID_GET_TRANSACTION_BY_ID3 = 63;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_ID = 64;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM = 65;
  private static final int METHODID_GET_CONTRACT = 66;
  private static final int METHODID_GET_CONTRACT_INFO = 67;
  private static final int METHODID_LIST_WITNESSES = 68;
  private static final int METHODID_GET_BROKERAGE_INFO = 69;
  private static final int METHODID_GET_BROKERAGE = 70;
  private static final int METHODID_GET_REWARD_INFO = 71;
  private static final int METHODID_GET_REWARD = 72;
  private static final int METHODID_LIST_PROPOSALS = 73;
  private static final int METHODID_GET_PROPOSAL_BY_ID = 74;
  private static final int METHODID_GET_PAGINATED_PROPOSAL_LIST = 75;
  private static final int METHODID_GET_EXCHANGE_BY_ID = 76;
  private static final int METHODID_GET_PAGINATED_EXCHANGE_LIST = 77;
  private static final int METHODID_GET_TRANSACTION_SIGN = 78;
  private static final int METHODID_GET_TRANSACTION_SIGN2 = 79;
  private static final int METHODID_EASY_TRANSFER_ASSET = 80;
  private static final int METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE = 81;
  private static final int METHODID_EASY_TRANSFER = 82;
  private static final int METHODID_EASY_TRANSFER_BY_PRIVATE = 83;
  private static final int METHODID_CREATE_ADDRESS = 84;
  private static final int METHODID_GENERATE_ADDRESS = 85;
  private static final int METHODID_ADD_SIGN = 86;

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BROADCAST_TRANSACTION:
          serviceImpl.broadcastTransaction((org.lgcy.Legacy.proto.Chain.Transaction) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionReturn>) responseObserver);
          break;
        case METHODID_BROADCAST_TRANSACTION_DATA:
          serviceImpl.broadcastTransactionData((org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.TransactionReturnData>) responseObserver);
          break;
        case METHODID_CREATE_COMMON_TRANSACTION:
          serviceImpl.createCommonTransaction((org.lgcy.Legacy.proto.Chain.Transaction) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((org.lgcy.Legacy.proto.Contract.AccountCreateContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT2:
          serviceImpl.createAccount2((org.lgcy.Legacy.proto.Contract.AccountCreateContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT:
          serviceImpl.updateAccount((org.lgcy.Legacy.proto.Contract.AccountUpdateContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_SET_ACCOUNT_ID:
          serviceImpl.setAccountId((org.lgcy.Legacy.proto.Contract.SetAccountIdContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_ACCOUNT_PERMISSION_UPDATE:
          serviceImpl.accountPermissionUpdate((org.lgcy.Legacy.proto.Contract.AccountPermissionUpdateContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((org.lgcy.Legacy.proto.Contract.TransferContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_SIGN_TRANSACTION_CREATION:
          serviceImpl.signTransactionCreation((org.lgcy.Legacy.proto.NewTransactionOuterClass.SignTransactionExtension) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_ISSUE:
          serviceImpl.createAssetIssue((org.lgcy.Legacy.proto.Contract.AssetIssueContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_ISSUE2:
          serviceImpl.createAssetIssue2((org.lgcy.Legacy.proto.Contract.AssetIssueContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET:
          serviceImpl.updateAsset((org.lgcy.Legacy.proto.Contract.UpdateAssetContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET2:
          serviceImpl.updateAsset2((org.lgcy.Legacy.proto.Contract.UpdateAssetContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRANSFER_ASSET:
          serviceImpl.transferAsset((org.lgcy.Legacy.proto.Contract.TransferAssetContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_TRANSFER_ASSET2:
          serviceImpl.transferAsset2((org.lgcy.Legacy.proto.Contract.TransferAssetContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_PARTICIPATE_ASSET_ISSUE:
          serviceImpl.participateAssetIssue((org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_PARTICIPATE_ASSET_ISSUE2:
          serviceImpl.participateAssetIssue2((org.lgcy.Legacy.proto.Contract.ParticipateAssetIssueContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UNFREEZE_ASSET:
          serviceImpl.unfreezeAsset((org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UNFREEZE_ASSET2:
          serviceImpl.unfreezeAsset2((org.lgcy.Legacy.proto.Contract.UnfreezeAssetContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS:
          serviceImpl.createWitness((org.lgcy.Legacy.proto.Contract.WitnessCreateContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_UPDATE_WITNESS:
          serviceImpl.updateWitness((org.lgcy.Legacy.proto.Contract.WitnessUpdateContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_UPDATE_BROKERAGE:
          serviceImpl.updateBrokerage((org.lgcy.Legacy.proto.Contract.UpdateBrokerageContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_VOTE_WITNESS_ACCOUNT:
          serviceImpl.voteWitnessAccount((org.lgcy.Legacy.proto.Contract.VoteWitnessContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_FREEZE_BALANCE:
          serviceImpl.freezeBalance((org.lgcy.Legacy.proto.Contract.FreezeBalanceContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_UNFREEZE_BALANCE:
          serviceImpl.unfreezeBalance((org.lgcy.Legacy.proto.Contract.UnfreezeBalanceContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE:
          serviceImpl.withdrawBalance((org.lgcy.Legacy.proto.Contract.WithdrawBalanceContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_UPDATE_SETTING:
          serviceImpl.updateSetting((org.lgcy.Legacy.proto.Contract.UpdateSettingContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_PROPOSAL_CREATE:
          serviceImpl.proposalCreate((org.lgcy.Legacy.proto.Contract.ProposalCreateContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_PROPOSAL_APPROVE:
          serviceImpl.proposalApprove((org.lgcy.Legacy.proto.Contract.ProposalApproveContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_PROPOSAL_DELETE:
          serviceImpl.proposalDelete((org.lgcy.Legacy.proto.Contract.ProposalDeleteContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_DEPLOY_CONTRACT:
          serviceImpl.deployContract((org.lgcy.Legacy.proto.Contract.CreateSmartContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONTRACT:
          serviceImpl.triggerContract((org.lgcy.Legacy.proto.Contract.TriggerSmartContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONSTANT_CONTRACT:
          serviceImpl.triggerConstantContract((org.lgcy.Legacy.proto.Contract.TriggerSmartContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONSTANT_CONTRACT2:
          serviceImpl.triggerConstantContract2((org.lgcy.Legacy.proto.Contract.TriggerSmartContract) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.TransactionExtention2>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.NodeInfo>) responseObserver);
          break;
        case METHODID_LIST_NODES:
          serviceImpl.listNodes((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.NodeList>) responseObserver);
          break;
        case METHODID_GET_CHAIN_PARAMETERS:
          serviceImpl.getChainParameters((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ChainParameters>) responseObserver);
          break;
        case METHODID_TOTAL_TRANSACTION:
          serviceImpl.totalTransaction((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_NEXT_MAINTENANCE_TIME:
          serviceImpl.getNextMaintenanceTime((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN_WEIGHT:
          serviceImpl.getTransactionSignWeight((org.lgcy.Legacy.proto.Chain.Transaction) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionSignWeight>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_APPROVED_LIST:
          serviceImpl.getTransactionApprovedList((org.lgcy.Legacy.proto.Chain.Transaction) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionApprovedList>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BY_ID:
          serviceImpl.getAccountById((org.lgcy.Legacy.api.GrpcAPI.AccountIdMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_NET:
          serviceImpl.getAccountNet((org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AccountNetMessage>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_RESOURCE:
          serviceImpl.getAccountResource((org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AccountResourceMessage>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ACCOUNT:
          serviceImpl.getAssetIssueByAccount((org.lgcy.Legacy.api.GrpcAPI.AccountAddressMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_NAME:
          serviceImpl.getAssetIssueByName((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Contract.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST_BY_NAME:
          serviceImpl.getAssetIssueListByName((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ID:
          serviceImpl.getAssetIssueById((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Contract.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST:
          serviceImpl.getAssetIssueList((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_ASSET_ISSUE_LIST:
          serviceImpl.getPaginatedAssetIssueList((org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK:
          serviceImpl.getNowBlock((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK2:
          serviceImpl.getNowBlock2((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM:
          serviceImpl.getBlockByNum((org.lgcy.Legacy.api.GrpcAPI.NumberMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM2:
          serviceImpl.getBlockByNum2((org.lgcy.Legacy.api.GrpcAPI.NumberMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_ID:
          serviceImpl.getBlockById((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT:
          serviceImpl.getBlockByLimitNext((org.lgcy.Legacy.api.GrpcAPI.BlockLimit) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT2:
          serviceImpl.getBlockByLimitNext2((org.lgcy.Legacy.api.GrpcAPI.BlockLimit) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM:
          serviceImpl.getBlockByLatestNum((org.lgcy.Legacy.api.GrpcAPI.NumberMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM2:
          serviceImpl.getBlockByLatestNum2((org.lgcy.Legacy.api.GrpcAPI.NumberMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM:
          serviceImpl.getTransactionCountByBlockNum((org.lgcy.Legacy.api.GrpcAPI.NumberMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.Transactioncountbyblocknum>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_ID:
          serviceImpl.getTransactionById((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_ID3:
          serviceImpl.getTransactionById3((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.NewTransactionOuterClass.NewTransaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_ID:
          serviceImpl.getTransactionInfoById((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionInfo>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM:
          serviceImpl.getTransactionInfoByBlockNum((org.lgcy.Legacy.api.GrpcAPI.NumberMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionInfoList>) responseObserver);
          break;
        case METHODID_GET_CONTRACT:
          serviceImpl.getContract((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Common.SmartContract>) responseObserver);
          break;
        case METHODID_GET_CONTRACT_INFO:
          serviceImpl.getContractInfo((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.SmartContractDataWrapper>) responseObserver);
          break;
        case METHODID_LIST_WITNESSES:
          serviceImpl.listWitnesses((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.WitnessList>) responseObserver);
          break;
        case METHODID_GET_BROKERAGE_INFO:
          serviceImpl.getBrokerageInfo((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_BROKERAGE:
          serviceImpl.getBrokerage((org.lgcy.Legacy.api.GrpcAPI.InputBrokerage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.BrokerageMessage>) responseObserver);
          break;
        case METHODID_GET_REWARD_INFO:
          serviceImpl.getRewardInfo((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_REWARD:
          serviceImpl.getReward((org.lgcy.Legacy.api.GrpcAPI.RewardMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.RewardOutput>) responseObserver);
          break;
        case METHODID_LIST_PROPOSALS:
          serviceImpl.listProposals((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ProposalList>) responseObserver);
          break;
        case METHODID_GET_PROPOSAL_BY_ID:
          serviceImpl.getProposalById((org.lgcy.Legacy.api.GrpcAPI.ProposalInput) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Proposal>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_PROPOSAL_LIST:
          serviceImpl.getPaginatedProposalList((org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ProposalList>) responseObserver);
          break;
        case METHODID_GET_EXCHANGE_BY_ID:
          serviceImpl.getExchangeById((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.Exchange>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_EXCHANGE_LIST:
          serviceImpl.getPaginatedExchangeList((org.lgcy.Legacy.api.GrpcAPI.PaginatedMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.ExchangeList>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN:
          serviceImpl.getTransactionSign((org.lgcy.Legacy.proto.Response.TransactionSign) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN2:
          serviceImpl.getTransactionSign2((org.lgcy.Legacy.proto.Response.TransactionSign) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET:
          serviceImpl.easyTransferAsset((org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE:
          serviceImpl.easyTransferAssetByPrivate((org.lgcy.Legacy.api.GrpcAPI.EasyTransferAssetByPrivateMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER:
          serviceImpl.easyTransfer((org.lgcy.Legacy.api.GrpcAPI.EasyTransferMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_BY_PRIVATE:
          serviceImpl.easyTransferByPrivate((org.lgcy.Legacy.api.GrpcAPI.EasyTransferByPrivateMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((org.lgcy.Legacy.api.GrpcAPI.BytesMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GENERATE_ADDRESS:
          serviceImpl.generateAddress((org.lgcy.Legacy.api.GrpcAPI.EmptyMessage) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.AddressPrKeyPairMessage>) responseObserver);
          break;
        case METHODID_ADD_SIGN:
          serviceImpl.addSign((org.lgcy.Legacy.proto.Response.TransactionSign) request,
                  (io.grpc.stub.StreamObserver<org.lgcy.Legacy.proto.Response.TransactionExtention>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
            io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WalletBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.lgcy.Legacy.api.GrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Wallet");
    }
  }

  private static final class WalletFileDescriptorSupplier
          extends WalletBaseDescriptorSupplier {
    WalletFileDescriptorSupplier() {}
  }

  private static final class WalletMethodDescriptorSupplier
          extends WalletBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WalletGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new WalletFileDescriptorSupplier())
                  .addMethod(getBroadcastTransactionMethod())
                  .addMethod(getBroadcastTransactionDataMethod())
                  .addMethod(getCreateCommonTransactionMethod())
                  .addMethod(getCreateAccountMethod())
                  .addMethod(getCreateAccount2Method())
                  .addMethod(getUpdateAccountMethod())
                  .addMethod(getSetAccountIdMethod())
                  .addMethod(getAccountPermissionUpdateMethod())
                  .addMethod(getCreateTransactionMethod())
                  .addMethod(getSignTransactionCreationMethod())
                  .addMethod(getCreateAssetIssueMethod())
                  .addMethod(getCreateAssetIssue2Method())
                  .addMethod(getUpdateAssetMethod())
                  .addMethod(getUpdateAsset2Method())
                  .addMethod(getTransferAssetMethod())
                  .addMethod(getTransferAsset2Method())
                  .addMethod(getParticipateAssetIssueMethod())
                  .addMethod(getParticipateAssetIssue2Method())
                  .addMethod(getUnfreezeAssetMethod())
                  .addMethod(getUnfreezeAsset2Method())
                  .addMethod(getCreateWitnessMethod())
                  .addMethod(getUpdateWitnessMethod())
                  .addMethod(getUpdateBrokerageMethod())
                  .addMethod(getVoteWitnessAccountMethod())
                  .addMethod(getFreezeBalanceMethod())
                  .addMethod(getUnfreezeBalanceMethod())
                  .addMethod(getWithdrawBalanceMethod())
                  .addMethod(getUpdateSettingMethod())
                  .addMethod(getProposalCreateMethod())
                  .addMethod(getProposalApproveMethod())
                  .addMethod(getProposalDeleteMethod())
                  .addMethod(getDeployContractMethod())
                  .addMethod(getTriggerContractMethod())
                  .addMethod(getTriggerConstantContractMethod())
                  .addMethod(getTriggerConstantContract2Method())
                  .addMethod(getGetNodeInfoMethod())
                  .addMethod(getListNodesMethod())
                  .addMethod(getGetChainParametersMethod())
                  .addMethod(getTotalTransactionMethod())
                  .addMethod(getGetNextMaintenanceTimeMethod())
                  .addMethod(getGetTransactionSignWeightMethod())
                  .addMethod(getGetTransactionApprovedListMethod())
                  .addMethod(getGetAccountMethod())
                  .addMethod(getGetAccountByIdMethod())
                  .addMethod(getGetAccountNetMethod())
                  .addMethod(getGetAccountResourceMethod())
                  .addMethod(getGetAssetIssueByAccountMethod())
                  .addMethod(getGetAssetIssueByNameMethod())
                  .addMethod(getGetAssetIssueListByNameMethod())
                  .addMethod(getGetAssetIssueByIdMethod())
                  .addMethod(getGetAssetIssueListMethod())
                  .addMethod(getGetPaginatedAssetIssueListMethod())
                  .addMethod(getGetNowBlockMethod())
                  .addMethod(getGetNowBlock2Method())
                  .addMethod(getGetBlockByNumMethod())
                  .addMethod(getGetBlockByNum2Method())
                  .addMethod(getGetBlockByIdMethod())
                  .addMethod(getGetBlockByLimitNextMethod())
                  .addMethod(getGetBlockByLimitNext2Method())
                  .addMethod(getGetBlockByLatestNumMethod())
                  .addMethod(getGetBlockByLatestNum2Method())
                  .addMethod(getGetTransactionCountByBlockNumMethod())
                  .addMethod(getGetTransactionByIdMethod())
                  .addMethod(getGetTransactionById3Method())
                  .addMethod(getGetTransactionInfoByIdMethod())
                  .addMethod(getGetTransactionInfoByBlockNumMethod())
                  .addMethod(getGetContractMethod())
                  .addMethod(getGetContractInfoMethod())
                  .addMethod(getListWitnessesMethod())
                  .addMethod(getGetBrokerageInfoMethod())
                  .addMethod(getGetBrokerageMethod())
                  .addMethod(getGetRewardInfoMethod())
                  .addMethod(getGetRewardMethod())
                  .addMethod(getListProposalsMethod())
                  .addMethod(getGetProposalByIdMethod())
                  .addMethod(getGetPaginatedProposalListMethod())
                  .addMethod(getGetExchangeByIdMethod())
                  .addMethod(getGetPaginatedExchangeListMethod())
                  .addMethod(getGetTransactionSignMethod())
                  .addMethod(getGetTransactionSign2Method())
                  .addMethod(getEasyTransferAssetMethod())
                  .addMethod(getEasyTransferAssetByPrivateMethod())
                  .addMethod(getEasyTransferMethod())
                  .addMethod(getEasyTransferByPrivateMethod())
                  .addMethod(getCreateAddressMethod())
                  .addMethod(getGenerateAddressMethod())
                  .addMethod(getAddSignMethod())
                  .build();
        }
      }
    }
    return result;
  }
}
