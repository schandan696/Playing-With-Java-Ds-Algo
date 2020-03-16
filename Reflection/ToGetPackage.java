import java.lang.reflect.*;
import java.awt.*;
class ToGetPackage
{
      public static void printPackage(Object o){
            Class c = o.getClass();
            Package pk = c.getPackage();
            System.out.println(pk.getName());
                 }
      public static void main(String argv[]){
            String m = new String("");
           // ToGetPackage m=new ToGetPackage();
            printPackage(m);
      }
}