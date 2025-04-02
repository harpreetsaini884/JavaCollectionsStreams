package org.rituraj.junit.basic;

import java.util.Scanner;

public class StringUtility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        reverse(str);
        isPalindrome(str);

    }

    public static void reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }

    public static void isPalindrome(String str){
        int i = 0, j = str.length()-1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a Palindrome");
                return;
            }
            i++;
            j--;
        }

        System.out.println("Is a Palindrome");
    }

    public static String toUpperCase(String str){
        return str.toUpperCase();
    }
}
