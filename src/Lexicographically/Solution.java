package Lexicographically;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(sumChar(A, B));
        System.out.println(checkLexicographically(A, B));
        System.out.println(capitalize(A, B));
    }

    public static int sumChar(String A, String B){
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < A.length(); i++) {
            sumA++;
        }

        for (int i = 0; i < B.length(); i++) {
            sumB++;
        }

        return sumA + sumB;
    }

    public static String checkLexicographically(String A, String B){
        String rs = "";

        int check = A.compareTo(B);
        if (check <= 0){
            rs = "No";
        }else{
            rs = "Yes";
        }

        return rs;
    }

    public static String capitalize(String A, String B){
        String convertA = A.substring(0,1).toUpperCase() + A.substring(1);
        String convertB = B.substring(0,1).toUpperCase() + B.substring(1);

        return convertA + " " + convertB;
    }
}
