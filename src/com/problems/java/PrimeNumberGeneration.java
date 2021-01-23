package com.problems.java;

public class PrimeNumberGeneration {

    public static void main(String[] args) {

        for( int i = 1;i<1000; i++){

            /*boolean isPrime = false;

            for( int j= 2; j<i;j++){

                if(i%j ==0){

                    isPrime = true;
                    break;
                }
            }
            if (!isPrime){

                System.out.println(i);
            }*/

            if( i == 1 || i== 2 || i==3){

                System.out.println(i);
                continue;
            }
            if( i % 2 == 0 || i%3 ==0)
                continue;

            for(int j=3 ; j< Math.sqrt(i);j=j+2){

                if(i%j ==0 || i%Math.sqrt(i)==0){

                    continue;
                }
            }

            System.out.println(i);

        }
    }
}
