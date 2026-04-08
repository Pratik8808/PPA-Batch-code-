
class Base
{
    public int i;
   public Base()
    {
        System.out.println("Inside The Base Constructor");
        this.i=11;
      
    }

    public void fun()
    {
        System.out.println("Inside the Base Fun");
    }
}
class Derived extends Base
{
    public int i;
     public Derived()
     {
        System.out.println("Inside the Dervied Constructor");
        this.i=21;
     }
 
     public void gun()
     {
        System.out.println("Inside gun of the dervied");
        System.out.println("Value of i from Dervied Class: "+i);
           System.out.println("Value of i from Base : "+super.i);
        // System.out.println("Value of i: "+x);
     }
}


public class ThisSuperXX{


    public static void main (String A[])
    {
      Derived dobj=new Derived();
       dobj.gun();
   
 
    }
}