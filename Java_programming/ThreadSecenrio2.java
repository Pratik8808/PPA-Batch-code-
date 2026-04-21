class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Inside the run method ");
    }
    
}


public class ThreadSecenrio2 {
    public static void main(String[] A) {
        System.out.println("Main thread is running..");

      Demo dobj=new Demo(); // is dervived and Thread is base 
      Thread tobj=new Thread(dobj);
      tobj.start();

     
    }
        
}
//ThreadSecenrio1X

