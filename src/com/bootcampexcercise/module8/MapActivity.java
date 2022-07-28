package com.bootcampexcercise.module8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapActivity {
    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        Map names = new HashMap();
        names.put("1", "Agnes");
        names.put("2", "David");
        names.put("3", "Gustav");
        names.put("4", "Mark");


        //2 - Call print method to print the map passed as its parameter.
        MapActivity obj = new MapActivity();
        obj.print(names);
}


    void print(Map map)
    {
        //3 - Type code to print this map
        Set keySet = map.keySet();

        System.out.println("Key\tValue");
        Iterator iterat = keySet.iterator();
        while (iterat.hasNext()){
            String key = (String) iterat.next();
            System.out.println(key + "\t" + map.get(key));
        }


    }
}
