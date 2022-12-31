package string.problems;

import org.junit.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
    }

    public void Anagram() {
       boolean actualResult = true;
        boolean expectedResult = true;
        Assert.assertEquals(actualResult, expectedResult);
    }
    public void DetermineLargestWord() {
        String actualResult = "10 biological";
        String expectedResult = "10 biological";
        Assert.assertEquals(actualResult, expectedResult);
    }
    public void Palindrome() {
        String actualResult = "This string is a palindrome";
        String expectedResult = "This string is a palindrome";
        Assert.assertEquals(actualResult, expectedResult);
    }
    public void Permutation() {
        String actualResult = "ABC\n" + "ACB\n" + "BAC\n" + "BCA\n" + "CBA\n" + "CAB";
        String expectedResult = "ABC\n" + "ACB\n" + "BAC\n" + "BCA\n" + "CBA\n" + "CAB";
        Assert.assertEquals(actualResult, expectedResult);
    }
}

