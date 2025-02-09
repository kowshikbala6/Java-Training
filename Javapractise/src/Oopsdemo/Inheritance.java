package Oopsdemo;

public class Inheritance  {
     int a=10;
    void display()
    {
        System.out.println("hello"+a);
    }
}
class A extends Inheritance  // class to class -> extends // interface to interface -> extends
{
    int b = 20;

     void run() {
        System.out.println("hellokowshik" + a + b);
    }
}
    class C extends A
    {
         int c = 20;

        void show() {
            System.out.println("hellorunfr" + a+b+c);
        }

         void run() // method overriding
        {
            super.run();//access immediate parent class / method
            System.out.println("runfrom c" + a+b+c);
        }

        public static void main(String[] args) {
            C cm =new C();
            cm.show();
            cm.run();
    }
}