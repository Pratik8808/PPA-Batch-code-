import java.util.*;

class ArrayIndexException{

    public static void main (String A[])
    {
      Scanner sobj=new Scanner(System.in);
     int Arr[]={11,21,51,101,111};
     System.out.println("Enter the index of the Array :");
      
      int index=sobj.nextInt();
      try
      {
        System.out.println("Inside the try block");
      System.out.println("Element at that index is :"+Arr[index]);

      }
      catch(ArrayIndexOutOfBoundsException Aobj)
      {
        System.out.println("Inside ArrayIndexOutOfBoundsException catch");
        System.out.println("Exception is :"+Aobj);
      }
      

      System.out.println("End of the application");
      

        
    }
}