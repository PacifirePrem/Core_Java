package com.company;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        k= sc.nextInt();
        try{
        System.out.println("integer 100 div by k"+1000/k);
    }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
