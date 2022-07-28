package com.bootcampexcercise.module8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List list = new ArrayList();
        list.add("Mark");
        list.add("Gustav");
        list.add("David");

        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity arr = new ListActivity();
        arr.print(list);
    }

    void print(List list) {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        Iterator<Object> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
