package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstUniqueCharTest {

    @Test
    void firstUniqChar() {
        FindFirstUniqueChar findFirstUniqueChar = new FindFirstUniqueChar();
        int leetcode = findFirstUniqueChar.firstUniqChar("loveleetcode");
        Assertions.assertEquals(2, leetcode);
    }

    @Test
    void firstUniqCharSecond() {
        FindFirstUniqueChar findFirstUniqueChar = new FindFirstUniqueChar();
        int leetcode = findFirstUniqueChar.firstUniqChar("acaadcad");
        Assertions.assertEquals(-1, leetcode);
    }
    @Test
    void firstUniqCharOptimalOK() {
        FindFirstUniqueChar findFirstUniqueChar = new FindFirstUniqueChar();
        int leetcode = findFirstUniqueChar.firstUniqueCharOptimal("loveleetcode");
        Assertions.assertEquals(2, leetcode);
    }

    @Test
    void firstUniqCharSecondOptimalOK() {
        FindFirstUniqueChar findFirstUniqueChar = new FindFirstUniqueChar();
        int leetcode = findFirstUniqueChar.firstUniqueCharOptimal("acaadcad");
        Assertions.assertEquals(-1, leetcode);
    }
}