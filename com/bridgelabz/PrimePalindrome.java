package com.bridgelabz;

import java.util.Scanner;

public class PrimePalindrome {
    /**
     * checking which prime number is palindrome
     *
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        /*
        checking prime numbers
         */
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            return false;
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        /*
        checking number is palindrome or not
         */
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        if (reverse == n) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number you want to start from");
        int start = scanner.nextInt();

        System.out.println("Enter Number you want to go upto ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            /*
            if number is both prime and palindrome print it
             */
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
