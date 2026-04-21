
class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside the run method ");
    }
    
}

public class ThreadSecenrio1 {
    public static void main(String[] A) {
        System.out.println("Main thread is running");
      Demo dobj=new Demo();

      dobj.start();
  
        
    }
}

//ThreadSecenrio2