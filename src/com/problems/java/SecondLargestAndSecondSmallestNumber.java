package com.problems.java;

import java.util.Arrays;
import java.util.TreeSet;

public class SecondLargestAndSecondSmallestNumber {

    public static void main(String[] args) {

        int[] intArray = {9,2,6,5,7,9,2};
        Arrays.sort(intArray);

        if(intArray.length==1)
        {
            System.out.println("Second largest number in array" + intArray[0]);
            System.out.println("Second smallest number in array" + intArray[0]);
        }else if (intArray.length == 2){
            System.out.println("Second largest number in array" + intArray[0]);
            System.out.println("Second smallest number in array" + intArray[1]);
        }else {

            TreeSet<Integer> integerTreeSet = new TreeSet<>();
            for (int i =0 ; i< intArray.length;i++) {
                integerTreeSet.add(intArray[i]);
            }

            int[] intArrayUnique = new int[integerTreeSet.size()];
            int intArrayUniqueIndex =0;
            for (int i : integerTreeSet) {

                intArrayUnique[intArrayUniqueIndex++]=i;
            }

            System.out.println("Second largest number in array" + intArrayUnique[1]);
            System.out.println("Second largest number in array" + intArrayUnique[intArrayUnique.length-2]);

            integerTreeSet.pollFirst();
            integerTreeSet.pollLast();

            System.out.println("Second largest number in array" + integerTreeSet.first());
            System.out.println("Second largest number in array" + integerTreeSet.last());
        }
    }
}
