package com.problems.java;

import java.util.*;

public class SubArrayWithMaxSum {

    /*//Kadane's Algorithm for Max sub array sum
    static int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxValue = Math.max(maxValue + arr[i], arr[i]);
            res = Math.max(res, maxValue);
        }
        return res;
    }*/

    static Hashtable<Integer, List<Integer>> maxSubArrayWithMaxSum(int arr[]){
        int resStart =0, resEnd = 0;
        int maxSum = arr[0];
        for(int i = 0; i < arr.length; i++){
            int currSum = 0;
            for(int j = i; j < arr.length; j++){
                currSum += arr[j];
                if(currSum > maxSum){
                    maxSum = currSum;
                    resStart = i;
                    resEnd = j;
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = resStart; i <= resEnd; i++)
            res.add(arr[i]);
        Hashtable<Integer, List<Integer>> maxSubArrayWithMaxSum = new Hashtable<>();
        maxSubArrayWithMaxSum.put(maxSum, res);
        return maxSubArrayWithMaxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Hashtable<Integer, List<Integer>> maxSubArrayWithMaxSum = maxSubArrayWithMaxSum(arr);

        for(Map.Entry m:maxSubArrayWithMaxSum.entrySet()){
            System.out.println("Max sum of sub array : "+m.getKey());
            System.out.println("Sub array with maximum sum is : "+Arrays.toString(maxSubArrayWithMaxSum.get(m.getKey()).toArray()));
        }
    }
}
