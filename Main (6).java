import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       int i,j;
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the number of rows");
       int rows=scan.nextInt();
       for(i=1; i<=rows; i++)
       {
            for(j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");  
            for(j=1; j<(i-1)*2; j++)
            {
                System.out.print(" ");
            }
            if(i==1)
            {
                System.out.print("\n");
            }
            else
            {
                System.out.print("*\n");
            }
        }
        for(i=rows-1; i>=1; i--)
        {
            for(j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(j=1; j<(i-1)*2; j++)
            {
                System.out.print(" ");
            }
            if(i==1)
            {
                System.out.print("\n");
            }
            else
            {
                 System.out.print("*\n");
            }
        }
    }
}