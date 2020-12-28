package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(powerNumberfunction( 5  ,4));
    }

    public static int powerNumberfunction(int num , int power) {

        int answer = num;
        int j ;

        for ( int n = 1; n <= power ; n++) {

            int i  = num * answer ;
            answer = i ;
//            System.out.println(answer);
        }
        return answer;
    }

}
