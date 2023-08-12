package com.company;

public class Strings {
    public static void main(String[]args){
        String a = "Prem";
        System.out.println(a);
        int value = a.length();
        System.out.println(value);
        String lstring = a.toLowerCase();
        System.out.println(lstring);
        String ustring = a.toUpperCase();
        System.out.println(ustring);
        System.out.println(a.substring(1));
        System.out.println(a.replace('e', 't'));
        System.out.println(a.startsWith("Kumar"));
        System.out.println(a.endsWith("Prem"));
    }
}
