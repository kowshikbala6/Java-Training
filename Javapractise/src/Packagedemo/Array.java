package Packagedemo;

import java.util.Arrays;

public class Array {

    public static void main ( String[] args){
        int a[] ={1,2,3,8,5};
        String arr[] = {"kowshik","dhanu","chnadru"};
        int output=0;
        int count=0;
        int evencount =0 ;
        int z=800;
        boolean avilableflag = false;

        for( int x : a)
        {
            output = output + x;
        }
        System.out.println(output);
        for(int y : a)
        {
            int div = y%2;
            if(div==0) {
                count = count + 1;
            } else 
            if (div!=0)
            {
               evencount = evencount + 1;  
            }
        }
        System.out.println("odd number count"+count );
        System.out.println("even number count"+evencount);
        for(int com :a){
            if ( com == z)
            {
                avilableflag = true;
                //System.out.println("True" );

            }
        }
       String data =   avilableflag == true ? "true"  :  "false" ;
        System.out.println(data );
        Arrays.sort(a);
        Arrays.sort(arr);
        System.out.println("int sorting" + Arrays.toString(a));
        System.out.println("String sorting" + Arrays.toString(arr));
    }


}
