package com.problems.java;

import java.util.ArrayList;
import java.util.List;

public class MergeArray {
    public static List<Integer> mergeArray(int[] array1, int[] array2) {
        List<Integer> resultArray = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < array1.length && index2 < array2.length) {
            if (array1[index1] < array2[index2]) {
                resultArray.add(array1[index1]);
                index1++;
            } else {
                resultArray.add(array2[index2]);
                index2++;
            }
        }

        while (index1 < array1.length) {
            resultArray.add(array1[index1]);
            index1++;
        }

        while (index2 < array2.length) {
            resultArray.add(array2[index2]);
            index2++;
        }

        return resultArray;
    }
    public static void main(String[] args) {
        mergeArray(new int[]{1,2,3,4,5,6,7,8,9},new int[]{2,5,6});
    }
}
