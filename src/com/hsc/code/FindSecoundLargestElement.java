package com.hsc.code;

import java.util.Arrays;

public class FindSecoundLargestElement {


    public static int findSecoundLargestElement(int arr[],
                                                int arr_size) {
        int i, first, second;
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
			/* If current element is smaller than
			first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            /* If arr[i] is in between first and
			second then update second */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"
                    + " -1\n");
        return second;
    }

    public static void main(String[] args) {
        String arr1[] = {"3", "-2"};
        String arr2[] = {"5", "5", "4", "2"};
        String arr3[] = {"4", "4", "4"};
        String arr4[] = {};
        int[] array = Arrays.stream(arr1).mapToInt(Integer::parseInt).toArray();
        int n = arr1.length;
        int secondMaxElement = findSecoundLargestElement(array, n);
        System.out.print("The second largest element"
                + " is " + secondMaxElement);
    }
}


