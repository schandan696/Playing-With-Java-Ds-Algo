import java.lang.reflect.*;
import java.awt.*;
class SampleName
{
      public static void main(String argv[])
      {
            Class c = o.getClass();
            System.out.println(s.get Name());
      }
      public static void printName(String s)
      {
            try
            {
                  Class c = Class.forName(s);
                  System.out.println(c.getName());
                  StringBuffer sb = (StringBuffer)c.newInstance();
                  System.out.println(sb.capacity());
                  System.out.println(sb.length());
            }catch(Exception e){System.out.println(e);}
      }
      public static void printName(String s)
      {
            try
            {
                  Class c = Class.forName(s);
                  System.out.println(c.getName());
                  Temp sb = (Temp)c.newInstance();
                  sb.show();
            }
            catch(Exception e){System.out.println(e);}
      }
      public static void main(String agtf[])
      {
            Button b = new Button("hi");
            printName(b);
            printName("java.lang.StringBuffer");
           // printName("java.awt.Frame");
            printName("Temp");
            Class c = java.lang.Thread.class;
            System.out.println(c.getName());
      }
}