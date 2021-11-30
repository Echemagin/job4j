package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public double divide(int t) {
        return t/x;
    }

    public double sumAllOperation(int f) {
        return sum(f) + minus(f) + multiply(f) + divide(f);
    }

    public static void main(String[] args) {
        int result = minus(10);
        System.out.println(result);

        Calculator calc = new Calculator();
        double res = calc.divide(10);
        System.out.println(res);

        res = calc.sumAllOperation(10);
        System.out.println(res);
    }
}
