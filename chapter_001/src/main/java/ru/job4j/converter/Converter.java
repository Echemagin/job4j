package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static double euroToDollar(int value) {
        return value * (70d / 60d);
    }

    public static double dollarToEuro(int value) {
        return value * (60d / 70d);
    }

    public static void main(String[] args) {

        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(240);
        int ruble_first = euroToRuble(3);
        int ruble_second = dollarToRuble(5);
        double dollar_second = euroToDollar(30);
        double euro_second = dollarToEuro(40);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("240 rubles are " + dollar + " dollars.");
        System.out.println("3 euro are " + ruble_first + " rubles.");
        System.out.println("5 dollars are " + ruble_second + " rubles.");
        System.out.println("30 euro are " + dollar_second + " dollars.");
        System.out.println("40 dollars are " + euro_second + " euro.");

        int in_1 = 140;
        int expected_1 = 2;
        int out_1 = rubleToEuro(in_1);
        boolean passed_1 = expected_1 == out_1;
        System.out.println("Test result for rubleToEuro method passed:" + passed_1);

        int in_2 = 120;
        int expected_2 = 2;
        int out_2 = rubleToDollar(in_2);
        boolean passed_2 = expected_2 == out_2;
        System.out.println("Test result for rubleToDollar method passed:" + passed_2);

        int in_3 = 2;
        int expected_3 = 140;
        int out_3 = euroToRuble(in_3);
        boolean passed_3 = expected_3 == out_3;
        System.out.println("Test result for euroToRuble method passed:" + passed_3);

        int in_4 = 2;
        int expected_4 = 120;
        int out_4 = dollarToRuble(in_4);
        boolean passed_4 = expected_4 == out_4;
        System.out.println("Test result for dollarToRuble method passed:" + passed_4);

        int in_5 = 3;
        double expected_5 = 3.5;
        double out_5 = euroToDollar(in_5);
        boolean passed_5 = expected_5 == out_5;
        System.out.println("Test result for euroToDollar method passed:" + passed_5);

        int in_6 = 7;
        double expected_6 = 6;
        double out_6 = dollarToEuro(in_6);
        boolean passed_6 = expected_6 == out_6;
        System.out.println("Test result for dollarToEuro method passed:" + passed_6);
    }
}
