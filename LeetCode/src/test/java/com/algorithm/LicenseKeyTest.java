package com.algorithm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LicenseKeyTest {

    @Test
    void formatKey() {
        LicenseKey licenseKey = new LicenseKey();
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String s1 = licenseKey.formatKey(s, 4);
        Assertions.assertEquals("5F3Z-2E9W", s1);
    }
}