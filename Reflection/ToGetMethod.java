import java.lang.reflect.*;
import java.awt.*;
class ToGetMethod
{
      public static void printMethod(Object o){
            Class c = o.getClass();
            Method m[] = c.getMethods();
            
            for(int i=0; i<m.length; i++){
                  System.out.print(m[i].getReturnType().getName());
                  System.out.print(" "+m[i].getName());
                  System.out.print("(");
                  Class type[] = m[i].getParameterTypes();
                  for(int k=0; k<type.length; k++){
                        System.out.print(type[k].getName()+",");    
                  }
                  System.out.print(")");
                  System.out.println("");
            }
      }
      public static void main(String argv[]){
           // ToGetMethod m = new ToGetMethod();
           Thread t = new Thread("d");
            printMethod(t);
      }
}