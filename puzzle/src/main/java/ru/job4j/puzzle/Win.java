package ru.job4j.puzzle;

public class Win {
    public static boolean checkRow(int[][] board, int row) {
        boolean res = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 1) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean checkCol(int[][] board, int col) {
        boolean res = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] != 1) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (!(checkCol(board, i) || checkRow(board, i))) {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }
}
