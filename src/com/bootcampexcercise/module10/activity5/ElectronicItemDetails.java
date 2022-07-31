package com.bootcampexcercise.module10.activity5;

import java.util.HashMap;
import java.util.Map;

public class ElectronicItemDetails {
    public static void main(String[] args) {

        Map<String, Double> itemHashMap = new HashMap<>();
            itemHashMap.put("TV", 999.99);
            itemHashMap.put("Refrigerator", 1200.00);
            itemHashMap.put("Washing Machine", 1700.00);
            itemHashMap.put("Laptop", 3000.00);

        ElectronicItemDetails obj = new ElectronicItemDetails();
        System.out.println("Price of TV is " + obj.returnPriceOfItem(itemHashMap, "TV"));

    }
    public double returnPriceOfItem(Map<String, Double> map, String name){
        return map.get(name);
    }
}
