package com.example.ooplearning;

import java.util.Scanner;

public class Point {
    double x, y;

    void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = in.nextDouble();
        System.out.println("Enter y: ");
        double y = in.nextDouble();
        move(x, y);
    }

    double geDinstans(Point a) {

        return Math.sqrt( Math.pow(x - a.y,2) + Math.pow(y - a.y,2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
