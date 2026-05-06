import java.io.*;
import java.net.*;

public class ChatServer {

    public static void main(String A[])throws Exception
    {
        System.out.println("Server Application is running ");

          ServerSocket ssobj=new ServerSocket(2100);

        System.out.println("Server is waiting at port 2100");

        Socket sobj=ssobj.accept();


        System.out.println("Client Request Gets Accepted Sucessfully");

          PrintStream pobj=new PrintStream(sobj.getOutputStream());// From server  input reader
        
        BufferedReader bobj1=new BufferedReader(new InputStreamReader(sobj.getInputStream()));// input from  client

        BufferedReader bobj2=new BufferedReader(new InputStreamReader(System.in));// keyboard 


         System.out.println("-------------------------------------------------");
         System.out.println("-------- --Marvellous Chat Server  ---------------");
        System.out.println("-------------------------------------------------");

        String str1,str2=null;

        while((str1=bobj1.readLine())!=null)
        {
            System.out.println("Cleint say :"+ str1);
            System.out.println("Enter the message for client : ");

            str2=bobj2.readLine();

            pobj.println(str2);

        }
        sobj.close();
        ssobj.close();
    }
    
}
