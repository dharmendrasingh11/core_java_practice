package com.hsc.code;

import java.util.Arrays;

/**
 * ArrayRotation
 */
public class ArrayRotation {
    public static int a[];

    /**
     * rotation of array
     *
     * @param arr
     * @param d
     * @param n
     */
    public static void arrayRotation(int[] arr, int d, int n) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < d; j++) {
                a = rotation(arr);

            }
            break;
        }
        System.out.println(Arrays.toString(a));


    }

    private static int[] rotation(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n = 5;
        arrayRotation(arr, d, n);
    }
}
