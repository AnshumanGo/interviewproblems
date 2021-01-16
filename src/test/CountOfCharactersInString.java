package test;

public class CountOfCharactersInString {

    public static void main(String[] args) {

        String strValue = "dBabbccccaAccDcCd";

        int strValSize = strValue.length(), counter[]= new int[256];


        for(int i = 0; i< strValSize ;i++){


            counter[(int)strValue.toLowerCase().charAt(i)]++;
        }

        for(int j =0 ; j < 256; j++){

            if(counter[j]!=0){

                System.out.println((char) j + " : " + counter[j]);
            }
        }
    }
}
