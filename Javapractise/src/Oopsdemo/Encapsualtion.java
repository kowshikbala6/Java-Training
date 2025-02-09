package Oopsdemo;

public class Encapsualtion {
    private int a=10;
    private String name="kowshik";
    private int b=20;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // this will defeine curent object or current class
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Encapsualtion en= new Encapsualtion();
        en.setA(20);
        en.getA();
        en.setName("kowshik");
        System.out.println(en.getName());
    }
}
