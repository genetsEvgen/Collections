package com.company;

import java.util.*;
import java.io.*;

public class ThreeFatMan {
    static int findGreatestMassa(int[] massa) {
        int i = 1;

        if ((massa[0] > massa[1]) && (massa[0] > massa[2])) {
            i = 0;
        } else if (massa[2] > massa[1]) {
            i = 2;
        }
        return massa[i];
    }

    // Проверка вхождения массы в допустимый интревал
    static boolean massaGoodInterval(int massa) {

        return ((massa > 94) && (massa < 727));
    }

    public static void main(String[] args) {
        int[] massaInt = new int[3];
        int i = 0;
        //
        try (Scanner scanner = new Scanner(new File("massa.txt"))) {
            while (scanner.hasNext()) {
                massaInt[i++] = scanner.nextInt();
            }
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }

        try(PrintWriter out = new PrintWriter("result.txt")){
            if (massaGoodInterval(massaInt[0]) && massaGoodInterval(massaInt[1]) && massaGoodInterval(massaInt[2])) {
                int max = findGreatestMassa(massaInt);
                out.write(max);
                System.out.println(max);
            } else {
                out.write("Error");
            }
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
    }
}
