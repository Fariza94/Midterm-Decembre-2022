package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        //let's check for exemple if "Army" and "Mary" are anagram:
        System.out.println(Anagram("Mary","Army"));

    }
    public static boolean Anagram(String s1, String s2) {
        String str1 = s1;
        String str2 = s2;
        if (str1.length() != str2.length()) {
            return false;
        }
        else {
            char c1[] = str1.toLowerCase().toCharArray();
            char  c2[] = str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }
}
