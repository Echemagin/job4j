package ru.job4j.array;

/**
 * Class Min для решения задачи Поиск минимального числа в массиве.
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 14.10.2019
 */

public class Min {

    /**
     * Метод findMin находит минимальное число в массиве
     * @param array - массив чисел в котором будем находить минимальное значение
     * @return минимальное число в массиве
     */

    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
