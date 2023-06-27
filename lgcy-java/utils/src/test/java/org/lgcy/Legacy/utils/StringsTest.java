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
package org.lgcy.Legacy.utils;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringsTest {

    @Test
    public void testToCsv() {
        assertEquals(Strings.toCsv(Collections.<String>emptyList()), (""));
        assertEquals(Strings.toCsv(Collections.singletonList("a")), ("a"));
        assertEquals(Strings.toCsv(Arrays.asList("a", "b", "c")), ("a, b, c"));
    }

    @Test
    public void testJoin() {
        assertEquals(Strings.join(Arrays.asList("a", "b"), "|"), ("a|b"));
        assertNull(Strings.join(null, "|"));
        assertEquals(Strings.join(Collections.singletonList("a"), "|"), ("a"));
    }

    @Test
    public void testCapitaliseFirstLetter() {
        assertEquals(Strings.capitaliseFirstLetter(""), (""));
        assertEquals(Strings.capitaliseFirstLetter("a"), ("A"));
        assertEquals(Strings.capitaliseFirstLetter("aa"), ("Aa"));
        assertEquals(Strings.capitaliseFirstLetter("A"), ("A"));
        assertEquals(Strings.capitaliseFirstLetter("Ab"), ("Ab"));
    }

    @Test
    public void testLowercaseFirstLetter() {
        assertEquals(Strings.lowercaseFirstLetter(""), (""));
        assertEquals(Strings.lowercaseFirstLetter("A"), ("a"));
        assertEquals(Strings.lowercaseFirstLetter("AA"), ("aA"));
        assertEquals(Strings.lowercaseFirstLetter("a"), ("a"));
        assertEquals(Strings.lowercaseFirstLetter("aB"), ("aB"));
    }

    @Test
    public void testRepeat() {
        assertEquals(Strings.repeat('0', 0), (""));
        assertEquals(Strings.repeat('1', 3), ("111"));
    }

    @Test
    public void testZeros() {
        assertEquals(Strings.zeros(0), (""));
        assertEquals(Strings.zeros(3), ("000"));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    public void testEmptyString() {
        assertTrue(Strings.isEmpty(null));
        assertTrue(Strings.isEmpty(""));
        assertFalse(Strings.isEmpty("hello world"));
    }
}
