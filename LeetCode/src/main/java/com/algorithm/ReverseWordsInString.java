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
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        String sentence = Arrays.stream(words)
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
        if (word.length() % 2 != 0) {
            characters[word.length() / 2] = word.charAt(word.length() / 2);
        }
        for (int i = 0; i < word.length() / 2; i++) {
            char charAt = word.charAt(i);
            characters[i] = word.charAt(word.length() - i - 1);
            characters[word.length() - i - 1] = charAt;
        }
        return new String(characters);
    }
}
