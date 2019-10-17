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
                int firstCounter = 0;
                int secondCounter = 0;
                if (sign == 'X') {
                    for (int cell = 0; cell < board.length; cell++) {
                        if (board[cell][row] == sign) {
                            firstCounter++;
                        }
                        if (board[row][cell] == sign) {
                            secondCounter++;
                        }
                    }
                    if (firstCounter == board.length || secondCounter == board.length) {
                        return true;
                    }
                }
            }
        return result;
    }
}
