package org.lgcy.Legacy.abi.datatypes.generated;

import java.util.List;

import org.lgcy.Legacy.abi.datatypes.StaticArray;
import org.lgcy.Legacy.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p>Please use org.lgcy.Legacy.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray5<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray5(List<T> values) {
        super(5, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray5(T... values) {
        super(5, values);
    }

    public StaticArray5(Class<T> type, List<T> values) {
        super(type, 5, values);
    }

    @SafeVarargs
    public StaticArray5(Class<T> type, T... values) {
        super(type, 5, values);
    }
}
