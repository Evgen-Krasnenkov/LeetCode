package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsTest {

    @Test
    void mergeAlternately() {
        MergeStrings mergeStrings = new MergeStrings();
        String merged = mergeStrings.mergeAlternately("abc", "pqr");
        assertEquals("apbqcr", merged);
    }

    @Test
    void mergeAlternatelyFirstSmaller() {
        MergeStrings mergeStrings = new MergeStrings();
        String merged = mergeStrings.mergeAlternately("ab", "pqrs");
        assertEquals("apbqrs", merged);
    }
}