import java.lang.reflect.*;
import java.awt.*;
import java.io.*;
import java.lang.reflect.*;

class SampleInterface
{
      public static void printInterfaces(Object o)
      {
            Class c = o.getClass();
            Class inter[] = c.getInterfaces();
            for(int i=0; i<inter.length; i++){
                  System.out.println(inter[i].getName());
                  if(inter[i].getName().equals("java.io.Serializable"))
                     System.out.println("my class parent interface");
            }
      }
      public static void main(String argv[])
      {
            t t1 = new t();
            printInterfaces(t1);
      }
}
interface a1
{
}
interface a2{
}
interface a3{
}
class t implements a1,a2,a3,Serializable
{

}