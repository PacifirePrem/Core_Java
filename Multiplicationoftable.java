package com.company;

public class Multiplicationoftable {
    static  void multiplication(int n){
        for(int i=1;i<=10;i++)
        {
            System.out.format("%d X %d = %d \n",n , i , n*i );
        }
    }
     static void pattern1(int n){
        for (int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
     static int sum_rec(int n){
        if (n==1) {
            return 1;
        }
            {
                return n + sum_rec(n-1);
            }
        }
     static void pattern2(int n){
        for(int i=0; i<n; i--){
            for (int j = 0; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String[] args)
    {
        //multiplication(7);
        //
        // pattern1(5);
       //int c =  sum_rec(5);
        //System.out.println(c);
        //pattern2(5);

    }

}
