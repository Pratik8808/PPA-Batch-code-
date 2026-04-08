
class Base
{
    public int i,j;

   public Base()
    {
        System.out.println("Inside The Base Constructor");
        this.i=0;
        this.j=0;
    }
    protected void finalize()
    {
        System.out.println("Inside the finalizeee Method of Base ");
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
        this.x=0;
     }
     protected void finalize()
     {
        System.out.println("Inside finalizeee method of Dervied");
     }
     public void gun()
     {
        System.out.println("Inside gun of the dervied");
     }
}


public class SingleGc{


    public static void main (String A[])
    {
        System.out.println("Inside the main");
        Derived dobj=new Derived();
        System.out.println(dobj.i);
        System.out.println(dobj.j);
      dobj.fun();
      dobj.gun();
      dobj=null;
      System.gc();
        System.out.println("End of the main");
        

 
    }
}