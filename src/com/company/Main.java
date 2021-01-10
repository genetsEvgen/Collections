package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        //friends.add(index, element)
        //friends.indexOf()
        //friends.contains()


        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.Добавить друга");
            System.out.println("2.Удалить друга");
            System.out.println("3.Вставить друга");
            System.out.println("4.Вывести друзей");

            int choose = scanner.nextInt();
            if (choose == 1)
            {
                System.out.print("Введите имя: ");
                String name = scanner.next();
                friends.add(name);
            }
            else if (choose == 2)
            {
                System.out.println("Введите позицию");
                int index= scanner.nextInt();
                try
                {
                    friends.remove(index);
                }
                catch (IndexOutOfBoundsException exc)
                {
                    exc.printStackTrace();
                }
            }

            else if (choose == 4)
            {
                for (int i = 0; i < friends.size(); i++) {
                    System.out.println(friends.get(i));
                }
            }
            else if (choose == 5)
            {
                System.out.println("Введите имя");
                String name = scanner.next();

                while (friends.remove(name));
            }
        }
        while (true);
    }
}
