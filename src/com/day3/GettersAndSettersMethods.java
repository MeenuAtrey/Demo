package com.day3;

public class GettersAndSettersMethods {

    int x;

    double d;

    String s;

    char ch;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public static void main(String[] args) {
        GettersAndSettersMethods obj = new GettersAndSettersMethods();
        System.out.println(obj.getX());
        System.out.println("===========================================");
        obj.setX(99);
        System.out.println(obj.getX());
        System.out.println("===========================================");
        obj.setD(99.98);
        System.out.println(obj.getD());
        System.out.println("===========================================");
        System.out.println(obj.getS());
        System.out.println("===========================================");
        obj.setS("Hello there!");
        System.out.println(obj.getS());
        System.out.println("===========================================");
        System.out.println(obj.getCh());
        System.out.println("===========================================");
        obj.setCh('M');
        System.out.println(obj.getCh());
    }
}
