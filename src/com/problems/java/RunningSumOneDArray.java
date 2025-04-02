package com.problems.java;

import java.util.Arrays;

public class RunningSumOneDArray {
    static int[] runningSum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }
    public static void main(String[] args) {
        int array[] ={1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(runningSum(array)));
    }
}
