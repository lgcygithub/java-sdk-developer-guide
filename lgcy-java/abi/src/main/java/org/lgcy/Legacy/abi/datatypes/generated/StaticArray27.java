package org.lgcy.Legacy.abi.datatypes.generated;

import java.util.List;

import org.lgcy.Legacy.abi.datatypes.StaticArray;
import org.lgcy.Legacy.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p>Please use org.lgcy.Legacy.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray27<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray27(List<T> values) {
        super(27, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray27(T... values) {
        super(27, values);
    }

    public StaticArray27(Class<T> type, List<T> values) {
        super(type, 27, values);
    }

    @SafeVarargs
    public StaticArray27(Class<T> type, T... values) {
        super(type, 27, values);
    }
}
