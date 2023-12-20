package com.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorAnonymousClassExample {
    public static void main(String[] args) {
        // List of strings to sort
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Alice", "Bob");

        // Anonymous class that overrides compare method to sort in reverse order
        Comparator<String> reverseOrderComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // Reverse order
            }
        };

        // Sorting the list using the comparator
        names.sort(reverseOrderComparator);

        // Printing the sorted list
        for (String name : names) {
            System.out.println(name);
        }
    }
}
