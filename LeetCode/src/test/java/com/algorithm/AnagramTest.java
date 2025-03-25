package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram() {
        Anagram anogram = new Anagram();
        String s = "ggii";
        String t = "eekk";
        boolean actual = anogram.isAnagram(s, t);
        assertFalse(actual);
    }

}