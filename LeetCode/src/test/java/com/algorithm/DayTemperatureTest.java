package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayTemperatureTest {
    @Test
    void given_when_then() {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] arr2 = {30,40,50,60};
        int[] arr3 = {30,60,90};
        int[] exp = {1,1,4,2,1,1,0,0};
        int[] exp2 = {1,1,1,0};
        int[] exp3 = {1,1,0};
        DayTemperature dayTemperature = new DayTemperature();
        int[] actual = dayTemperature.dailyTemperatures(arr);
        Assertions.assertArrayEquals(exp, actual);
        int[] actual2 = dayTemperature.dailyTemperatures(arr2);
        Assertions.assertArrayEquals(exp2, actual2);
        int[] actual3 = dayTemperature.dailyTemperatures(arr3);
        Assertions.assertArrayEquals(exp3, actual3);
    }

    @Test
    void givenNew_when_then() {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] arr2 = {30,40,50,60};
        int[] arr3 = {30,60,90};
        int[] exp = {1,1,4,2,1,1,0,0};
        int[] exp2 = {1,1,1,0};
        int[] exp3 = {1,1,0};
        DayTemperature dayTemperature = new DayTemperature();
        int[] actual = dayTemperature.dailyAi(arr);
        Assertions.assertArrayEquals(exp, actual);
        int[] actual2 = dayTemperature.dailyAi(arr2);
        Assertions.assertArrayEquals(exp2, actual2);
        int[] actual3 = dayTemperature.dailyAi(arr3);
        Assertions.assertArrayEquals(exp3, actual3);
    }

}