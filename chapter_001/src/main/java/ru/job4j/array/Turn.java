package ru.job4j.array;

/**
 * Class Turn для решения задачи 6.2. Перевернуть массив.
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 14.10.2019
 */

public class Turn {

    /**
     * Метод back для разворачивания массива
     * @param array - массив который будем разворачивать
     * @return перевернутый массив
     */

    public int[] back(int[] array) {
        int temp;
        for (int i = 0; i < (array.length / 2); i++) {
            int index = array.length - i - 1;
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }

    public char[] back(char[] array) {
        char temp;
        for (int i = 0; i < (array.length / 2); i++) {
            int index = array.length - i - 1;
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
