package ru.job4j.array;

/**
 * Class MatrixCheck для решения задачи Выигрышные комбинации в сокобан
 * @author Evgeny Chemagin (chevgeny@mail.ru)
 * @since 15.10.2019
 */

public class MatrixCheck {

    /**
     * Метод isWin проверяет выигрышная ли комбинация в матрице
     * @param board - матрица которую будем проверять
     * @return результат
     */

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
                char sign = board[row][row];
                int first_counter = 0;
                int second_counter = 0;
                if (sign == 'X') {
                    for (int cell = 0; cell < board.length; cell++) {
                        if (board[cell][row] == sign) {
                            first_counter++;
                        }
                        if (board[row][cell] == sign) {
                            second_counter++;
                        }
                    }
                    if (first_counter == board.length || second_counter == board.length) {
                        return true;
                    }
                }
            }
        return result;
    }
}
