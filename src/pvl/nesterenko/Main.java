package pvl.nesterenko;

import java.io.OutputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {
        LinkedList<String> list1 = new LinkedList<String>();

        list1.add("String1");
        list1.add("String2");
        list1.add("String3");

        int idx = list1.indexOf("String2");

        System.out.println(idx);

        for(int n=0; n<list1.size(); n++)
        {
            System.out.println( list1.get(n) );
        }

        list1.remove(1);
        System.out.println( "" );

        for(int n=0; n<list1.size(); n++)
        {
            System.out.println( list1.get(n) );
        }

        //--------------------------------------------------

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("String1");
        list2.add("String2");
        list2.add("String3");

        int idx2 = list2.indexOf("String2");

        System.out.println(idx2);

        for(int n=0; n<list2.size(); n++)
        {
            System.out.println( list2.get(n) );
        }

        list2.remove(1);
        System.out.println( "   " );

        for(int n=0; n<list2.size(); n++)
        {
            System.out.println( list2.get(n) );
        }

    }
}
