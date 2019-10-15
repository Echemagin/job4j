package ru.job4j.array;

/**
 * Class Min для решения задачи Поиск минимума в диапазоне.
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 14.10.2019
 */

public class MinDiapason {

    /**
     * Метод findMin находит минимальное значение в заданном диапазоне массива
     * @param array - массив в котором будем искать минимальное значение в заданном диапазоне
     * @param start - начало диапазона
     * @param finish - конец диапазона
     * @return минимальное значение в диапазоне
     */

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
