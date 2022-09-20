package com.bridgelabz;

public class InsertionSort<T> {
    /**
     * divide in two arrays one is sorted and other is unsorted  and starts from i=1 because there
     * is one element which means always sorted and compare to unsorted array
     *
     * @param array
     * @param <T>
     */
    public static <T extends Comparable<T>> void sorting(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T temp = array[i];
            /*
            j greater than or equal to zero because we are comparing sorted array whose value are on left side not
            less than 0 possible
             */
            int j = i - 1;
            while (j >= 0 && (temp.compareTo(array[j]) < 0)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    /**
     * printing element using for enhanced loop
     *
     * @param arr
     * @param <T>
     */
    public static <T> void print(T[] arr) {
        for (T elements : arr) {
            System.out.print(elements + " ");
        }
    }

    public static void main(String[] args) {

        Character array[] = {'v', 'b', 'l', 'p', 'q', 'r', 'x', 'a'};
        sorting(array);
        print(array);


    }
}
