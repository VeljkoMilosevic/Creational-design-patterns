/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.objectpool.memoization;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author Veljko
 */
public class Memoization {

    static BigInteger[] array = new BigInteger[100];
    private static final int FORTY_ELEMENTS = 40;

    public static void main(final String[] args) {
        final Date startTime = new Date();
        calculateFibonacci(FORTY_ELEMENTS);
        System.out.println(String.format("Time without memoization to calculate %s element of fibonacci:%s ms", FORTY_ELEMENTS, (new Date().getTime() - startTime.getTime())));

        final Date startTimeMemoization = new Date();
        calculateFibonacciMemoization(FORTY_ELEMENTS);
        System.out.println(String.format("Time with memoization to calculate %s element of fibonacci:%s ms", FORTY_ELEMENTS, (new Date().getTime() - startTimeMemoization.getTime())));
    }

    private static BigInteger calculateFibonacci(final int n) {
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }
        return calculateFibonacci(n - 1).add(calculateFibonacci(n - 2));
    }

    private static BigInteger calculateFibonacciMemoization(final int n) {
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }
        if (array[n] == null) {
            array[n] = calculateFibonacciMemoization(n - 1).add(calculateFibonacciMemoization(n - 2));
        }
        return array[n];
    }
}
