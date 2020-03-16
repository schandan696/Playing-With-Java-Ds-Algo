class Outer {
      private int a =10;
      void m1(){
              class Inner{
                     void InnerMet(){
                           System.out.println("inner class method");
                           System.out.println(a);
                     }
              }; 
              Inner i1 = new Inner();
              i1.InnerMet();
      }
};
class Test{
      public static void main(String argv[]){
            Outer o = new Outer();
            o.m1();
      } 
}