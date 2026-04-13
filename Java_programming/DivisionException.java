import java.util.*;

class DivisionException{

    public static void main (String A[])
    {
      Scanner sobj=new Scanner(System.in);
      int No1=0;
       int No2=0;
      int Ans=0;
      System.out.println("Enter first number :");
      No1=sobj.nextInt();
      System.out.println("Enter the Seoond Number:");
      No2=sobj.nextInt();
      try{
        System.out.println("Inside the try block");
            Ans=No1/No2;
      }
      catch(ArithmeticException aobj)
      {
        System.out.println("Inside the catch block");
        System.out.println("Exception occured :"+aobj);

      }
     
      System.out.println("Division is :"+Ans);

        
    }
}