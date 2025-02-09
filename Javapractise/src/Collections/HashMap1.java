package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm =new HashMap<Integer,String>();
        hm.put(1,"kowshik");
        hm.put(2,"dhanu"); hm.put(3,"car"); hm.put(4,"ussa");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println (hm.get(2));
 hm.replace(3,"van");
        System.out.println(hm);
        hm.remove(3);
        System.out.println(hm);
        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
