package com.company;

import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
        System.out.println("Enter the value of index");
        int  ind= sc.nextInt();
        try {
            System.out.println("Welcome to the Code");
            try {
                System.out.println(marks[ind]);
                flag = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index doesnt exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
        }
            System.out.println("Thank u for using the program");
    }
    }
}


