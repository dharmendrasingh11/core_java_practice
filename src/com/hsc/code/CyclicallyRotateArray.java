package com.hsc.code;

import java.util.Arrays;

public class CyclicallyRotateArray {
    public static int[] cyclicallyRotateArray(int[] arr) {
        int i, x = arr[arr.length - 1];
        for (i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = x;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int[] ints = cyclicallyRotateArray(arr);
        System.out.println(Arrays.toString(ints));
    }
}
