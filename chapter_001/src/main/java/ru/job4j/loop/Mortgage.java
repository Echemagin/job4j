package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
           double amountYear = amount + amount * (percent / 100);
           amount = (int) amountYear - salary;
           year++;
        }
        return year;
    }
}
