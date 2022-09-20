package com.bridgelabz;

public class PermutationOfString {
    /**
     * if both string are equal then print it else take the string and swap it using swap method
     *
     * @param str
     * @param start
     * @param end
     */
    public void permute(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
        } else {

            for (int i = start; i <= end; i++) {
            /*
                 where i and j are 0 in swap function first it swap a to a
            */
                str = swap(str, start, i);
             /*
             after swapping a to a it will call permute recursively then it increment start to +1 for b to b
              will be swap and same for c after swapping abc to abc now goes to start==end and print it
              */
                permute(str, start + 1, end);
                /* after this start is 1 and i is 2 it will swap bc to cb now loop completed i and start
                 0 or 0 next start is 0 and i is 1 abc to bac convert
                 */
                str = swap(str, start, i);


            }
        }
    }

    public String swap(String a, int i, int j) {
        /*
        swapping elements i and j using temp variable
         */
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {

        String str = "ABC";
        int n = str.length();
        PermutationOfString permutationOfString = new PermutationOfString();
        permutationOfString.permute(str, 0, n - 1);


    }
}
