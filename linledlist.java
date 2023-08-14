package com.company;

import java.util.*;
import java.util.LinkedList;

public class linledlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(11);
        l2.add(10);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.addFirst(777);
        l1.add(6);
        l1.addLast(555);
        l1.addAll(0,l2);
        l1.add(1,5);
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.equals(l2));
        l1.removeAll(l2);

        // System.out.println(l1.contains(12));
        for (int i=0;i<l1.size();i++) {
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
        System.out.println(l1);

    }
}
