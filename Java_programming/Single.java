
class Base
{
    public int i,j;

   public Base()
    {
        System.out.println("Inside The Base Constructor");
    }
    protected void finalize()
    {
        System.out.println('Inside the finalize Method of Base ');
    }
    public void fun()
    {
        System.out.println("Inside the Base Fun");
    }
}
class Derived extends Base
{
    public int x;
     public Dervied()
     {
        System.out.println("Inside the Dervied Constructor");
     }
     protected void finalize()
     {
        System.out.println("Inside finalize method of Dervied");
     }
     public void gun()
     {
        System.out.println("Inside gun of the dervied");
     }
}


public Single{


    public static void main (String A[])
    {
 
    }
}