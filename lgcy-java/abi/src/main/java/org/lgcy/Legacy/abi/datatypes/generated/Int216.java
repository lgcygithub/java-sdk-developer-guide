package org.lgcy.Legacy.abi.datatypes.generated;

import java.math.BigInteger;
import org.lgcy.Legacy.abi.datatypes.Int;

/**
 * Auto generated code.
 * <p>Please use org.lgcy.Legacy.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Int216 extends Int {
    public static final Int216 DEFAULT = new Int216(BigInteger.ZERO);

    public Int216(BigInteger value) {
        super(216, value);
    }

    public Int216(long value) {
        this(BigInteger.valueOf(value));
    }
}
