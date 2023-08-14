package com.company;

class Mythr2 extends Thread{

    public void run(){
        //System.out.println("Thank you" + this.getName());
        while (true){
            System.out.println("Thank you");
        }
    }
}
public class thread_methods {
    public static void main(String[] args) {
        Mythr2 t1 = new Mythr2();
        Mythr2 t2 = new Mythr2();
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();


    }
}
