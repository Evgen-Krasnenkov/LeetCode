package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        new ValidParentheses().isValid("()");
    }

    @Test
    void isValidNoSymmetric() {
        boolean valid = new ValidParentheses().isValid("]");
        assertFalse(valid);
    }
}