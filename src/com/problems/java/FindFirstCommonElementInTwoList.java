package com.problems.java;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstCommonElementInTwoList {
    static Integer commonElement (List<Integer> al1, List<Integer> al2){

        Integer result = null;


        Optional<Integer> first = al1.stream().filter(e -> al2.contains(e)).findFirst();

        if(first.isPresent()){
            result = first.get();
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);

        al2.add(1);
        al2.add(3);
        al2.add(4);
        al2.add(3);

        Integer val = commonElement(al1, al2);
        if(val != null){
            System.out.println(val.intValue());
        } else {
            System.out.println("null");
        }

    }

}
