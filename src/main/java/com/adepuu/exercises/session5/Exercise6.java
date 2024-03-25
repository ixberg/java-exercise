package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 1};
        int key = 1;
        array = removeElement(array, key);
        System.out.println("Output: " + Arrays.toString(array));
    }

    public static int[] removeElement(int[] array, int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != key) {
                array[count++] = array[i];
            }
        }
        return Arrays.copyOf(array, count);
    }
}
