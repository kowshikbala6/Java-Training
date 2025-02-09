package Packagedemo;

public class NumberRev {
    public static void main (String[] args)
    {
        int input = 1234;
        int output=0;
        int digit;
        do{
         digit = input%10;
        input = input/10;
       // System.out.println(digit);
        output = output*10+digit;
        }
        while (digit != 1 );
System.out.println(output);

    }
}
