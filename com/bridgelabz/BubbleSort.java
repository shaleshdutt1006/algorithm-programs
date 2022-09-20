package com.bridgelabz;

public class BubbleSort<T> {
    /**
     * Sorting the array using bubble sort
     *
     * @param arr taking an array arr
     * @param <T> T is generic parameter
     */
    public static <T extends Comparable<T>> void sort(T[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                /*
                i-1 because everytime one element is sorted so minimising it
                i loop is just for iteration and j loop is changine the position of elements
                 */

                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /*
    printing the array using for enhanced loop
     */
    public static <T> void print(T[] arr) {
        for (T elements : arr) {
            System.out.print(elements + " ");
        }
    }

    public static void main(String[] args) {

        Integer[] arr = {2, 9, 10, 34, 2, 6, 8, 15, 17, 29};
        BubbleSort.sort(arr);
        BubbleSort.print(arr);


    }
}

