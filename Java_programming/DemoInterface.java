
interface Circle
{    //Characteristics 
    float PI =3.14; // public static final by Default
    
}


class DemoInterface
{
    public static void main (String A[])
    {

      System.out.println(Circle.PI);
      Circle.PI=10; //Error Due Final  Cannot run
    } 
}

// DemoInterfaceMethod.java