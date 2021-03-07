package collections;

import javax.xml.bind.Element;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.*;

public class ListInterfaceAPI
{
    public static void main(String[] args)
    {
        List list = new ArrayList();
        int size= list.size();
        System.out.println(size);

        boolean isEmpty=list.isEmpty();
        System.out.println("Is Empty :"+isEmpty);

        list.add("Anirban");
        list.add("Richmond");
        list.add(new Date());
        list.add(null);
        list.add(0,new Product(100,"Sedan",21000.00));
        list.add(null);
        list.add(new Product(101,"MacBook Pro",1300.00));
        System.out.println(list);

        //Iterator Method
        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());

    }


}
