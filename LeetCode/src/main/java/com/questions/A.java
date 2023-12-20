package com.questions;

public class A {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void say(A a) {
        a = new A();
        a.setA(2);
    }

    public static void main(String[] args) {
        A a = new A();
        a.setA(1);
        say(a);
        int a1 = a.getA();

    }
}
