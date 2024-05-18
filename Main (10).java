import java.util.ArrayList;
import java.util.ListIterator;
 
public class Main {
 
    public static void main(String[] args)
    {
 
        ArrayList<String> colors = new ArrayList<String>();
 
        colors.add("Red");
        colors.add("White");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Green");
 
        ListIterator<String> listIterator
            = colors.listIterator();
 
        System.out.println("List Before remove() method = "
                           + colors);

        for (int i = 0; i < 3; i++) {
            listIterator.next();
        }

        listIterator.remove();

        System.out.println("List After remove() method =  "
                           + colors);
    }
}