package com.bootcampexcercise.module8;

import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {

        //TODO: 1 - Type code to create a set of names.

        //Also try adding a few duplicate entries to this set.

        HashSet names = new HashSet();

        names.add("David");
        names.add("Gustav");
        names.add("Mark");
        names.add("Mark");
        names.add("David");

        //TODO: 2 - Call print method to print the set passed as its parameter.
        SetActivity obj = new SetActivity();
        obj.print(names);
    }

    void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for (Object mySet : set) {
            System.out.println(mySet.toString());
        }
    }
}