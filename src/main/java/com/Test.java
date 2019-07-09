package com;

import java.util.Scanner;

public class Test {
    public static String chessBoardCoord(int a, int b) {
        String letters = "ABCDEFGH";
        String numbers = "12345678";
        if ((a > 7)|| (b > 7)) return null;
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b));
    }

    public static void chessPrint(String [][] chessBoard) {
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(chessBoard[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static boolean coordCheck(int i, int j) {
        if ((i > 7)|| (j > 7)) return false;
        if ((i < 0)|| (j < 0)) return false;
        return true;
    }

    public static void main(String [] args) {
        String [][] chessBoard = new String[8][8];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                chessBoard[i][j] = chessBoardCoord(j,i);;
                System.out.print(chessBoard[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();

        System.out.println("Так выглядит шахматная доска, а теперь напишите цифру фигуры");
        System.out.println("1-Король");
        System.out.println("2-Ферзь");
        System.out.println("3-Слон");
        System.out.println("4-Ладья");
        System.out.println("5-Конь");
        System.out.println("6-Пешка");
        Scanner scannerValue1 = new Scanner(System.in);
        int intChessNum = scannerValue1.nextInt();

        System.out.println();
        System.out.println("Отлично, а теперь напишите начальную позицию вашей фигуры");
        Scanner scannerValue2 = new Scanner(System.in);
        String stringPosition = scannerValue2.nextLine();

        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if (chessBoard[i][j].contentEquals(stringPosition)) {

                    if (intChessNum == 1) {
                        chessBoard[i][j] = "OO";
                        System.out.println();
                        System.out.println("Король - самая важная фигура. Если её уничтожат партия будет проиграна.");
                        System.out.println("Ходит на одно поле по вертикали, горизонтали или диагонали.");
                        if (coordCheck(i+1, j) == true) chessBoard[i+1][j] = "XX";
                        if (coordCheck(i-1, j) == true) chessBoard[i-1][j] = "XX";
                        if (coordCheck(i, j+1) == true) chessBoard[i][j+1] = "XX";
                        if (coordCheck(i, j-1) == true) chessBoard[i][j-1] = "XX";
                        if (coordCheck(i+1, j+1) == true) chessBoard[i+1][j+1] = "XX";
                        if (coordCheck(i-1, j-1) == true) chessBoard[i-1][j-1] = "XX";
                        if (coordCheck(i+1, j-1) == true) chessBoard[i+1][j-1] = "XX";
                        if (coordCheck(i-1, j+1) == true) chessBoard[i-1][j+1] = "XX";
                    }

                    if (intChessNum == 2) {
                        chessBoard[i][j] = "OO";
                        System.out.println();
                        System.out.println("Ферзь - самая сильная фигура, поскольку ходит на любое "
                                + "число полей по вертикали, горизонтали или диагонали");
                        for (int k = 7; k > 0; k--) {
                            if (coordCheck(i+k, j+k) == true) chessBoard[i+k][j+k] = "XX";
                            if (coordCheck(i-k, j-k) == true)chessBoard[i-k][j-k] = "XX";
                            if (coordCheck(i+k, j-k) == true)chessBoard[i+k][j-k] = "XX";
                            if (coordCheck(i-k, j+k) == true)chessBoard[i-k][j+k] = "XX";
                            if (coordCheck(i, j+k) == true) chessBoard[i][j+k] = "XX";
                            if (coordCheck(i, j-k) == true)chessBoard[i][j-k] = "XX";
                            if (coordCheck(i+k, j) == true)chessBoard[i+k][j] = "XX";
                            if (coordCheck(i-k, j) == true)chessBoard[i-k][j] = "XX";
                        }
                    }

                    if (intChessNum == 3) {
                        chessBoard[i][j] = "OO";
                        System.out.println();
                        System.out.println("Слон ходит на любое число полей по диагонали.");
                        for (int k = 7; k > 0; k--) {
                            if (coordCheck(i+k, j+k) == true) chessBoard[i+k][j+k] = "XX";
                            if (coordCheck(i-k, j-k) == true)chessBoard[i-k][j-k] = "XX";
                            if (coordCheck(i+k, j-k) == true)chessBoard[i+k][j-k] = "XX";
                            if (coordCheck(i-k, j+k) == true)chessBoard[i-k][j+k] = "XX";
                        }
                    }

                    if (intChessNum == 4) {
                        chessBoard[i][j] = "OO";
                        System.out.println();
                        System.out.println("Ладья ходит на любое число полей по вертикали или горизонтали.");
                        for (int k = 7; k > 0; k--) {
                            if (coordCheck(i, j+k) == true) chessBoard[i][j+k] = "XX";
                            if (coordCheck(i, j-k) == true)chessBoard[i][j-k] = "XX";
                            if (coordCheck(i+k, j) == true)chessBoard[i+k][j] = "XX";
                            if (coordCheck(i-k, j) == true)chessBoard[i-k][j] = "XX";
                        }
                    }

                    if (intChessNum == 5) {
                        chessBoard[i][j] = "OO";
                        System.out.println();
                        System.out.println("Конь ходит русской буквой «Г»");
                        if (coordCheck(i-2, j-1) == true) chessBoard[i-2][j-1] = "XX";
                        if (coordCheck(i-1, j-2) == true) chessBoard[i-1][j-2] = "XX";
                        if (coordCheck(i+2, j+1) == true) chessBoard[i+2][j+1] = "XX";
                        if (coordCheck(i+1, j+2) == true) chessBoard[i+1][j+2] = "XX";
                        if (coordCheck(i+1, j-2) == true) chessBoard[i+1][j-2] = "XX";
                        if (coordCheck(i+2, j-1) == true) chessBoard[i+2][j-1] = "XX";
                        if (coordCheck(i-1, j+2) == true) chessBoard[i-1][j+2] = "XX";
                        if (coordCheck(i-2, j+1) == true) chessBoard[i-2][j+1] = "XX";
                    }

                    if (intChessNum == 6) {
                        chessBoard[i][j] = "OO";
                        System.out.println();
                        System.out.println("Пешка ходит на одно поле по вертикали вперёд.");
                        if (coordCheck(i-1, j) == true) chessBoard[i-1][j] = "XX";
                    }
                }
            }
        }
        System.out.println();
        chessPrint(chessBoard);
    }
}
