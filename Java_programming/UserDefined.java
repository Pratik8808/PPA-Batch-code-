
import java.util.*;
class AgeInvaild extends Exception
{
    public AgeInvaild(String str)
    {
        super(str);
    }
}

class UserDefined
{
    public static void main (String A[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter your age : ");
        int Age=sobj.nextInt();

        try{
        if(Age<18)
        {
            throw new AgeInvaild("You are Under age");
        }
        else 
        {
            System.out.println("You can attend the session");
        }

        }
        catch(AgeInvaild Aobj)
        {
            System.out.println("Inside the catch :" +Aobj);
        }

        
    }
}