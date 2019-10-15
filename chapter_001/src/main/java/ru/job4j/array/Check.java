package ru.job4j.array;

/**
 * Class Check для решения задачи 6.3. Массив заполнен true или false.
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 14.10.2019
 */

public class Check {

    /**
     * Метод mono для проверки элементов массива
     * @param data - массив который будем проверять
     * @return результат проверки
     */

    public boolean mono(boolean[] data) {
        boolean result = true;
            for (int i = 1; i < data.length; i++) {
                if (data[i] != data[0]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
