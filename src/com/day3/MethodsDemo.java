package com.day3;

public class MethodsDemo {
    public int x=100;
    int y=200;

    public void display(){
        System.out.println("Value of x" + x);
        System.out.println("Value of y" +y);
    }


    public static void main(String[] args) {
        MethodsDemo obj = new MethodsDemo();
        obj.display();
    }
}
