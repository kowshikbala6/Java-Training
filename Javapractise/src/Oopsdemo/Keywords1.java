package Oopsdemo;

public class Keywords1 {
     final int x=10;
     final void display1 ()
    {
       // x=3;
        System.out.println(x);
    }
}
     class Test extends Keywords1{
        int y=20;

     final void display()// cannot override / can't modify the methods
        {
            System.out.println(x+y);
        }

        public static void main(String[] args) {
            Test a1= new Test();
            a1.display();

        }
    }

