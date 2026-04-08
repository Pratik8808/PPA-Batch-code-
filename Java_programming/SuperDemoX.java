
class Base
{
    public int i;
   public Base(int no)
    {
        System.out.println("Inside The Base Constructor");
        this.i=no;
      
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
        super(11); // explicite call to base constructor  always on top in child class as covention
        System.out.println("Inside the Dervied Constructor");
        this.i=21;
     }
 
     public void gun()
     {
        System.out.println("Inside gun of the dervied");
        System.out.println("Value of i from Dervied Class: "+i);
           System.out.println("Value of i from Base : "+super.i);
        
     }
}


public class SuperDemoX{


    public static void main (String A[])
    {
      Derived dobj=new Derived(); 
       dobj.gun();
   
 
    }
}