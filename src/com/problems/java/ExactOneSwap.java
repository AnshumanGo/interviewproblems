package com.problems.java;

import java.util.HashMap;

public class ExactOneSwap {
    static long countStrings(String strValue)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        long sum = 0;
        for(int i = 0; i <= strValue.length() - 1; i++){
            map.put(strValue.charAt(i) , map.getOrDefault(strValue.charAt(i) , 0) + 1);
        }
        long n = (long)strValue.length();
        long ans =  n*(n - 1)/2;
        if(map.size() == strValue.length()){
            return ans;
        }else{
            for(Character k : map.keySet()){
                long p = map.get(k);
                sum += p*(p - 1)/2;
            }
        }

        return (ans - sum + 1);
    }

    public static void main(String[] args) {
        System.out.println(countStrings("tree"));
    }
}
