package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
            }
        }
        return count;
    }
}