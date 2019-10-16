package ru.job4j.array;

/**
 * Class ArrayChar для решения задачи 6.8. Удаление дубликатов в массиве.
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 14.10.2019
 */

public class Defragment {

    /**
     * Метод compress который будет переносить null ячейки в конец массива
     * @param array - массив строк который будет форматироваться
     * @return полученный массив
     */

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int i = index;
                while (array[i] == null && i < array.length - 1) {
                    i++;
                }
                array[index] = array[i];
                array[i] = null;
            }
        }
        return array;
    }
}
