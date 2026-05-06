
import javax.swing.*;

class GUIButton
{
    public static void main (String A[])
    {
        JFrame fobj=new JFrame("Marvellous PPA");
        JButton bobj=new JButton("Okay");
        bobj.setBounds(100,100,150,50); // x and y then width and height
        fobj.add(bobj);
        
        fobj.setSize(400,300); //First width and second height


        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
