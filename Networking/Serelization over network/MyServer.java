import java.net.*;
import java.io.*;
import java.net.*;

class MyServer
{
      ServerSocket ss;
      Socket s;
      
      ObjectInputStream dis;
      public MyServer()
      {
            try
            {
                  System.out.println("Server Started");
                  ss = new ServerSocket(8758);
                  s = ss.accept();
                  System.out.println("CLIENT CONNECTED"); 
                  dis = new ObjectInputStream(s.getInputStream());
                  emp z = (emp)dis.readObject();
                 z.show(); 
            }
             catch(Exception e)
             {
                  System.out.println(e);
             }
        }
             public static void main(String argv[]){
                  new MyServer();
             }
 }