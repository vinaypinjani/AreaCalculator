package com.vinaypinjani;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Area for the circle of radius 7.8 is " + area(7.8d));
        System.out.println("Area for rectangle of dimensions 12.3 by 3.9 is " + area(12.3,3.9));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0d;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0d;
        }
        return x * y;
    }
}
