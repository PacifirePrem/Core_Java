import java.util.Scanner;

public class Conditional {
    public static void main(String[]args){
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 46:
                System.out.println("You are experienced Driver");
                break;

            case 36:
                System.out.println("YOu are semi experienced");
                break;

            case 26:
                System.out.println("You are Amateur");
                break;

            default:
                System.out.println("You are Rookie");
        }
        /*if (age>46){
            System.out.println("You are experienced  driver");
        }
        else if(age>36){
            System.out.println("You are semi experienced Driver");
        }
        else if(age>26){
            System.out.println("You are Amateur Driver");
        }
        else{
            System.out.println("You are a Rookie");
        }*/
    }
}
