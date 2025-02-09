package Packagedemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRev
{


public static void main (String[] args) throws InterruptedException {

    int  number[] ={1,2,3,4,5,6};
    int a=1;
    int b =2;

    int sum;
    int output[] = new int[6];
    sum=a+b;
    // Using Scanner for Getting Input from User
    Scanner in = new Scanner(System.in);
    System.out.println("enter vlue");
int c=in.nextInt();
    System.out.println("You entered string " + c);
    try{
        int div = a/c;

        System.out.println("div of the number "+div );
    }
   catch (ArithmeticException ex){
       System.out.println("invalid input"+ex);
   }
    finally {
        System.out.println("div done");
    }
    Thread.sleep(2000);


    for(int i=number.length-1; i>=0 ; i-- ){
       //System.out.println("sum of the number "+i );
        output[(number.length-1)-i]=number[i];
        // System.out.println("Reverse Array "+ Arrays.toString(output));
    }
    System.out.println("Reverse Array "+ Arrays.toString(output));


}}
