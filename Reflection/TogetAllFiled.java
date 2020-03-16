import java.awt.*;
import java.lang.reflect.*;
class SampleFiled{
      public static void printFiled(Object o)
      {
            Class c = o.getClass();
            Field f[] = c.getFields();
            for(int i=0; i<f.length; i++)
            {
                  System.out.println(" ");
                  Class type = f[i].getType();
                  System.out.println(type.getName());
                  System.out.println(" "+f[i].getName());
            }
      }
      public static void main(String argv[])
      {
            //Temp t = new Temp();
            Color c = new Color(1,1,1);
            printFiled(c);
      }
}
class Temp 
{
public int x;
public byte a;
public String s;
}