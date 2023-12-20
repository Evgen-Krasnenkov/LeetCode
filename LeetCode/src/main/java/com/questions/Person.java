package com.questions;

public class Person implements Comparable<Person> {
    private String name;

    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}
