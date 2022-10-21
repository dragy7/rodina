package com.company;

public class Man  extends Human{
    public Man(String name, int age, String role) {
        super(name, age, role);
    }

    public void drive(){
        System.out.println( name +" umi ridit");
    }
}
