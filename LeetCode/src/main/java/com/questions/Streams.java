package com.questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> strings = List.of("sdfdfa", "sdfasdf", "dsfas", "fasdfasd", "fs", "sdfsdf", "user", "user", "sys", "sys", "sys");
        Map<Integer, List<String>> collect = strings.stream()
                .collect(Collectors.groupingBy(str -> str.length())
                );
        Map<String, Long> map = strings.stream()
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        System.out.println(collect);
    }
}
