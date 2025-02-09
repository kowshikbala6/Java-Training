package Packagedemo;

public class Palindrom {

    public static void main( String[] args)
    {
        int input = 121;
        int pal = input;
        int a=input;
        int output=0;
        int digit = 0;
    
        int count=0;
        while (a !=0)
        {
            a = a/10;
            count = count +1;
        }
        System.out.println("COUNT "+count);
      for (int i =0; i<count; i++) {
          digit = input % 10;
          input = input / 10;
          // System.out.println(digit);
          output = output * 10 + digit;
      }
        System.out.println(output);
        if(pal==output)
        {
            System.out.println(pal);
            System.out.println("yes it is polindrome");
        }
        else {
            System.out.println("not a polindrome");
        }
    }
}
