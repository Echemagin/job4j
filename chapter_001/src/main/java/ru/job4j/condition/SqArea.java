package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {

        int h = (p / (k + 1)) / 2;
        int l = h * k;
        int s = h * l;

        return s;
    }

    public static void main(String[] args) {
        double result1 = square(12, 4);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
