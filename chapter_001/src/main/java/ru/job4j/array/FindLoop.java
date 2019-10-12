package ru.job4j.array;

/**
 * Class FindLoop для решения задачи 6.1. Классический поиск перебором.
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 12.10.2019
 */

public class FindLoop {

    /**
     * Метод indexOf для запуска программы
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
}
