package Packagedemo;

import java.util.Arrays;

public class StringPractise {

    public static void main ( String args[])
    {
        // String creation
        String a = "kowshik";
        String e = "Kowshik";
        String c= "welcome kowshik hello";
        String b = new String("bala");
        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println(c.length());
        String trimc = c.trim();
        System.out.println(trimc);
        System.out.println(trimc.length());
        char d= c.charAt(5);
        System.out.println(d);
        System.out.println(a.contains("shik"));
        System.out.println(a.equals(e));
        System.out.println(a.equalsIgnoreCase(e));
        System.out.println(c.replace("kowshik","dhanu").replace("hello","bala"));
        System.out.println(c.substring(4,7));
        String abc[] = c.split(" ");
        System.out.println(Arrays.toString(abc));
        System.out.println(abc.length);
    int count = 0;
        for (int i=0; i<a.length(); i++) {
            //letters in word
            if (a.charAt(i) == 'k') {
                count = count + 1;
            }
        }
            System.out.println(count);
        String reva ="";

        for (int i=a.length()-1; i>=0; i--)
        {
             //reva=reva.concat(String.valueOf(a.charAt(i)));
            reva=reva+a.charAt(i);
    }
        System.out.println(reva);
       StringBuffer s =new StringBuffer("helloworls"); // mutabale
       s=s.append("kowshik");
       System.out.println(s);
        System.out.println(s.reverse());

        //equals
        String s1="abicd";
        String s2="abicd";
        String s3 = new String ("abicd");
        String s4 = new String ("abicd");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
StringBuffer x= new StringBuffer("madam");
System.out.println("palindrome CHeck :" + x.equals(x.reverse()));
StringBuffer y =new StringBuffer("k@hi,fdh%kol.");
String xy="";
for(int i=0; i<y.length(); i++)
{
    if( y.charAt(i) > 'A' && y.charAt(i) < 'Z' || y.charAt(i) > 'a' && y.charAt(i) < 'z')
    {
        xy=xy+y.charAt(i);
    }
}
System.out.println(xy);


















    }

}
