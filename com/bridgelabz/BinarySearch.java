package com.bridgelabz;

import java.util.Scanner;

public class BinarySearch {
    /**
     * using comparable method for sorting the array with a variable temp     *
     *
     * @param arr taking array and sorting it
     * @param <T> T is generic method
     */
    public static <T extends Comparable<T>> void arraySort(T[] arr) {
        T temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                /*
                if arr[i] element is greater than arr[j] it will swap arr[j] to arr[i] element
                 */
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        /*
        printing the sorted array using for loop
         */
        System.out.print("Sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> int binarySearch(T[] arr, T key) {
        /*
        Searching the element using binary search by taking a mid-value of sorted array if key equal mid then give value
        else compare and changing the mid
         */
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key.equals(arr[mid])) {
                return mid;
            } else if (key.compareTo(arr[mid]) < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array you want to store the words");
        int arrayLength = scanner.nextInt();
        String[] arr = new String[arrayLength];
        System.out.println("Enter words for array");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.next();
        }
        arraySort(arr);

        System.out.println("Enter word you want to search in the array");
        String word = scanner.next();

        System.out.println("Location of the element is : " + binarySearch(arr, word));
    }
}
