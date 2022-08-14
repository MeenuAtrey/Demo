package com.day2;

public class ExampleInstanceVariable {
    int a=100;
    int b=200;

    static int z = 450;

    public static void main(String[] args) {

        ExampleInstanceVariable obj = new ExampleInstanceVariable();

        ExampleInstanceVariable obj1 = new ExampleInstanceVariable();
        ExampleInstanceVariable obj2 = new ExampleInstanceVariable();

        // System.out.println("Hello world testing: " + new Date());
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.z);

        obj.a=500;
        obj.b=600;
        System.out.println(obj.a);
        System.out.println(obj.b);

        System.out.println(obj1.a);
        System.out.println(obj2.b);
    }
}
