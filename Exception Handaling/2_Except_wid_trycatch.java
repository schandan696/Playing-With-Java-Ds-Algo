/*Exception raised in try block the JVM will search for corresponding catch block if the catch block
is matched, corresponding catch block will be executed and rest of the code is executed normally*/

class Except_wid_trycatch
{
            public static void main(String[] args)
            {
                  System.out.println("durga");
                  System.out.println("software");
                  try
                  {
                        System.out.println(10/0);
                  }
                  catch (ArithmeticException e)
                  {
                        System.out.println("you are getting AE "+e);
                  }  
                  System.out.println("solutions");
            }
}