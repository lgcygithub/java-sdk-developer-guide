/*
 * Copyright 2019 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.lgcy.Legacy.abi.datatypes.primitive;

import org.lgcy.Legacy.abi.datatypes.generated.Int32;
import org.lgcy.Legacy.abi.datatypes.NumericType;

public final class Int extends Number<Integer> {

    public Int(int value) {
        super(value);
    }

    @Override
    public NumericType toSolidityType() {
        return new Int32(getValue());
    }
}