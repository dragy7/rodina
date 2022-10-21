package com.company;

public class Woman extends Human {

    public Woman(String name, int age, String role) {
        super(name, age, role);
    }

    public void drive(){
        System.out.println(name +" neumi ridit");
    }
}
