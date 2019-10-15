package ru.job4j.array;

/**
 * Class ArrayChar для решения задачи 6.4. Слово начинается с ...
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 14.10.2019
 */

public class ArrayChar {

    /**
     * Метод startsWith проверяет начинается ли слово с заданной последовательности символов
     * @param word - массив символов на которые раскладывается слово
     * @param pref - массив символов с которым сравнивается начало слова
     * @return результат сравнения
     */

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
