class FinalMethod
{
    class Demo
    {
       public void fun()
       {
        System.out.println("Inside Demo Fun");
       }
       
       public final void gun()
       {
        System.out.println("Inside Demo gun");
       }
    }

    class Hello extends Demo
    {
        public void gun()
        {
            System.out.println("Inside the dervived gun");// Cannot called up gun
        }
    }
    public static void main (String A[])
    {
        Hello hobj=new Hello();
         
       
    }
}  // ->X