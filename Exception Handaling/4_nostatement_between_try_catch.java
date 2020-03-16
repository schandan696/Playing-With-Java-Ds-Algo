/* In between try and catch independent statements are not allowed. If we are providing
independent statements the compiler will raise compilation error. */

class Test
{
      public static void main(String[] args)
      {
            System.out.println("program starts");
            try
            {
                  int a=10/0;
            }
            System.out.println(“in between try and catch”);
            catch(ArithmeticException e)
            {
                  int a=10/5;
                  System.out.println(a);
            }
            System.out.println("rest of the code is avilable");
      }
}