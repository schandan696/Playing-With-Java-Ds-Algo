import java.lang.reflect.*;
import java.awt.*;
class TogetConstructor
{
      public static void printConstructor(Object o)
      {
            Class c = o.getClass();
            Constructor cs[] = c.getConstructors();
            for (Constructor d : cs)
      {
         String name = d.getName();
         System.out.print("   ");
         String modifiers = Modifier.toString(d.getModifiers());
         if (modifiers.length() > 0) System.out.print(modifiers + " ");         
         System.out.print(name + "(");

         // print parameter types
         Class[] paramTypes = d.getParameterTypes();
         for (int j = 0; j < paramTypes.length; j++)
         {
            if (j > 0) System.out.print(", ");
            System.out.print(paramTypes[j].getName());
         }
         System.out.println(");");
      }      }
      public static void main(String argv[]){
            Thread t = new Thread("ss");
            //String s = new String("hh");
            printConstructor(t);
      }
}