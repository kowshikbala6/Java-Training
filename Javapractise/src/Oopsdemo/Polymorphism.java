package Oopsdemo;

public class Polymorphism { // method overloading
    int a=10;
    int b=20;
    double c=500;
    void draw ()
    {
        System.out.println("drwas a line"+a);
    }
    void draw (int a )
    {
        System.out.println("drwas a cycle"+a);
    } void draw (int a,int b)
    {
        System.out.println("drwas a square"+ a+b);
    } void draw (int a , int b,double c)
    {
        System.out.println("drwas a triangle"+ a+b+c);
    }
    void draw (double a , int b,double c)
    {
        System.out.println("drwas a rectangle"+ a+b+c);
    }

    public static void main(String[] args) {
        Polymorphism pl=new Polymorphism();
    pl.draw();
    pl.draw(30);
    pl.draw(20,50);
    pl.draw(10,20,500);
    pl.draw(6000.0,20,3000);
    }
}
