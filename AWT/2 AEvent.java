import java.awt.*;  
import java.awt.event.*; 
class AEvent extends Frame implements ActionListener{
      TextField tf;
      AEvent(){
      tf = new TextField();
      tf.setBounds(60,50,170,120);
      Button b = new Button("Click_me");
      b.setBounds(100,200,80,30);
      b.addActionListener(this);
      add(b);
      add(tf);
      setSize(400,400);
      setLayout(null);
      setVisible(true);
     }
     public void actionPerformed(ActionEvent e){
     tf.setText("chapri_chutiya");
     }
     public static void main(String []argv){
         AEvent a = new AEvent();
     }
}