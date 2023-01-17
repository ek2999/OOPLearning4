package com.example.ooplearning.constructorTest;

public class Main {

    public static final Integer MAGNIFIRE = 10000;

    public static void main(String [] args) {


    }
}

class Person {
    String name;
    protected int age;
    public String address;
    private String phone;


    public Person(String name, int age, String address, String phone){

        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;

    }

    public void displayName(){

        System.out.println(name);

    }

    void displayAddress(){

        System.out.println(address);

    }

    protected void displayAge(){

        System.out.println(age);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}

class Fraction{
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator) {
        if(denominator ==0) {
            System.out.println("Denominator can`t be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

}