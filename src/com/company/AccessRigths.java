package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AccessRigths {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, ArrayList<Character>> filesRights = new HashMap<>();

        Scanner scanner = new Scanner(new File("input.txt"));
        readFilenameRights(filesRights, scanner);

        HashMap<String, Character> operations = new HashMap<>();
        operations.put("read", 'R');
        operations.put("write", 'W');
        operations.put("execute", 'X');

        int countOperations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countOperations; i++) {
            String[] a = scanner.nextLine().split(" ");
            String oper = a[0];
            String filename = a[1];

            Character shortOper = operations.get(oper);
            if (filesRights.get(filename).contains(shortOper))
            {
                System.out.println("OK");
            }
            else
            {
                System.out.println("Access denied");
            }
        }

        scanner.close();
    }

    private static void readFilenameRights(HashMap<String, ArrayList<Character>> filesRights, Scanner scanner) {
        int countFiles = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countFiles; i++) {
            String[] a = scanner.nextLine().split(" ");
            String filename = a[0];
            ArrayList<Character> rights = new ArrayList<>();
            for (int j = 1; j < a.length; j++) {
                rights.add(a[j].charAt(0));
            }
            filesRights.put(filename, rights);
        }
    }
}
