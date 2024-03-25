package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 8, 2, 3, 3, 3, 4, 5};
        int[] uniqueArray = removeDuplicates(inputArray);
        System.out.println("Input: " + Arrays.toString(inputArray));
        System.out.println("Output: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int currentIndex = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[currentIndex++] = array[i];
            }
        }
        return Arrays.copyOf(uniqueArray, currentIndex);
    }
}