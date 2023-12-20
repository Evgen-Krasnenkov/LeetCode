package com.questions;

abstract class AbstractShape {
    abstract void draw();
}

interface Drawable {
    void draw();
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Using anonymous class with an abstract class
        AbstractShape circle = new AbstractShape() {
            @Override
            void draw() {
                System.out.println("Drawing a circle");
            }
        };
        circle.draw();

        // Using anonymous class with an interface
        Drawable rectangle = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing a rectangle");
            }
        };
        rectangle.draw();
    }
}
