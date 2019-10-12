package ru.job4j.array;

/**
 * Class FindLoop для решения задачи 6.0. Заполнить массив степенями чисел.
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 12.10.2019
 */

public class Square {

    /**
     * Метод calculate для создания массива квадратов чисел
     * @param bound - число до которого будут производиться расчеты
     * @return получившийся массив квадратов чисел
     */

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}