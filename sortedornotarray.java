package com.company;

public class sortedornotarray {
    public static void main(String[] args) {
        boolean Issorted = true;
        int [] arr = {3,5,8,4,9,7,2};
        for (int i=0; i< arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                Issorted = false;
                break;
            }
        }
            if(Issorted){
                System.out.println("The array is sorted");
            }
            else {
                System.out.println("The array isn't sorted");

            }
    }
}
