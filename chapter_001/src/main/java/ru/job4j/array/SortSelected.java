package ru.job4j.array;

/**
 * Class SortSelected для решения задачи 6.5.1. Сортировка выборкой.
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 14.10.2019
 */

public class SortSelected {

    /**
     * Метод sort для сортировки массива по возрастанию
     * @param data - сортируемый массив чисел
     * @return отсортированный по возрастанию массив
     */

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = min;
            data[index] = temp;
        }
        return data;
    }
}
