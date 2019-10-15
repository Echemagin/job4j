package ru.job4j.array;

/**
 * Class ArrayChar для решения задачи 6.4.1. Слово заканчивается с ...
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 14.10.2019
 */

public class EndsWith {

    /**
     * Метод endsWith проверяет заканчивается ли слово заданной последовательностью символов
     * @param word - массив символов на которые раскладывается слово
     * @param post - массив символов с которым сравнивается конец слова
     * @return результат сравнения
     */

    public static boolean endsWith(char[] word, char[] post) {

        boolean result = true;
        for (int i = word.length - 1; i > word.length - post.length - 1; i--) {
            if (word[i] != post[i - post.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
