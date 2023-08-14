package com.company;

public class reverseofno {
    public static void main(String[] args) {
        int no = 14968;
        int reversed = 0;
        for(;no != 0; no /= 10) {
            int digit = no % 10;
            reversed = reversed * 10 + digit;
          }
      
          System.out.println("Reversed Number: " + reversed);
        }
      }
    
    

