package com.problems.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class DistinctElementsInArray {
    public static void main(String[] args) {
        int []intDataArray = {12, 10, 9, 45, 2, 10, 10, 45};
        int[] resultIntDataArray = getInts(intDataArray);
        System.out.println(Arrays.toString(resultIntDataArray));
    }

    private static int[] getInts(int[] intDataArray) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int j = 0; j< intDataArray.length; j++){
            ts.add(intDataArray[j]);
        }
        int resultIntDataArray[] = new int[ts.size()];
        Object[] objects = new ArrayList<>(ts).toArray();
        for(int count = 0 ; count < objects.length; count++){
            if(objects[count] instanceof Integer){
                resultIntDataArray[count] = ((Integer) objects[count]).intValue();
            }
        }
        return resultIntDataArray;
    }
}
