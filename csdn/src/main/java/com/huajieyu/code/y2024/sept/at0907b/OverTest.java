package com.huajieyu.code.y2024.sept.at0907b;

public class OverTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        start(shape);
        start(circle);
        start(rectangle);
    }

    public static void start(Shape shape){
        shape.run();
    }

    public static void main2(String[] args) {
        Animal animal = new Animal();
        animal.say(18);
        animal.say(24, 50);
        animal.say("john");
    }
}
