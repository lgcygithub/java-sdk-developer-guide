package org.lgcy.Legacy.abi.datatypes.generated;

import java.util.List;

import org.lgcy.Legacy.abi.datatypes.StaticArray;
import org.lgcy.Legacy.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p>Please use org.lgcy.Legacy.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray18<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray18(List<T> values) {
        super(18, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray18(T... values) {
        super(18, values);
    }

    public StaticArray18(Class<T> type, List<T> values) {
        super(type, 18, values);
    }

    @SafeVarargs
    public StaticArray18(Class<T> type, T... values) {
        super(type, 18, values);
    }
}
