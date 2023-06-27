package org.lgcy.Legacy.abi.datatypes.generated;

import java.util.List;

import org.lgcy.Legacy.abi.datatypes.StaticArray;
import org.lgcy.Legacy.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p>Please use org.lgcy.Leagcy.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray21<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray21(List<T> values) {
        super(21, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray21(T... values) {
        super(21, values);
    }

    public StaticArray21(Class<T> type, List<T> values) {
        super(type, 21, values);
    }

    @SafeVarargs
    public StaticArray21(Class<T> type, T... values) {
        super(type, 21, values);
    }
}
