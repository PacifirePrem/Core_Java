package com.company;

public class leapyear {
    public static void main(String[] args) {
        int year = 2008;

        if(year%400==0){
            System.out.println(year + " is a leap year");
        }
        else if(year%100==0){
            System.out.println(year + " is a leap year");
        }
        else if(year%4==0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " isn't a leap year");
        }
    }
    
}
