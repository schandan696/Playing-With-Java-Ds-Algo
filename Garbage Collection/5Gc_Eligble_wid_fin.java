/* whenever we are creating objects inside the methods one method is completed the
objects are elgible for garbage collector. */

class Test{
      public void finalize(){
                System.out.println("Object Destroyed");
      }
      void m1(){
               Test t1 = new Test();
               Test t2 = new Test();
      }
      public static void main(String argv[]){
               Test t = new Test();
               t.m1();
               System.gc();
      }
};