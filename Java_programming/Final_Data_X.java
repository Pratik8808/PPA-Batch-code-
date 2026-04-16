class Final_Data_X
{
    class Demo
    {
        public final int i;
        public  int j;

        Demo(int a,int b)
        {
            this.i=a;
            this.j=b;
        }
    }
    public static void main (String A[])
    {
         Demo dobj= new Demo(10,20);
        
         dobj.j=21;
        
       
    }
}