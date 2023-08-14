package com.company;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i =34;
        System.out.println("Thank you");
       // while (i<34){
            //System.out.println("I am a thread");
            //i++;
        //}
    }
}
public class Threadcon {
    public static void main(String[] args) {
        Mythr t = new Mythr("PREM");
        Mythr t12 = new Mythr("CHOPRA");
        t.start();
        t12.start();
        System.out.println("The id of the thread is " + t.getId());
        System.out.println("The name of the thread is " + t.getName());
        System.out.println("The id of the thread is " + t12.getId());
        System.out.println("The name of the thread is " + t12.getName());

    }
}
