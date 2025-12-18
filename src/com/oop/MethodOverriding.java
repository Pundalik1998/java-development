package com.oop;

class Animal{
    void sound(){
        System.out.println("Animal make a sound");
    }
}
class Dog extends Animal{
   @Override
    void sound(){
       super.sound();
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
      Animal r = new Dog();
      r.sound();
    }
}
