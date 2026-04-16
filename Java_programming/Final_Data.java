class Final_Data
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
         Demo dobj=new Demo(10,20);
         dobj.i=11; // Error  reinitalization not
         dobj.j=21;
         dobj.i++; // Not allowed
         dobj.j++;
    }
}

//final under score x