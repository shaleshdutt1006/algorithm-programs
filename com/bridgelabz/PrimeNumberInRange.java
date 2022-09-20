package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumberInRange {
    /**
     * Checking number is prime or not by giving numbers one by one
     *
     * @param n n is the number which are taken from for loop int the main method one by one
     * @return
     */
    public static boolean isPrime(int n) {
        /*
        if number<2 then not prime
         */

        if (n <= 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number you want to start from");
        int start = scanner.nextInt();

        System.out.println("Enter Number you want to go upto ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
