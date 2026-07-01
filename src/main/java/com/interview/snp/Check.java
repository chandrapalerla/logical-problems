package com.interview.snp;

public class Check {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

       parent.show(child);
       child.show(child);
    }
}

class Parent{

    void show(Parent parent){
        System.out.println("Parent calls parent");
    }

}
class Child extends Parent{

    void show(Parent child){
        System.out.println("Child calls parent");
    }

    void show(Child parent){
        System.out.println("Child calls child");
    }
}