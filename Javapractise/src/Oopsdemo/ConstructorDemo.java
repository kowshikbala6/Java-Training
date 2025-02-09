package Oopsdemo;

public class ConstructorDemo {

    int sno;
    String name;
    ConstructorDemo(){
        sno=01;
        name="Dhanu";
    }
    ConstructorDemo(int a,String name)
    {
        sno=a;
        this.name=name;
    }
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    static  void run()// static varable / method no need to create object . memeory automatically allocted while creating the class
    {
        System.out.println("hi");
    }
   public  static void main ( String args[])
    {
        ConstructorDemo cd =new ConstructorDemo( );
        System.out.println(cd.sno);
        System.out.println(cd.name);
        cd.sno = 02;
        System.out.println(cd.sno);
        ConstructorDemo con =new ConstructorDemo( 01,"kowshik" );
        System.out.println(con.name);
        ConstructorDemo getter =new ConstructorDemo();
        getter.setSno(3);
        int sno=getter.getSno();
        System.out.println(sno);
        run();
    }

}
