package com.day2;

public class ExampleInstanceVariable1111 {
    int a=100;
    int b=200;

    static int z = 450;

    Boolean B = true;

    public static void main(String[] args) {

        ExampleInstanceVariable obj = new ExampleInstanceVariable();

        ExampleInstanceVariable1111 obj1 = new ExampleInstanceVariable1111();
        ExampleInstanceVariable1111 obj2 = new ExampleInstanceVariable1111();

        // System.out.println("Hello world testing: " + new Date());
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.z);

        obj.a=500;
        obj.b=600;
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        System.out.println(obj1.a);
        System.out.println(obj2.b);
    }
}
