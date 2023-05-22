package ru.geekbrains.lesson1.sample;

import ru.geekbrains.lesson1.regular.Decorator;
import ru.geekbrains.lesson1.regular.OtherClass;

/**
 * javac -sourcepath ./java -d out java/ru/geekbrains/lesson1/sample/Main.java
 *
 * java -classpath ./out ru.geekbrains.lesson1.sample.Main
 */

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.add(2, 3);
        System.out.println(Decorator.decorate(result));

        result = OtherClass.sub(2, 3);
        System.out.println(Decorator.decorate(result));

        result = OtherClass.mul(2, 3);
        System.out.println(Decorator.decorate(result));

        result = OtherClass.div(2, 3);
        System.out.println(Decorator.decorate(result));

    }
}