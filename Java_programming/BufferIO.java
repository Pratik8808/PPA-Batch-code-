import java.io.*;

class BufferIO
{
  BufferReader bobj=new BufferReader(new InputStreamReader(System.in));
  System.out.println("Enter your Name :");
  String name=bobj.readLine(); // checked Excpetion

  System.out.println("Hello"+name);

}