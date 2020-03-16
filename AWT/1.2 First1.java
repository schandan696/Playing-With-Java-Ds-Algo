import java.awt.*;

   class First1{
         First1(){
         Frame f = new Frame();
         Button b = new Button("Click_me");
         b.setBounds(30,100,80,30);
         f.add(b);
         f.setSize(300,300);
         f.setLayout(null);
         f.setVisible(true);                 
        }
        public static void main(String []argv){
        First f = new First();
        }
   }