package org.lgcy.Legacy.abi.datatypes.generated;

import java.math.BigInteger;
import org.lgcy.Legacy.abi.datatypes.Uint;

/**
 * Auto generated code.
 * <p>Please use org.lgcy.Legacy.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Uint80 extends Uint {
    public static final Uint80 DEFAULT = new Uint80(BigInteger.ZERO);

    public Uint80(BigInteger value) {
        super(80, value);
    }

    public Uint80(long value) {
        this(BigInteger.valueOf(value));
    }
}
