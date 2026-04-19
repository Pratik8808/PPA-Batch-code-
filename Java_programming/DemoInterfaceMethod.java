
interface Circle
{    //Characteristics 
    float PI =3.14; // public static final by Default

    //Behaviours(public abstract by deafult)
    float Area(float Radius);  // B deafult Abstaract internally
    float Circumference(float Radius);
}

class Marvellous implements Circle
{
  // Error due to  missing body of area and circumference;
}


class DemoInterfaceMethod
{
    public static void main (String A[])
    {
        Marvellous mobj=new Marvellous();

    }
}

// DemoInterfaceMethodX.java