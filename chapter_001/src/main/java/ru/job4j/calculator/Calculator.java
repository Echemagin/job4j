package ru.job4j.calculator;

/**
 * Class Calculator для решения задачи 3.3 Элементарный калькулятор.
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 11.10.2019
 */

public class Calculator {

    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }

    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }

    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }

    public static void subtrack(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }

    /**
     * Метод main для запуска программы
     * @param args - аргументы при запуске программы
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
