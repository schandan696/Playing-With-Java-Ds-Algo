/* The way of handling the exception is varied from exception to the exception so it is
recommended to provide try with number of catch blocks. */

import java.util.*;

class Test
{
      public static void main(String[] args)
      {
            Scanner s=new Scanner(System.in);
            System.out.println("provide the division value");
            int n=s.nextInt();
            try
            {
                  System.out.println(10/n);
                  String str=null;
                  System.out.println("u r name is :"+str);
                  System.out.println("u r name length is--->"+str.length());
            }
            catch (ArithmeticException ae){
                  System.out.println("good boy zero not allowed geting Exception"+ae);
            }
            catch (NullPointerException ne)
            {
                  System.out.println("good girl getting Exception"+ne);
            }
            System.out.println("rest of the code");
      }
}