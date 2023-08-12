package com.company;

public class Overloading {
    static int sum(int x, int y)
    {
        return x+y;
    }
    static int sum(int x, int y, int z)
    {
        return x+y+z;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 5 and 6 is: " + sum(5,6));
    }
}
