package com.problems.java;

public class ArrayRotation {

    // int[] dataArray = { 2,5,7,1,8} , int rotations =3


    /*
     *  1st - { 5, 7, 1, 8, 2}
     *  2nd - { 7, 1, 8, 2, 5}
     *  3rd - { 1, 8, 2, 5, 7} ===>> final result array
     * */
    public static int[] rotate(int[] arr, int rotations) {
        if (rotations <= 0 || arr == null || arr.length == 0) {
            return arr;
        }
        rotations = rotations % arr.length;
        for (int i = 0; i < rotations; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
                arr[arr.length - 1] = temp;
            }
        }
        return arr;
    }


    /*
     * reverse the array () - 3 time used
     *
     *  int[] dataArray = { 2,5,7,1,8} , int rotations =3
     *
     * rotations = rotations % arr.length;
     * step 1 - reverse ( 0 - length -1)
     *
     * step 2 - reverse ( 0 - rotate )
     *
     * step 3 - reverse ( rotate , len -1 )
     *
     *
     * */

    public static void main(String[] args) {
        int[] dataArray = {2, 5, 7, 1, 8};
        int rotations = 3;
        int[] rotatedArray = rotate(dataArray, rotations);
        for (int a : rotatedArray) {
            System.out.println(a);
        }
    }
}
