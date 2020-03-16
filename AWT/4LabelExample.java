import java.awt.*;
import java.awt.event.*;

class LabelEx extends Frame implements ActionListener{
      TextField tf;
      Label l;
      Button b;
      LabelEx(){
      tf = new TextField();
      tf.setBounds(50,50,150,20);
      l = new Label();
      l.setBounds(50,100,250,20);
      b = new Button("Find_ip");
      b.setBounds(50,150,60,30);
      b.addActionListener(this);
      add(b);
      add(tf);
      add(l);
      setSize(400,400);
      setLayout(null);
      setVisible(true);
      }
      public void actionPerformed(ActionEvent e){
         try{
               String h = tf.getText();
               String ip = java.net.InetAddress.getByName(h).getHostAddress();
               l.setText(" ip of "+ h + " is : " +ip);
         }
         catch(Exception ex){System.out.println(ex);}
      }
      public static void main(String []argv){
           new LabelEx();
            
      }
}