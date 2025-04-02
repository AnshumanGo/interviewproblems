package com.problems.java;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    static List<String> fizzBuzzArray(int numberOfElements) {
        List<String> fizzBuzzList = new ArrayList<String>();
        for (int i = 0; i < numberOfElements; i++) {
            if(((i+1) % 3) != 0 && ((i+1) % 5) != 0) {
                fizzBuzzList.add(Integer.toString(i+1));
            } else if (((i+1) % 3) == 0 && ((i+1) % 5) == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if (((i+1) % 3) == 0 && ((i+1) % 5) != 0) {
                fizzBuzzList.add("Fizz");
            }  else if (((i+1) % 3) != 0 && ((i+1) % 5) == 0) {
                fizzBuzzList.add("Buzz");
            }
        }
        return fizzBuzzList;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzzArray(30));
    }
}
