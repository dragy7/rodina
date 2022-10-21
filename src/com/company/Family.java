package com.company;

import java.util.ArrayList;

public class Family {
    ArrayList<Human> family = new ArrayList<Human>();


    public void freeTime() {
        family.forEach(Human::drive);
    }

    public void addMember(Human myHuman) {
        family.add(myHuman);
    }

    public void showAllMembers() {
        family.forEach((member) -> {
            System.out.println( "    "+ member.getRole());
            System.out.println("    "  +  member.getName());
            System.out.println( "     "+member.getAge());
        });
    }
}
