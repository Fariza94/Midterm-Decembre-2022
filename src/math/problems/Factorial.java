package math.problems;

public class Factorial {

    // In this exemple let's for exemple n = 5, so we find the factorial of 5.
    public static void main(String[] args) {
        System.out.println("Using RECURSION, Factorial of 5 is " + factorial(5));
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int factorial = 1;
        int n = 5;

        for(int i=1; i<=n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Using ITERATION, Factorial of 5 is " + factorial);



    }
    // Using Recursion
    public static int factorial (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);

        }
    }

}

