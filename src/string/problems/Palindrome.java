package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String original;
        String reverse= "";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to check whether it is palindrome or not: ");
        original= sc.nextLine();
        for (int i = original.length()-1; i>=0; i--) {
            reverse= reverse + original.charAt(i);
        }
        boolean palindrome = true;
        for (int i =0; i<original.length(); i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("This string is a palindrome");
        }
        else {
            System.out.println("This string is NOT a palindrome!");
        }

    }
    }

