package com.questions;

import java.util.Comparator;

public class AgeComparator implements Comparator<AgeComparator.Person> {
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }

    record Person(int age){

        public int getAge() {
            return age;
        }
    }
}

