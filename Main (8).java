import java.io.*;
import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string to be reversed:");
        String s = sc.nextLine();
        char[] a = s.toCharArray();       
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("The reversed string is:");
        System.out.print(reverse);
    }
}