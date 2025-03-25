package com.algorithm;

/*
https://leetcode.com/problems/valid-anagram
 */


public class Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            boolean isAnagram = true;
            int[] charIndexs = new int[26];
            for (int i = 0; i < s.length(); i++) {
                charIndexs[s.charAt(i) - 'a']++;
                charIndexs[t.charAt(i) - 'a']--;
            }

            for (int i = 0; i < t.length(); i++) {
                if (charIndexs[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
            return isAnagram;
        }
    }
}
