/*in java class if we are declaring multiple catch blocks at that situation the catch block order should
be child to parent shouldn’t be parent to the child*/
import java.util.*;
class Test
{
   public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
      System.out.println("provide the division val");
      int n=s.nextInt();
      try
      {
         System.out.println(10/n);
         String str=null;
         System.out.println("u r name is :"+str);
         System.out.println("u r name length is--->"+str.length());
      }
      catch (Exception ae)
      {
         System.out.println("Exception"+ae);
      }
      catch (ArithmeticException ne)
      {
         System.out.println("Exception"+ne);
      }  
      System.out.println("rest of the code");
   }
};

//Compailation Error