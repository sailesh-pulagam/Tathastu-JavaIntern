public class Main {

    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
             if (arr[arr[i]] != i)
                return false;
        }
         return true;
    }
     public static void main(String[] args)
    {
        int arr[] = { 2,3,0,1 };
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}