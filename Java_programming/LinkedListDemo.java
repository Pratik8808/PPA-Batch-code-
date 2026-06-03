
import java.util.*;

public class LinkedListDemo {


    public static void main(String [] A) {
        LinkedList<Integer> lobj =new LinkedList <Integer>();
        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        lobj.add(111);

        if(lobj.contains(51))
        {
            System.err.println("51 Present int the List");

        }
        else
        {
            System.out.println("51 is not Present ");

        }
      

        Iterator iobj=lobj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        
    }
    
}
