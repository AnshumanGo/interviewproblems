package com.problems.java;

public class MergeString {
    public static void main(String[] args) {
        System.out.println(new MergeString().mergeAlternately("asdas","asfdqe3f"));
    }
        public String mergeAlternately(String word1, String word2) {
            StringBuilder result=new StringBuilder();
            int word1Length = word1.length();
            int word2Length = word2.length();
            if(word1Length == word2Length){
                int count = 0;
                for(count=0;count<word2Length;count++){
                    result = result.append(word1.charAt(count)).append(word2.charAt(count));
                }
            } else if(word1Length > word2Length){
                int count = 0;
                for(count=0;count<word2Length;count++){
                    result = result.append(word1.charAt(count)).append(word2.charAt(count));
                }
                for(count=count;count<word1Length;count++){
                    result = result.append(word1.charAt(count));
                }
            } else {
                int count = 0;
                for(count=0;count<word1Length;count++){
                    result = result.append(word1.charAt(count)).append(word2.charAt(count));
                }
                for(count=count;count<word2Length;count++){
                    result = result.append(word2.charAt(count));
                }
            }
            return result.toString();
        }
}
