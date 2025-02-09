package Oopsdemo;

public class NewShape implements Shape {

    public  void draw(int a)
    {
        System.out.println("hi kowshik" + a);
    }
    public static void main(String[] args) {
        NewShape ns = new NewShape();
        ns.draw(10);
        Shape.ccircle();

    }


}
