package com.company;

import java.util.HashSet;

public class HashSetTask {

    static boolean checkCode(String s, int k) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            String p = s.substring(i, i+k);
            if (set.contains(p))
                return true;
            set.add(p);
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "189314523198123145";
        int k = 4;

        if (checkCode(s, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
