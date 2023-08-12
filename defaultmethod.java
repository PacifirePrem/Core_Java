package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4K");
    }
    }

interface Wifi{
    String[] getNetworks();
    void connectotheNetwork(String Network);
}

class MyCellphone {
    void callNumber(int phonenumber) {
        System.out.println("Calling" + phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting...");
    }
}

class MySmartphone extends MyCellphone implements Wifi,Camera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording");
    }
    public void record4KVideo(){
        System.out.println("Recording in 4K");
    }
    public String[] getNetworks(){
        System.out.println("Getting Networks List");
        String[] networkList = {"Harry","Prem","Adarsh"};
        return networkList;
    }

    @Override
    public void connectotheNetwork(String Network) {

    }

    public void connecttotheNetwork(String network){
        System.out.println("Connecting");
    }

}
public class defaultmethod {
    public static void main(String[] args) {
        MySmartphone k20 = new MySmartphone();
        k20.record4KVideo();
        String[] mi = k20.getNetworks();
        for (String item:mi){
            System.out.println(item);
        }

    }
}
