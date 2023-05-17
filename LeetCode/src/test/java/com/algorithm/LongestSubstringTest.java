package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringTest {
    @Test
    void givenString_whenUniqueSubstring_thenReturnLongest() {
        LongestSubstring longestSubstring = new LongestSubstring();
        String input = "abcabcbb";
        int actual = longestSubstring.lengthOfLongestSubstring(input);
        Assertions.assertEquals(3, actual);
    }

    @Test
    void givenStringSpace_whenUniqueSubstring_thenReturnOne() {
        LongestSubstring longestSubstring = new LongestSubstring();
        String input = " ";
        int actual = longestSubstring.lengthOfLongestSubstring(input);
        Assertions.assertEquals(1, actual);
    }

    @Test
    void givenStringThreeLetters_whenUniqueSubstring_thenReturn() {
        LongestSubstring longestSubstring = new LongestSubstring();
        String input = "aab";
        int actual = longestSubstring.lengthOfLongestSubstring(input);
        Assertions.assertEquals(2, actual);
    }

    @Test
    void givenStringDvd_whenUniqueSubstring_thenReturn() {
        LongestSubstring longestSubstring = new LongestSubstring();
        String input = "dvdf";
        int actual = longestSubstring.lengthOfLongestSubstring(input);
        Assertions.assertEquals(3, actual);
    }

}