interface Test
   {
      void m1();
   };
class Outer{
            void m2()
            {
                  System.out.println("m2 method");
            }
            
            Test t = new Test()
            {
                        public void m1(){
                        System.out.println("in anonymous class");
                  }
            };
};
class Demo{
      public static void main(String ar[]){
      Outer o = new Outer();
      o.m2();
      o.t.m1();
      }
};