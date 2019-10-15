package ru.job4j.array;

/**
 * Class FindLoop для решения задачи 6.1. Классический поиск перебором.
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 12.10.2019
 */

public class FindLoop {

    /**
     * Метод indexOf для поиска индекса искомого элемента в массиве
     * @param data - массив в котором будет производиться поиск
     * @param el - элемент, индекс которого будет найден
     * @return индекс элемента в массиве
     */

    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод indexOf для поиска индекса искомого элемента в массиве в определенном диапазоне
     * @param data - массив в котором будет производиться поиск
     * @param el - элемент, индекс которого будет найден
     * @param start - индекс начала диапазона
     * @param finish - индекс конца диапазона
     * @return индекс искомого элемента в массиве
     */

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
            }
        }
        return rst;
    }
}
