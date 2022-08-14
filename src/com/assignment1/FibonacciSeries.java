package com.assignment1;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        int i, f1=0, f2=1, l=89;
        System.out.println(f1+" "+f2);
        for (i=0;i<=70;i++){
            int next = f1+f2;
            f1=f2;
            f2=next;
            System.out.println(" "+next);
        }
    }
}
