import java.util.*;

class Student
{
    public String Name;
    public int Age;
    public int Marks;

    Student (int a int b, int c)
    {
        this.Name=a;
        this.Age=b;
        this.Marks=c;

    }
   public String toString()
   {
     return "Marvellous Pune";
   }

}

 class ToStringDemoStudent
{
    public static void main(String[] A)
    {
        Student sobj=new Student("Amit", 27, 98);

        System.out.println(sobj);

    }
    
}


