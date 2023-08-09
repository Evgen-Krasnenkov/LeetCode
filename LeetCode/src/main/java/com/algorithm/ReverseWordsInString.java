package com.algorithm;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class ReverseWordsInString {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]);
            if (i != 0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    public String reverseWordsStream(String s) {
        String[] words = s.trim().split("\\s+");
        String[] reverseOrder = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reverseOrder[words.length - i - 1] = words[i];
        }
        String sentence = Arrays.stream(reverseOrder)
                .collect(Collectors.joining(" "));
        return sentence;
    }

    public String reverseWordsInString(String s) {
        String[] words = s.trim().split("\\s+");
        String sentence = Arrays.stream(words)
                .map(w -> reverse(w))
                .collect(Collectors.joining(" "));
        return sentence;
    }

    private String reverse(String word) {
        char[] characters = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            char charAt = word.charAt(i);
            characters[word.length() - i - 1] = charAt;
        }
        return new String(characters);
    }
}
