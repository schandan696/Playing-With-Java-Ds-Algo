import java.lang.reflect.*;
import java.awt.*;
class SampleSuper
{
      public static void printSuperClass(Object o){
            Class subClass = o.getClass();
            Class superClass = subClass.getSuperclass();
            while(superClass != null){
                  System.out.println(superClass.getName());
                  subClass = superClass;
                  superClass = subClass.getSuperclass();
                  
            }
      }
      public static void main(String argv[]){
            Frame f = new Frame("ss");
            printSuperClass(f);
      }
}
