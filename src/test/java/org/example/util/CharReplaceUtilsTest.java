package org.example.util;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CharReplaceUtilsTest {

    @Test
    void testReplaceOneSubstring() {
        char[] source = {'a', 'b', 'c', 'd', 'e'};
        char[] find = {'b', 'c'};
        char replace = 'x';

        char[] result = CharReplaceUtils.replace(source, find, replace);
        assertArrayEquals(new char[]{'a', 'x', 'd', 'e'}, result);
    }

    @Test
    void testReplaceWholeArrayWithSingleCharacter() {
        char[] source = {'a', 'a', 'a'};
        char[] find = {'a', 'a', 'a'};
        char replace = 'x';

        char[] result = CharReplaceUtils.replace(source, find, replace);
        assertArrayEquals(new char[]{'x'}, result);
    }

    @Test
    void testSubstringNotPresent() {
        char[] source = {'a', 'b', 'c', 'd'};
        char[] find = {'e', 'f'};
        char replace = 'x';

        char[] result = CharReplaceUtils.replace(source, find, replace);
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd'}, result);
    }

    @Test
    void testReplaceAtStartOfArray() {
        char[] source = {'a', 'b', 'c', 'd'};
        char[] find = {'a', 'b'};
        char replace = 'x';

        char[] result = CharReplaceUtils.replace(source, find, replace);
        assertArrayEquals(new char[]{'x', 'c', 'd'}, result);
    }

    @Test
    void testReplaceAtEndOfArray() {
        char[] source = {'a', 'b', 'c', 'd'};
        char[] find = {'c', 'd'};
        char replace = 'x';

        char[] result = CharReplaceUtils.replace(source, find, replace);
        assertArrayEquals(new char[]{'a', 'b', 'x'}, result);
    }

    @Test
    void testMultipleOccurrencesOfSubstring() {
        char[] source = {'a', 'b', 'a', 'b', 'a', 'b'};
        char[] find = {'a', 'b'};
        char replace = 'x';

        char[] result = CharReplaceUtils.replace(source, find, replace);
        assertArrayEquals(new char[]{'x', 'x', 'x'}, result);
    }

    @Test
    void testEmptyFindArray() {
        char[] source = {'a', 'b', 'c'};
        char[] find = {};
        char replace = 'x';

        char[] result = CharReplaceUtils.replace(source, find, replace);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
    }
}
