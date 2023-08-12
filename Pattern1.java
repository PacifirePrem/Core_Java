
import java.util.*;
public class Pattern1 {
    public static void main(String [] args)
    {
        //creating object of Scanner class 
        Scanner s = new Scanner(System.in);
        //Taking input of number of elements in the series
        System.out.println("Enter the Nth term “N” ");
        int n = s.nextInt();
        //for loop to print the series
        for (int i = 1; i <= n; i++) 
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        } 
    
}}

    

