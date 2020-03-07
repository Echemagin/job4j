package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
    }

    public static String possibleDiv(int number) {

        if (number == 0) {
            String result = "Could not div by 0.";
            System.out.println(result);
            return result;
        }
        if (number < 0) {
            String result = "This is negative number.";
            System.out.println(result);
            return result;
        }
        return null;
    }
}
