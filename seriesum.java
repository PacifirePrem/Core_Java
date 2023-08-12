package com.company;
import java.util.Scanner;

public class seriesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double sum = 0;
        System.out.println("Enter number of terms for the series");
        num = sc.nextInt();
        for(int i = 1; i<=num;i++){
            sum += 1.0/i;
        }
        System.out.println("sum:" + sum);
    }
    
}
