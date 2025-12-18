package com.oop;

public class CopyConstructor {
    int id;
    String name;

    CopyConstructor(int id, String name){
         this.id = id;
         this.name = name;

    }
    CopyConstructor(CopyConstructor s2){
        this.id = s2.id;
        this.name = s2.name;
    }
    void display(){
        System.out.println(name + " " + id);
    }

    public static void main(String[] args) {
        CopyConstructor s1 = new CopyConstructor(101, "pundalik");
        CopyConstructor s2 = new CopyConstructor(s1);
        s1.display();
        s2.display();
    }
}
