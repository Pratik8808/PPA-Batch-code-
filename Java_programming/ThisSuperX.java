
class Base
{
    public int i,j;

   public Base()
    {
        System.out.println("Inside The Base Constructor");
        this.i=11;
        this.j=21;
    }

    public void fun()
    {
        System.out.println("Inside the Base Fun");
    }
}
class Derived extends Base
{
    public int x;
     public Derived()
     {
        System.out.println("Inside the Dervied Constructor");
        this.x=51;
     }
 
     public void gun()
     {
        System.out.println("Inside gun of the dervied");
        System.out.println("Value of i: "+i);
        System.out.println("Value of i: "+j);
        System.out.println("Value of i: "+x);
     }
}


public class ThisSuperX{


    public static void main (String A[])
    {
      Derived dobj=new Derived();
       dobj.gun();
   
 
    }
}