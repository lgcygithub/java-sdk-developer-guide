package org.lgcy.Legacy.abi.datatypes.generated;

import java.math.BigInteger;
import org.lgcy.Legacy.abi.datatypes.Int;

/**
 * Auto generated code.
 * <p>Please use org.lgcy.Legacy.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Int256 extends Int {
    public static final Int256 DEFAULT = new Int256(BigInteger.ZERO);

    public Int256(BigInteger value) {
        super(256, value);
    }

    public Int256(long value) {
        this(BigInteger.valueOf(value));
    }
}
