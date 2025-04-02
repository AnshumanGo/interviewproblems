package com.problems.java;

public class RichestCustomerWealth {
    static int maxWealth(int[][] array) {
        int maxWealth = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(maxWealth(array));
    }
}
