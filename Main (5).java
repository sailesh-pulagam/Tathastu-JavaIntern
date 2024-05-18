import java.util.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        String str,rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check : ");
        str=sc.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("Given String is a Palindrome");
        }
        else
        {
            System.out.println("Given String is not a Palindrome");
        }
    }
}