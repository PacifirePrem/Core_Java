package com.company;

class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        int i =34;
        //System.out.println("Thank you" + this.getName());
         while (true){
        System.out.println("Thank you" + this.getName());
        i++;
        }
    }
}
public class thread_priorities {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("PREM");
        Mythr1 t2 = new Mythr1("CHOPRA1");
        Mythr1 t3 = new Mythr1("PREM2");
        Mythr1 t4 = new Mythr1("CHOPRA2");
        Mythr1 t5 = new Mythr1("PREM3 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
