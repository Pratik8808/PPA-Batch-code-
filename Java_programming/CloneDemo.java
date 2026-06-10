import java.util.*;

class Student implements Cloneable
{
    public String Name;
    public int Age;
    public int Marks;

    Student (String Name ,int Age, int Marks)
    {
        this.Name=Name;
        this.Age=Age;
        this.Marks=Marks;

    }
 @Override
   public String toString()
   {
     return "Name:"+this.Name+"  Age :"+this.Age+"  Marks :"+this.Marks;
   }

   public Object clone() throws CloneNotSupportedException
   {
        return super.clone();

   }

}

 class  CloneDemo
{
    public static void main(String[] A)  throws Exception
    {
        Student sobj=new Student("Amit", 27, 98);
        Student sobjx=(Student)sobj.clone();    // Typcasting from int to Student Object

        System.out.println(sobj);
        System.out.println(sobjx); // sobj.toString();

        System.out.println(sobj.hashCode());
        System.out.println(sobjx.hashCode());

    }
    
}



