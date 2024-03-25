package com.adepuu.exercises.session5;

public class Exercise1 {
    public static void main(String[] args) {
        int[] myNum = {8, 2, 13, 1, 4} ;
        int max = myNum[0] ;

        for (int i = 0; i < myNum.length; i++) {
            if (max < myNum[i]) {
                max = myNum[i];
            }
        }
        System.out.println(max);


    }
}
