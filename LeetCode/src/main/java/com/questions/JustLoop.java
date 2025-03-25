package com.questions;

import java.util.ArrayList;
import java.util.List;

public class JustLoop {
    private int j;

    public static void main(String[] args) {
        new JustLoop().showJ();
        List sl = new ArrayList();
        sl.add("a");
        sl.add("b");
        sl.add("c");
        sl.add("a");
        System.out.println(sl.remove("a") + " " + sl.remove("x"));
        int i = 1;
        int j = i++;
        if ((i == ++j)| (i++ == j)){
            i += j;
        }
        System.out.println(i);

    }

    void showJ() {
        while (j <= 5) {
            for (int j = 1; j <= 5; ) {
                System.out.print(j + " ");
                j++;
            }
            j++;
        }
    }
}


