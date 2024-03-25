package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    /**
     * Java Array Program to sort array in increasing & decreasing order
     *
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = “asc”
     * Output: [ 2, 5, 7, 8 ]
     *
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = “desc”
     * Output: [ 8,7, 5, 2 ]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = {8, 7, 5, 2};
        System.out.println(Arrays.toString(inputArray));
        System.out.print("Enter direction (asc/desc): ");
        String direction = scanner.next();


        sortArray(inputArray, direction);

        System.out.println("Sorted array in " + direction + " order: " + Arrays.toString(inputArray));
    }

    public static void sortArray(int[] array, String direction) {
        switch (direction) {
            case "asc":
                Arrays.sort(array);
                break;
            case "desc":
                reverseArray(array);
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String direction = scanner.next();
//        int[] inputArray = {8, 7, 5, 2};
//
//    }
//
//    public static int[] sortArray(int[] array, String direction) {
//        return switch (direction) {
//            case "asc" -> Arrays.sort(array);
//            case "desc" -> reversArray(array);
//            default -> {
//                System.out.println("Invalid Operation");
//                yield 0;
//            }
//        };
//    }
//
//    public static void reversArray(int[] array) {
//        int start = 0;
//        int end = array.length - 1;
//        while (start < end) {
//            int temp = array[start];
//            array[start] = array[end];
//            array[end] = temp;
//            start++;
//            end--;
//        }
//    }
//}
