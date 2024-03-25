package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        List<Integer> output = rotateArray(arr, d);
        System.out.println(output);
    }

    private static List<Integer> rotateArray(int[] array, int d) {
        List<Integer> rotatedArray = new ArrayList<>();

        for (int i = d; i < array.length; i++) {
            rotatedArray.add(array[i]);
        }

        for (int i = 0; i < d; i++) {
            rotatedArray.add(array[i]);
        }

        return rotatedArray;
    }
}
