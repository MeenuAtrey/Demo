package com.assignment1;

import java.util.Arrays;

public class SortArray {
    static int[] reverseArray(int arr[], int length)
        {
        int [] rev_arr = new int[length];
        int i, j=length;
        for(i=0;i<length;i++)
        {
            rev_arr[j-1] = arr[i];
            j=j-1;
        }
            System.out.println("Reversed array:" + Arrays.toString(rev_arr));
        return rev_arr;

    }

    public static void main(String[] args) {
        int[] arr = {321, 121, 99, 87, 1001, 465, 333, 86, 79};
        int[] revArr;
        Arrays.sort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));
        revArr = reverseArray(arr, arr.length);
        System.out.println("Reversed array:" + Arrays.toString(revArr));
    }
}
