package org.lgcy.Legacy.abi.datatypes.generated;

import java.math.BigInteger;
import org.lgcy.Legacy.abi.datatypes.Uint;

/**
 * Auto generated code.
 * <p>Please use org.lgcy.Legacy.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Uint40 extends Uint {
    public static final Uint40 DEFAULT = new Uint40(BigInteger.ZERO);

    public Uint40(BigInteger value) {
        super(40, value);
    }

    public Uint40(long value) {
        this(BigInteger.valueOf(value));
    }
}
