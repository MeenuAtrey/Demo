package com.assignment1;

public class FactorialOfNumber{
    public static int factorial(int n) {
        int i, factorial=1;
        for(i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int n = 10;
        int f = factorial(n);
        System.out.println("Factorial is " + f);
    }
}