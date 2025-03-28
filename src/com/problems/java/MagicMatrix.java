package com.problems.java;

public class MagicMatrix {

    static int input = 3;

    public static int isMagicMatrix(int matrix[][]) {
        int permanentSum = 0, tempSum = 0;
        for (int index = 0; index < input ;index++){
            permanentSum += matrix[index][index];
            tempSum += matrix[index][input - 1 - index];
        }
        if (permanentSum != tempSum) {
            return 1;
        }


        for (int outIndex = 0; outIndex < input; outIndex ++) {

            int row = 0, col = 0;
            for (int innIndex = 0; innIndex < input; innIndex++) {

                row += matrix[outIndex][innIndex];
                col += matrix[innIndex][outIndex];
            }
            if (row != col || col != permanentSum) {
                return 1;
            }
        }
        return 0;
    }
}