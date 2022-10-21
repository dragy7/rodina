package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Family family = new Family();
        Man man = new Man("Zdenek", 50, "tata");
        family.addMember(man);
        Woman woman = new Woman("Monika", 25, "mama");
        family.addMember(woman);
        family.freeTime();
        family.showAllMembers();

    }
}
