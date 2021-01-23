package com.problems.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSubstringCount {

    public static void main(String[] args) {

        String subString = "code";

        System.out.println(getSubstringCount("aaacodebbb", subString));
        System.out.println(getSubstringCount("codexxcode", subString));
        System.out.println(getSubstringCount("codexxcode", subString));
    }

    static int getSubstringCount(String mainWord, String subString){

        int subStringCount = 0;


            Pattern pattern = Pattern.compile(subString);
            Matcher matcher = pattern.matcher(mainWord);

            while(matcher.find()){

                subStringCount ++;
            }


        return subStringCount;
    }

}
