package com.day3;

import java.util.Date;

public class ArithmeticOperationsUsingMethods {

    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setValueOfX(int x){
        this.x=x;
    }

    public void setValueOfY(int y){
        this.y=y;
    }
    public int sum(){
        return x+y;
    }

    public int diff(){
        return x-y;
    }

    public int product(){
        return x*y;
    }

    public int div(){
        return x/y;
    }

    public int mod(){
        return x%y;
    }
    public static void main(String[] args) {

        ArithmeticOperationsUsingMethods obj = new ArithmeticOperationsUsingMethods();
        obj.setValueOfX(10);
        obj.setValueOfY(3);
        System.out.println(obj.product());
        System.out.println(obj.mod());
        System.out.println("Today's Date: "+ new Date());
    }
}
