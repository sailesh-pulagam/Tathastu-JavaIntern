import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int arr[][] = new int[3][3], res[][] = new int[3][3];
        int row, col ;
        
        System.out.println("\nEnter matrix elements : ");
        for(row=0;row<3;row++)
            for(col=0;col<3;col++)
                arr[row][col] = scan.nextInt();
        
        System.out.print("The matrix elements are : ");
        printMatrix(arr);

        for(row=0;row<3;row++)
            for(col=0;col<3;col++)
            {   
                res[col][row]= arr[row][col];
            }   
        System.out.print("\n\nThe transpose of the matrix : ");
        printMatrix(res);
    }

    static void printMatrix(int arr[][])
    {
        int row, col;
        for(row=0;row<3;row++)
        {
            System.out.print("\n");
            for(col=0;col<3;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
        }
    }
}