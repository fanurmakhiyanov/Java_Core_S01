package ru.gb.lesson1.regular;

/**
 * Другой, очень полезный класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */

public class OtherClass {

    /**
     * Функция суммирования двух целых чисел
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b, без проверки на переполнение переменной.
     */
    public static int add(int a, int b) {
        return a + b; // возврат без проверки переполнения
    }

    public static int div(int a, int b) {
        return a / b; // возврат без проверки переполнения
    }

    public static int mul(int a, int b) {
        return a * b; // возврат без проверки переполнения
    }

    public static int sub(int a, int b) {
        return a - b; // возврат без проверки переполнения
    }

}
