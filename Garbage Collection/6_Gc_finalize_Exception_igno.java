class Test{
         public void finalize()
         {
                  System.out.println("ratan sir destroyed");
                  int a=10/0;
         }
         public static void main(String[] args)
         {
               Test t1=new Test();
               Test t2=new Test();
               t1=t2;
               System.gc();
         }
};