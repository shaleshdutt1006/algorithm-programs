package com.bridgelabz;

public class MergeSort {
    public static <T extends Comparable<T>> void conquer(T[] array, int start, int end, int mid) {
/*
taking a new merged array of size of no . of elements in array
 */
        Integer merged[] = new Integer[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            /*
            array[index1] has smaller element then array[index2] then we will put element of array[index1]
            into merged[x] else array[index2] will be put in merged[x]
             */
            if (array[idx1].compareTo(array[idx2]) < 0) {
                merged[x++] = (Integer) array[idx1++];
            } else merged[x++] = (Integer) array[idx2++];
        }
        /*
        copying left elements in to the array which is already sorted
         */

        while (idx1 <= mid) {
            merged[x++] = (Integer) array[idx1++];
        }
        while (idx2 <= end) {
            merged[x++] = (Integer) array[idx2++];
        }
        /*
        for copying merged array elements in to origin array
         */
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            array[j] = (T) merged[i];
        }
    }

    public static <T extends Comparable<T>> void divide(T[] array, int start, int end) {
        /*
        divide array in two parts by taking a mid
         */

        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(array, start, mid);
        divide(array, mid + 1, end);
        conquer(array, start, end, mid);
    }

    public static void main(String[] args) {
        Integer[] array = {2, 5, 1, 8, 6, 9, 3, 10};
        int len = array.length;
        MergeSort.divide(array, 0, len - 1);

        for (int i = 0; i < len; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

    }
}
