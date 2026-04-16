class Final_X
{
   final class Demo
    {
       public void fun()
       {
        System.out.println("Inside Demo Fun");
       }
       
       public void gun()
       {
        System.out.println("Inside Demo gun");
       }
    }

    class Hello extends Demo // Error
    {
        public void gun()
        {
            System.out.println("Inside the dervived gun");// Cannot called up gun
        }
    }
    public static void main (String A[])
    {    Demo dobj=new Demo(); //Allowed
        Hello hobj = new Hello();
         
       
    }
}