package com.algorithm;

public class LongestNonRepeatingSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int longest = 0;
        int[] table = new int[127];
        int left = 0;
        int i = 0;
        for (i = 0; i < s.length(); i++) {
            int place = s.charAt(i);
            table[place]++;
            while (table[place] > 1) {
                table[s.charAt(left)]--;
                left++;
            }
            longest = Math.max(longest, i - left + 1);
        }
        return longest;
    }
}
