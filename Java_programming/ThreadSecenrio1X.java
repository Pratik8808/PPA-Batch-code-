
class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside the run method ");
    }
    
}

public class ThreadSecenrio1X {
    public static void main(String[] A) {
        System.out.println("Main thread is running....");
      Demo dobj=new Demo();

     Thread tobj=new Thread(dobj); //Upcasting

     tobj.start();

  
        
    }
}
//MultiThreading1.java
