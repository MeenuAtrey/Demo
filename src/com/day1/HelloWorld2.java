package com.day1;

import java.util.Date;

public class HelloWorld2 {

    int x=20;
    void display(){
        System.out.println(("Value of x: " + x));
    }
    public static void main(String[] args) {

        int xyz=2000;
        int pqr=5000;
        System.out.println("Hello world testing: " + new Date());
        HelloWorld2 obj = new HelloWorld2();
        obj.display();
        System.out.println("value of sum: " + (xyz+pqr));
        System.out.println("value of diff: " + (xyz-pqr));
        System.out.println("value of product: " + (xyz*pqr));
        System.out.println("value of div: " + (xyz/pqr));
        System.out.println("value of modulus: " + (xyz%pqr));
    }
}