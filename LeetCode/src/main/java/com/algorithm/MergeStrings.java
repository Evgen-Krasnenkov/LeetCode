package com.algorithm;

public class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());

        for(int i = 0; i < minLength; i++) {
            builder.append(word1.charAt(i)).
                    append(word2.charAt(i));
        }

        if (minLength == word1.length()) {
            builder.append(word2.substring(minLength));
        } else {
            builder.append(word1.substring(minLength));
        }
        return builder.toString();
    }
}
