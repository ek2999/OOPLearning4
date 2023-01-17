package com.example.ooplearning;

public class Rect {
    double width;
    double height;
    String nameOfRect;

    double getArea()
    {
        return width*height;
    }

    void maignify(double koeff){
        width *= koeff;
        height *= koeff;
    }
    Rect rect;

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                ", nameOfRect='" + nameOfRect + '\'' +
                ", rect=" + rect +
                '}';
    }
}
