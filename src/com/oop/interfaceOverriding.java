package com.oop;
interface Shape{
    void draw();
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Square implements Shape{
    public void draw() {
        System.out.println("Drawing Square");
    }
}



public class interfaceOverriding {
    public static void main(String[] args) {
            Shape s;
            s = new Circle();
            s.draw();

            s= new Square();
            s.draw();
    }
}
