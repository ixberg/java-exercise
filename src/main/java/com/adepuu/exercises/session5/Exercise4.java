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
        Arrays.sort(array);

        int[] uniqueArray = new int[n];
        uniqueArray[0] = array[0];
        int currentIndex = 1;

        for (int i = 1; i < n; i++) {
            if (array[i] != array[i - 1]) {
                uniqueArray[currentIndex] = array[i];
                currentIndex++;
            }
        }
        return Arrays.copyOf(uniqueArray, currentIndex);
    }
}