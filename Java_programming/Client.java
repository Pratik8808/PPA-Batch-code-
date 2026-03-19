// java -cp . Client.java  ( same diretory .  sangtoy ki yeti serach kar current directory madhe)
//User Defined Package;
import PPA.Marvellous;
import PPA.InfoSystem;
import PPA.LB.Pune;

class Client{
    public static void main(String A[]){

     Marvellous mobj=new Marvellous();
     InfoSystem iobj=new InfoSystem();
     Pune  pobj=new Pune();
     System.out.println("Inside  main of client");
     mobj.fun();
     iobj.gun();
     pobj.sun();

    }
}