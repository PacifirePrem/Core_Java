package com.company;

import java.util.Scanner;

public class specificexc {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide: ");
        int num = sc.nextInt();
        try {
            System.out.println("The value at array index is: "+marks[ind]);
            System.out.println("The num is to be divided: "+ marks[ind]/num);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBound exception occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception occured");
            System.out.println(e);
        }
    }
}
