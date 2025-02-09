package Packagedemo;

import java.util.Arrays;

public class Stringrev {



    public static void main(String[] args) {
        String h1= "kowshik";
        String revs="";
        int a[]={2,4,5,6,7,8};
        int b=987654321;
        int digit;
        int c1=0;
        int output[]=new int[6];

        for (int i=h1.length()-1;i>=0;i--) {

         revs=revs+h1.charAt(i);
            }
        for (int j=a.length-1 ; j>=0; j--)
        {
            output[(a.length-1)-j]=a[j];
        }
        do{
            digit = b%10;
            b=b/10;
            c1=c1*10+digit;
        }while(digit!=1);

        System.out.println(c1);
System.out.println(revs);
        System.out.println(Arrays.toString(output));
        }
    }
