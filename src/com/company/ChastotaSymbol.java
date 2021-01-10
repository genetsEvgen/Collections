package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class ChastotaSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст");
        String s = scanner.nextLine();

        HashMap<Character, Integer> dict = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            int count = dict.getOrDefault(c, 0) + 1;
            dict.put(c, count);

//            if (dict.containsKey(c))
//            {
//                int count = dict.get(c);
//                dict.replace(c, count + 1);
//            }
//            else
//            {
//                dict.put(c, 1);
//            }
        }

        for(var pair : dict.entrySet())
        {
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
    }
}
