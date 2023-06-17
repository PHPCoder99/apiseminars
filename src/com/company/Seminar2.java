package com.company;

public class Seminar2 {
    public static void main(String[] args) {

    }

    public static boolean task4(int[][] board) {
        if (board.length != 9){
            return false;
        }
        for (int[] ints : board) {
            if (ints.length != 9) {
                return false;
            }
        }
        boolean[] has1thru9 = {false, false, false, false, false, false, false, false, false};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 0 && has1thru9[board[i][j]-1]){
                    return false;
                } else if (board[i][j] != 0) {
                    has1thru9[board[i][j] - 1] = true;
                }
            }
            has1thru9 = new boolean[]{false, false, false, false, false, false, false, false, false};
        }
        return true;
    }
}
