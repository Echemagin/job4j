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
        int rubleFirst = euroToRuble(3);
        int rubleSecond = dollarToRuble(5);
        double dollarSecond = euroToDollar(30);
        double euroSecond = dollarToEuro(40);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("240 rubles are " + dollar + " dollars.");
        System.out.println("3 euro are " + rubleFirst + " rubles.");
        System.out.println("5 dollars are " + rubleSecond + " rubles.");
        System.out.println("30 euro are " + dollarSecond + " dollars.");
        System.out.println("40 dollars are " + euroSecond + " euro.");

        int in1 = 140;
        int expected1 = 2;
        int out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("Test result for rubleToEuro method passed:" + passed1);

        int in2 = 120;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("Test result for rubleToDollar method passed:" + passed2);

        int in3 = 2;
        int expected3 = 140;
        int out3 = euroToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("Test result for euroToRuble method passed:" + passed3);

        int in4 = 2;
        int expected4 = 120;
        int out4 = dollarToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("Test result for dollarToRuble method passed:" + passed4);

        int in5 = 3;
        double expected5 = 3.5;
        double out5 = euroToDollar(in5);
        boolean passed5 = expected5 == out5;
        System.out.println("Test result for euroToDollar method passed:" + passed5);

        int in6 = 7;
        double expected6 = 6;
        double out6 = dollarToEuro(in6);
        boolean passed6 = expected6 == out6;
        System.out.println("Test result for dollarToEuro method passed:" + passed6);
    }
}
