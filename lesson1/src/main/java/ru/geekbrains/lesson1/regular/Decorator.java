package ru.geekbrains.lesson1.regular;

/**
 * Декаратор. Он декорирурет, то есть, накладывает на результат деокрации.
 * Внешний вид важен, поэтому этот класс существет.
 */
public class Decorator {

    public static String decorate(int a) {
        /*
        *  Метод докорирует число, добавляя к нему строку
        *  при помощи функции форматирования строк
        */
        return String.format("Here is your number: %d", a);
    }

}
