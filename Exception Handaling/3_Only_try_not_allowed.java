// independent try blocks are not allowed in java language.(compilation error) if there is try there will be catch 

class Test
{
      public static void main(String[] args)
      {
            System.out.println("program starts");
            try
            {
            int a=10/0;
            }
            System.out.println("rest of the code is avilable");
      }
};