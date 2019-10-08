package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 0;

        if (n == 0) {
            return 1;
        }

        for (int i = 1; i <= n; i++) {

                if (result == 0) {
                    result++;
                }

                result = result * i;
        }

        return result;
    }
}
