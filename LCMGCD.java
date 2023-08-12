package com.company;
import java.util.Scanner;
public class LCMGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The GCD of two entered no: " + (gcd(num1,num2)));
        System.out.println("The LCM of two entered no: " + (lcm(num1,num2)));
    }
    public static int gcd(int a,int b)
{
  if(b==0)
   return a;
  else
   return gcd(b,a%b);
}
 
public static int lcm(int a,int b)
{
  return a*b/(gcd(a,b));
}
 
}
 
    

