
import java.util.Scanner;

class DynamicMemoryio{


    public static void main (String A[])
    {
       Scanner sobj= new Scanner(System.in);
       int size=0;
       int i=0;
       System.out.println("Enter the number of element ");

       size=sobj.nextInt();

    // dynamic memory allocation

    float Marks[] =new float[size];

    //("USe the memory");
    
    System.out.println("Enter the yours marks");
    for( i=0;i<size;i++){
        Marks[i]=sobj.nextFloat()
    }

    System.out.println("Enter Marks are ");
    for( i=0;i<size;i++)
    {
     System.out.println(Marks[i]);
    }

    

    Marks=null;
    System.gc();
     
    }
}