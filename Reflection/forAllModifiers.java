import java.awt.*;
import java.lang.reflect.*;
class SampleModifiers{
            public static void printModifiers(Object o)throws Exception
            {
                 // Class c = o.getClass();
                 Class c = Class.forName("java.awt.Graphics");
                 int m = c.getModifiers();
                 if(Modifier.isPublic(m))
                 System.out.println("Public");
                 if(Modifier.isFinal(m)) 
                 System.out.println("Final");
                 if(Modifier.isAbstract(m)) 
                 System.out.println("Abstract");
            }
           public static void main(String argv[])throws Exception
               {
                  String a = new String("aaaaa");
                  printModifiers(a);
               }
}