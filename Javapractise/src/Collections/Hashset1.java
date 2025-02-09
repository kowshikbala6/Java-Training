package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
    public static void main(String[] args) {

        HashSet hs =new HashSet();
        hs.add(3);
        hs.add("kowshik");
        hs.add(6);
        hs.add(100.6);
        hs.add(3);
        System.out.println(hs);
        System.out.println(hs.size());
      // hs.remove("kowshik");
        System.out.println(hs);
        Iterator it =hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
