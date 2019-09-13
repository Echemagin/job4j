package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public static void main(String[] args) {
        double result = distance(3, 4, 6, 8);
        double result2 = distance(5, 3, 7, 3);
        double result3 = distance(11, 5, 8, 1);

        System.out.println("result (3, 4) to (6, 9) is " + result);
        System.out.println("result (5, 3) to (7, 9) is " + result2);
        System.out.println("result (11, 5) to (8, 1) is " + result3);
    }
}
