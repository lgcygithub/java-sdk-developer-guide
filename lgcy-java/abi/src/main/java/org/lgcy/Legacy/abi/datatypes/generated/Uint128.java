package org.lgcy.Legacy.abi.datatypes.generated;

import java.math.BigInteger;

import org.lgcy.Legacy.abi.datatypes.Uint;

/**
 * Auto generated code.
 * <p>Please use org.lgcy.Legacy.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Uint128 extends Uint {
    public static final Uint128 DEFAULT = new Uint128(BigInteger.ZERO);

    public Uint128(BigInteger value) {
        super(128, value);
    }

    public Uint128(long value) {
        this(BigInteger.valueOf(value));
    }
}
