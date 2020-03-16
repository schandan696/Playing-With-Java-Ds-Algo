class A
{
      interface message{
            void msg();
      };
}

class Test implements A.message{
     public void msg()
      {
            System.out.println("hello nested Interface");
      }
      public static void main(String... s)
      {
            A.message m= new Test();
            m.msg();
      }
}