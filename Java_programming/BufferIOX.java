import java.io.*;

class BufferIOX
{ public static void main(String A[])throws IOException
{
  BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter your Name :");
  String name=bobj.readLine(); // checked Excpetion

  System.out.println("Hello  " +name);
}

}