class Demo{
    public int Addition (int A, int B) //Addtion@2ii
    {
        return A+B;
    }
    public double Addition(double A, double B)//Addition@2dd
    {
        return A+B;
    }
    public float Addition (float A, float b, float c)//Addtion@3fff
    {
        return a+b+c;
    }


}


class OverLoading{
    public static void  main (string A[]){
       Demo dobj=new Demo();
       System.out.println(dobj.Addition(10,11));
       System.out.println(dobj.Addition(10.89,20.45));
       System.out.println(dobj.Addition(10.3f,23.5f,30.2f));
    }
}