package com.algorithm;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FindFirstUniqueChar {
    public int firstUniqChar(String s) {
        int i = 0;
        int index = -1;
        while (i < s.length()){
            char tempChar = s.charAt(i);
            if (s.indexOf(tempChar) == s.lastIndexOf(tempChar)) {
                index = i;
                break;
            }
            i++;
        }
        return index;
    }

    public int firstUniqueCharOptimal(String s) {
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            count[chars[i] - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[chars[i] - 'a'] == 1) return i;
        }
        return -1;
    }
}
