package com.company;

public class loops {
    public static void main(String[] args) {
        //int i = 1;
        //while(i<=3){
        //System.out.println(i);
        //i++;
        //int b = 10;
        //do {
        //System.out.println(b);
        //b++;
        //}while(b<5);
        //int i;
        //for(i=1; i<=10; i++){
        //System.out.println(i);
        //}
        //printing odd numbers
        //int n;
        //for (n = 1; n < 5; n++) {
        //System.out.println(2*n+1);
        //}
        //printing decrementing for loop
        //for(int i = 10; i!=0; i--){
        //System.out.println(i);
        //}

        //break and continue
        int i;
        for (i = 0; i <= 50; i++) {
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Now is the dead end");

        }
    }
}
