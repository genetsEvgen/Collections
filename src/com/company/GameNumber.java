package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameNumber {
    static void fillList(ArrayList<Integer> list, int n){
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
    }

    static void printList(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер = ");
        int n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        fillList(list, n);
        //printList(list);

        long start = System.currentTimeMillis();

        int p1=0,p2=0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int data;
            if (list.get(0) > list.get(list.size() - 1))
            {
                data = list.get(0);
                list.remove(0);
            }
            else
            {
                data = list.get(list.size() - 1);
                list.remove(list.size() - 1);
            }
            //printList(list);

            if (i % 2 == 0)
                p1 += data;
            else
                p2 += data;
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        System.out.println(p1 + " : " + p2);
    }
}
