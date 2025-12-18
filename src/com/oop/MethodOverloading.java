package com.oop;

public class MethodOverloading {
    int add(int a, int b){
        return a+ b;
    }
    double add(double a, double b){
        return a+ b;
    }

    public static void main(String[] args) {
         MethodOverloading s1 = new MethodOverloading();
        System.out.println(s1.add(2,5));
        System.out.println(s1.add(2.5,5.5));
    }
}
