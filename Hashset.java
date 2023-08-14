package com.company;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(6,0.5f);
        h1.add(6);
        h1.add(8);
        h1.add(3);
        h1.add(11);
        System.out.println(h1);
        h1.clear();
        System.out.println(h1);
    }
}
