//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
    String[] letter = { "DHANU","Ant","kowshik" ,"Aravind","hello","Arun"};
    String targetChar = "A";
    int[] numbers ={1,2,3,4,5,6,7,8,9,10};
    int[] number= new int[10];
    int size = numbers.length;
   for ( int i=0; i< size;i++)
    {
        number[i] = numbers[i]*5;

    }
        for (int numb:number) {
                System.out.println( numb);}
        for ( int i=0; i< size;i++)
        {
           int even= numbers[i]%2;
           // System.out.println(even);
           if ( even==0) {
               int j=0;
               numbers[j]= numbers[i];
               j++;
               System.out.println( numbers[j]);
           }
        }
        for (int even1:numbers) {
            System.out.println( even1);}

        for (String aletter:letter) {

            if (aletter.contains(String.valueOf(targetChar))) {
                System.out.println( aletter);
            }

        }
    }
}