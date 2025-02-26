package com.algorithm;

public class LicenseKey {
    public static String formatKey(String s, int k) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String replace = s.replace("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder();
        int length = replace.length();
        int firstGroup = length % k;
        for (int i = 0; i < firstGroup; i++) {
            sb.append(replace.charAt(i));
        }
        sb.append("-");
        while (firstGroup < length) {
            for (int i = 0; i < k; i++) {
                sb.append(replace.charAt(firstGroup));
                firstGroup++;
            }
            if (firstGroup != length) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String s1 = LicenseKey.formatKey(s, 4);
    }
}
