package org.rituraj.annotations.advanced.cachingsystem;

import java.util.*;
public class ExpensiveOperation {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public static int computeSquare(int number) {
        if (cache.containsKey(number)) {
            System.out.println("Returning cached result for: " + number);
            return cache.get(number);
        }
        System.out.println("Computing square for: " + number);
        int result = number * number;
        cache.put(number, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(computeSquare(5)); // Computation happens
        System.out.println(computeSquare(5)); // Cached result returned
        System.out.println(computeSquare(7)); // Computation happens
        System.out.println(computeSquare(7)); // Cached result returned
    }
}
