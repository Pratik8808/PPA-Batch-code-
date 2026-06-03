
import java.util.*;
class ArrayListDemo
{
    public static void main(String A[])
    {
           ArrayList <Integer> aobj= new ArrayList<Integer>();
           aobj.add(11);
           aobj.add(21);
           aobj.add(51);
           aobj.add(0,5);

           aobj.clear();

            System.out.println(aobj);
            System.out.println(aobj.size());


           
        
    }
}