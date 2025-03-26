package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestNonRepeatingSubstringTest {

    @Test
    void lengthOfLongestSubstring() {
        LongestNonRepeatingSubstring longestNonRepeatingSubstring = new LongestNonRepeatingSubstring();
        int length = longestNonRepeatingSubstring.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, length);
    }
}