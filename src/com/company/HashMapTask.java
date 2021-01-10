package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTask {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();

        countries.put("Россия", "Москва");
        countries.put("Франция", "Париж");
        countries.put("Англия", "Лондон");
        //countries.put("Англия", "FFF");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну");
        String country = scanner.next();

        if (countries.containsKey(country))
            System.out.println(countries.get(country));
        else
            System.out.println("Нет такой страны");

//        for (String key: countries.keySet()) {
//            System.out.println(key + "->" + countries.get(key));
//        }

        //Map.Entry<String, String>
        for (var entry: countries.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
