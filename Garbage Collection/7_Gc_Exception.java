/* If user is calling finalize() method explicitly
at that situation exception is raised. */
class Test{
         public void finalize()
         {
                  System.out.println("ratan sir destroyed");
         }
         void hel(){
                  System.out.println("In Hell");
         }
         
         public static void main(String[] args)
         {
                  Test t1=new Test();
                  Test t2=new Test();
                  t1=t2;
                  t2.finalize();
                  //System.gc();
         }
};