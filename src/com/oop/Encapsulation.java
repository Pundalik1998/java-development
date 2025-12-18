package com.oop;

class Student1 {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age= age;
        }
    }
}

public class Encapsulation {
    static void main(String[] args) {
      Student1 s1 = new Student1();
        s1.setAge(21);
        System.out.println(s1.getAge());
    }
}
