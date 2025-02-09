package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
      ArrayList al = new ArrayList();
      al.add(1);
      al.add(2);
      al.add(3);
      al.add("kowshk");
      al.add("dhanu");
      al.add(1000.89);
        System.out.println(al.size());
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.add(4,"car");
        System.out.println(al);
        System.out.println(al.get(5));
        al.set(4,"hi");
        System.out.println(al);

        for( int i=0 ; i<al.size(); i++)
        {
            System.out.println(al.get(i));
        }
        for( Object x : al)
        {
            System.out.println(x);
        }
        ArrayList list =(ArrayList)al.clone();
        System.out.println(list.isEmpty());
        list.set(2,"cars");
        System.out.println(al);
        System.out.println(list);
        System.out.println(al.isEmpty());
        Iterator it = al.iterator() ;

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
