package com.company;

public class maxmininarr {
    public static void main(String[] args) {
        int [] arr = {3,5,8,4,9,7,2};
        int max = 0;
        for (int e:arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The max value in the array is: "+max);
    }
}
