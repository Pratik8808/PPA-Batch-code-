import java.io.*;
import java.net.*;

public class ChatClient {

    public static void main(String A[])throws Exception
    {
        
        
        Socket sobj=new Socket("localhost",2100);
        System.out.println("Client  Application is running.... ");

        PrintStream pobj=new PrintStream(sobj.getOutputStream());// output from server
        
        BufferedReader bobj1=new BufferedReader(new InputStreamReader(sobj.getInputStream()));//Reading by client from server chat 

        BufferedReader bobj2=new BufferedReader(new InputStreamReader(System.in));//Output to server



        System.out.println("Connection is sucessfully with server");


         System.out.println("-------------------------------------------------");
         System.out.println("-------- --Marvellous Chat Client  ---------------");
        System.out.println("-------------------------------------------------");


 String str1,str2=null;

 System.out.println("Enter Message for  Server :");

 while(!(str1=bobj2.readLine()).equals("end"))
 {
    pobj.println(str1);
    str2=bobj1.readLine();
    System.out.println("Server  say :"+str2);

   
    System.out.println("Connection is sucessfully with server");

 }
       
       sobj.close();
    }
    
}
