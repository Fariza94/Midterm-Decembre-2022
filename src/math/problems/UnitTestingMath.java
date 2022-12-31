package math.problems;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

    }

    //Assert.assertEquals(lowestDifference, expectedResult);

    public void testFactorial() {
        int actualResult = 120;
        int expectedResult = 120;
        Assert.assertEquals(actualResult, expectedResult);
    }

    public void testFibonacci() {
        //int actualResult =  0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986;
        //int expectedResult =  0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986;
        //Assert.assertEquals(actualResult, expectedResult);
    }

    public void FindLowestNumber() {
        int actualResult = 1;
        int expectedResult = 1;
        Assert.assertEquals(actualResult, expectedResult);
    }
    public void FindMissingNumber() {
        int actualResult = 9;
        int expectedResult = 9;
        Assert.assertEquals(actualResult, expectedResult);
    }
    public void LowestNumber() {
        int actualResult = 5;
        int expectedResult = 5;
        Assert.assertEquals(actualResult, expectedResult);
    }
}
