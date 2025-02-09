package Oopsdemo;

public class EmpDetails {
    int eid;
    String employeename;
    int salary;
    void display() // no paramter no return.
    {
        System.out.println(eid+employeename+salary);
    }
    String displayName() // no paramter with return.
    {
        //System.out.println(eid+employeename+salary);
        return employeename.toUpperCase();
    }
    void  displayInput( String i )// with paramter no return.
    {
        System.out.println(i);

    }
    Integer  displayReturn( int i )// with paramter with return.
    {

        return i;

    }
    public static void main ( String args[])
    {
        EmpDetails emp = new EmpDetails();
        emp.eid=01;
        emp.employeename="kowshik";
        emp.salary=20000;
        emp.display();
       String name = emp.displayName();
       System.out.println(name);
       emp.displayInput("Dhanu");
       int s = emp.displayReturn(20000);
        System.out.println(s);
    }
}
