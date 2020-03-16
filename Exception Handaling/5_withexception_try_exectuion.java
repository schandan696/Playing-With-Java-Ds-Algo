// 1 & 2 won’t be executed

class Test
      {
            public static void main(String[] args)
            {
                  System.out.println("program starts");
                  try
                  {
                           System.out.println("durgasoft");
                           int a=10/0; 
                           System.out.println("(1)  hi girls ");
                           System.out.println("(2)  how are you boys");
                  }
                  catch(ArithmeticException e)
                  {
                           int a=10/5;
                           System.out.println(a);
                  }
                  System.out.println("rest of the code ");
            }
}