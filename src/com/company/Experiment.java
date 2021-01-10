package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Experiment {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        System.out.println("Начало");
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.removeFirst();
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
