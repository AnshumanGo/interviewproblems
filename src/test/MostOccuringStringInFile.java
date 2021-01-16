package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MostOccuringStringInFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String newLine, maxword="";

        List<String> wordList = new ArrayList<>();

        FileReader fileReader = new FileReader("testdata.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);



        while ((newLine=bufferedReader.readLine())!=null){

            String[] stringArray = newLine.split("([,.\\s]+)");

            for(String strVal : stringArray){

                if(strVal.length()<2)
                    continue;
                wordList.add(strVal);
            }
        }

        int max =0;
        int wordOccurrance = 0;
        for( int i =0 ; i < wordList.size() ; i++){

            wordOccurrance = 1;

            for(int j = i+1; j< wordList.size();j++){

                if (wordList.get(i).equals(wordList.get(j))){

                    wordOccurrance ++;
                }
            }

            if (wordOccurrance > max){

                max =wordOccurrance;
                maxword = wordList.get(i);
            }
        }


        System.out.println("Max occurred word :" + maxword);
        bufferedReader.close();
    }
}
