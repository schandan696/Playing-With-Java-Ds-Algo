import java.awt.*;
public class Button_Example
{
      public static void main(String []argv){
       Frame f = new Frame("Button Example");
       Button b = new Button("Click Her");
       b.setBounds(50,100,80,30);
       f.add(b);
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);
      }
};