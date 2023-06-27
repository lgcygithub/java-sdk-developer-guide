package org.lgcy.Legacy.core.contract;

import org.bouncycastle.util.encoders.Hex;

import com.google.protobuf.ByteString;
import org.lgcy.Legacy.core.exceptions.ContractCreateException;
import org.lgcy.Legacy.abi.datatypes.Type;
import org.lgcy.Legacy.abi.TypeEncoder;
import org.lgcy.Legacy.proto.Common.SmartContract.ABI.Entry;
import org.lgcy.Legacy.proto.Common.SmartContract.ABI.Entry.Param;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;

public class ContractConstructor {

    private Entry rawConstructor;

    private List paramTypes;

    private boolean payable;

    private ByteString bytecode = null;
    
    public ContractConstructor(Entry raw) {
        this.rawConstructor = raw;
        this.paramTypes = new ArrayList<String>();
        
        for (Param p : raw.getInputsList()) {
            paramTypes.add(p.getType());
        }

        this.payable = raw.getPayable();
    }

    public Entry getRawConstructor() {
        return this.rawConstructor;
    }

    public List getParamTypes() {
        return this.paramTypes;
    }

    public boolean getPayable() {
        return this.payable;
    }

    public ByteString getBytecode() {
        return this.bytecode;
    }

    public void encodeParameter(List<Type> params) throws ContractCreateException {
        if (params.size() != paramTypes.size()) {
            throw new ContractCreateException("Parameter amount doesn't match.");
        }
        StringBuilder builder = new StringBuilder();
        for (Type p : params) {
            builder.append(TypeEncoder.encode(p));
        }
        this.bytecode = ByteString.copyFrom(Hex.decode(builder.toString()));
    }
}
