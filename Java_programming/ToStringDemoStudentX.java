import java.util.*;

class Student
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

}

 class ToStringDemoStudentX
{
    public static void main(String[] A)
    {
        Student sobj=new Student("Amit", 27, 98);

        System.out.println(sobj);

    }
    
}



