
import java.util.*;
public class Pattern3 {
	public static void main(String args[])
	{
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
        		for(j=1;j<=i;j++)
        		{
            			System.out.print((char)(i+64));
        		}
 
        		System.out.println("");
    		}
	}
}
    

