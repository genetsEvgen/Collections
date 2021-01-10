package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LinkedListTask {
    static void fillList(LinkedList<Integer> list, int n){
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.addLast(random.nextInt(100));
        }
    }

    static void printList(LinkedList<Integer> list)
    {
        for (Integer item: list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер = ");
        int n = scanner.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        fillList(list, n);
        //printList(list);

        long start = System.currentTimeMillis();

        int p1=0,p2=0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int data;
            if (list.getFirst() > list.getLast())
            {
                data = list.getFirst();
                list.removeFirst();
            }
            else
            {
                data = list.getLast();
                list.removeLast();
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
