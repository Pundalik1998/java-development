package com.oop;

class Student {
    String name;
    int age;

    Student(){
        this("pundalik",101);
    }

    Student(String name, int age){
        this.name= name;
        this.age= age;
    }
    public void getInfo() {

        System.out.println("The name of this student is: " + name);
        System.out.println("The age of this student is: " + age);

    }


}

public class Oop {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.getInfo();
//        Student s2 = new Student();
//        s2.name = "pralhad";
//        s2.age = 27;
//        s2.getInfo();
    }
}
