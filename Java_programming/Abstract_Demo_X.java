 abstract class Demo{
    public int i,j;
    public int Add(int a, int  b) // Concrete method
    {
        return a+b;
    }
    public abstract int sub(int a, int b);
  

}
class Hello extends Demo
{
   
}

class Abstract_Demo_X
{

    public static void main (String A[])
    {
        Hello hobj = new Hello();
    }
}

// Abstract_Demo_X_Complete