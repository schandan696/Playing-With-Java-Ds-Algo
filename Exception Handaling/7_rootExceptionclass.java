//By using root class (Exception) we are able to hold any type of exceptions.

import java.util.*;
class Test
{
      public static void main(String[] args)
      {
            Scanner s=new Scanner(System.in);
            System.out.println("provide the division value");
            int n=s.nextInt();
            try{
                  System.out.println(10/n);
                  String str=null;
                  System.out.println("u r name is :"+str);
                  System.out.println("u r name length is--->"+str.length());
            }
            catch (Exception e)
            {
                  System.out.println("getting Exception"+e);
            }
            System.out.println("rest of the code");
      }
}