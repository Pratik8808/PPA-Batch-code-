class RMD
{
class Base 
{
  public int i,j;
  public void fun()
  {
    System.out.println("Inside Base fun");
    
  }
    public void gun()
  {
    System.out.println("Inside Base gun");
    
  }
    public void sun()
  {
    System.out.println("Inside Base sun");
    
  }

  

}
class Derived extends Base
{
    int x,y;
    public void gun ()
    {System.out.println("Inside the Derived gun");}

     public void sun()
    {System.out.println("Inside the Derived sun");}

        public void run()
    {System.out.println("Inside the Derived run");}

}

    public static void main (String A[])
    {
        // Base bobj=new Base(); // No casting
        Base bobj=new Derived();
        // Derived dobj=new  Derived();  // no castinng
        Derived dobj=new Base();

    }
}