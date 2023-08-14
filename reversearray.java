package com.company;

public class reversearray {
    public static void main(String[] args) {
        int [] arr = {3,5,8,4,9,7,2};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i = 0;i<n;i++){
            temp = arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1]=temp;
        }
        System.out.println();
        for (int element: arr){
            System.out.println(element);
        }
    }
}
