package com.example.ooplearning;

public class Main {

    //static Rect rect;
    public static void main(String[] args) {

       // System.out.println("Hello");

       Rect rect = new Rect(); //объявление переменной класса Rect
        rect.height = 10;
        rect.width = 15;
        rect.rect = new Rect();
        rect.nameOfRect = "rect";

        Rect rect1 = new Rect(); //объявление переменной класса Rect
        rect1.height = 5;
        rect1.width = 15;
        rect1.nameOfRect = "rect1";

        Rect rect2 = new Rect(); //объявление переменной класса Rect
        rect2.height = 1;
        rect2.width = 2;
        rect2.nameOfRect = "rect2";

        rect2.maignify(1.5);

/*        System.out.println(rect.getArea());
        System.out.println(rect1.getArea());
        System.out.println(rect2.getArea());

        System.out.println(rect1);
        rect1 = rect;
        System.out.println(rect == rect1);
        System.out.println(rect1);*/

/*     Point point1 = new Point();
     Point point2 = new Point();

     point1.input();
     System.out.println(point1);
     point2.input();
     System.out.println(point2);

     System.out.println(point1.geDinstans(point2));

     point1.move(5,5);
     System.out.println(point1);

     System.out.println(point1.geDinstans(point2));*/


        Double number = Double.valueOf(10.0);
        double numberCopy = number.doubleValue();
        number.toString();
        String a = "156";
        Integer integer = Integer.parseInt(a);

        int c = integer; //автораспаковка




    }
}
