package com.algorithm;

import static org.junit.jupiter.api.Assertions.*;

class RemoveETest {

    @org.junit.jupiter.api.Test
    void removeElement() {
        RemoveE removeE = new RemoveE();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int actual = removeE.removeElement(nums, val);
        assertEquals(2, actual);
    }

    @org.junit.jupiter.api.Test
    void removeElement2() {
        RemoveE removeE = new RemoveE();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int actual = removeE.removeElement(nums, val);
        assertEquals(3, actual);
    }

}