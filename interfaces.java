package com.company;

interface Bicycle{
   int a = 45;
    void applyBrake(int decrement);
    void speedup(int increment);
}
interface HornBicycle{
    void blowhorn12();
    void blowhorn47();
}
 class AvonCycle implements Bicycle,HornBicycle{
    void blowhorn(){
        System.out.println("Pee Pee Poo Poo");
    }
   public void applybrake(int decrement){
        System.out.println("Applying Brake");
    }

    public void applyBrake(int decrement) {

     }

     public void speedup(int increment){
        System.out.println("Applying speedup");
    }
     public void blowhorn12(){
         System.out.println("12 12 12 12");
     }
     public void blowhorn47(){
         System.out.println("47 47 47 47");
     }
}

public class interfaces {
    public static void main(String[] args) {
        AvonCycle cycleprem = new AvonCycle();
        cycleprem.applybrake(1);
        System.out.println(cycleprem.a);// You can create properties in interfaces
        // cycleprem.a = 45;
        // System.out.println(cycleprem.a); You can't modify the properties
        cycleprem.blowhorn12();
        cycleprem.blowhorn47();
    }
}
