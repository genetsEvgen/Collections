/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;
import java.lang.reflect.Array;
import java.util.*;

/**
 *
 * @author Евгений
 */
public class EnoughIsEnough {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
                   
        System.out.println("Введите массив числе через пробел:");
        
        String pictureNumLine = scanner.nextLine();
        String[] pictureNumStr = pictureNumLine.split(" ");
        Integer [] pictureNum = new Integer[pictureNumLine.split(" ").length];
        
        System.out.println("Введите максимально число повторений чисел: ");
        int maxRepeat = scanner.nextInt();
        
        for (int i = 0; i < pictureNum.length; i++) {
            pictureNum[i] = Integer.parseInt(pictureNumStr[i]);
           
        }
        
        HashMap<Integer, Integer> pictureNumAndCol = new HashMap<>();
        
        for (int i = 0; i < pictureNum.length; i++) {
            int count = pictureNumAndCol.getOrDefault(pictureNum[i], 0) + 1;
            
            if (count <= maxRepeat){
              pictureNumAndCol.put(pictureNum[i], count);
            }
          
            
        }
        
        System.out.println("Отсортированный массив чисел: ");
        
       // pictureNumAndCol.entrySet()
        
        for(Map.Entry<Integer, Integer> pair : pictureNumAndCol.entrySet())
        {
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
        
    }
    
}
