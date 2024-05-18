import java.util.*;
import java.lang.*;

class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. ADD");
        System.out.println("2. SUBTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
        int ch=0;
        while(ch<5)
        {
            System.out.println("Enter your choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter 2 numbers to perform Addition : ");
                        int a,b,sum;
                        a=sc.nextInt();
                        b=sc.nextInt();
                        sum=a+b;
                        System.out.println(sum);
                        break;
                case 2: System.out.println("Enter 2 numbers to perform Subtraction : ");
                        int p,q,difference;
                        p=sc.nextInt();
                        q=sc.nextInt();
                        difference=p-q;
                        System.out.println(difference);
                case 3: System.out.println("Enter 2 numbers to perform Multiplication : ");
                        int r,s,product;
                        r=sc.nextInt();
                        s=sc.nextInt();
                        product=r*s;
                        System.out.println(product);
                case 4: System.out.println("Enter 2 numbers to perform division : ");
                        int c,d,division;
                        c=sc.nextInt();
                        d=sc.nextInt();
                        division=c/d;
                        System.out.println("Result after division : "+ division);
                default: System.out.println("Selected Choice is Invalid");
            }
        }
    }
}