package com.adepuu.exercises.session5;
import java.util.List;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};
        boolean output = checkDuplicates(array);
        System.out.println(output);
    }
    public static boolean checkDuplicates (int[] array){
        int n = array.length;
        for (int i = 0; i < n ; i++ ) {
            for (int j = i + 1 ; j < n ; j++){
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
