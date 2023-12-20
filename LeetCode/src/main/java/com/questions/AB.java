package com.questions;

interface C {
    public default void print() {
       System.out.println("Hello mates!");
    }
}


interface B {
    public default void print() {
       System.out.println("Hello world!");
    }
}

public class AB implements C, B {
   @Override
   public void print() {
      System.out.println("Must override");
   }
}
