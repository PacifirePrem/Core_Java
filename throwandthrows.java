package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can't be negative ";
    }
    @Override
    public String getMessage(){
        return "Radius can't be negative";
    }
}
public class throwandthrows {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw  new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        //made by prem
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //Shivam uses divide func made by prem
        try {
            int c = divide(6, 0);
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Exception");
        }

    }
}
