package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MaxOfSlidingWindowTest {
    @Test
    public  void  givenArray_whenWindow3_then6MaxLoop(){
        int[] numbers = {1,3,-1,-3,5,3,6,7};
        MaxOfSlidingWindow maxOfSlidingWindow = new MaxOfSlidingWindow();
        int[] window = maxOfSlidingWindow.maxSlidingWindowLoop(numbers, 3);
        int[] maxs = {3, 3, 5, 5, 6, 7};
        Assertions.assertArrayEquals(maxs, window);
    }
    @Test
    public  void  givenArray_whenWindow3_then6Max(){
        int[] numbers = {1,3,-1,-3,5,3,6,7};
        MaxOfSlidingWindow maxOfSlidingWindow = new MaxOfSlidingWindow();
        int[] window = maxOfSlidingWindow.maxSlidingWindow(numbers, 3);
        int[] maxs = {3, 3, 5, 5, 6, 7};
        Assertions.assertArrayEquals(maxs, window);
    }

    @Test
    public  void  givenArray_whenWindow3_then6MaxDeque(){
        int[] numbers = {1,3,-1,-3,5,3,6,7};
        MaxOfSlidingWindow maxOfSlidingWindow = new MaxOfSlidingWindow();
        int[] window = maxOfSlidingWindow.maxSlidingWindowDeque(numbers, 3);
        int[] maxs = {3, 3, 5, 5, 6, 7};
        Assertions.assertArrayEquals(maxs, window);
    }

    @Test
    public  void  givenArray_whenWindow3_then6MaxLeftSum(){
        int[] numbers = {-7,-8,7,5,7,1,6,0};
        MaxOfSlidingWindow maxOfSlidingWindow = new MaxOfSlidingWindow();
        int[] window = maxOfSlidingWindow.maxSlidingWindowAlex(numbers, 4);
        int[] maxs = {7,7,7,7,7};
        Assertions.assertArrayEquals(maxs, window);
    }

    @Test
    public  void  givenArray_whenWindow3_then6MaxLeftSumLarge() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/main/java/com/algorithm/numbers"));
        int[] number = lines.stream()
                .flatMap(line -> Arrays.stream(line.split(",")))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers = {1,3,-1,-3,5,3,6,7};
        MaxOfSlidingWindow maxOfSlidingWindow = new MaxOfSlidingWindow();
        int[] window = maxOfSlidingWindow.maxSlidingWindowAlex(numbers, 3);
        Assertions.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, window);
    }

}
