
import java.util.Scanner;

class DynamicMemory{


    public static void main (String A[])
    {
       Scanner sobj= new Scanner(System.in);
       int size=0;
       System.out.println("Enter the number of element ");

       size=sobj.nextInt();

    // dynamic memory allocation

    float Marks[] =new float[size];

    //("USe the memory");

    

    Marks=null;
    System.gc();
     
    }
}