class Outer
{
      int a=100;
      class Inner
      {
            int a=200;
            void m1(int a)
            {
                  System.out.println(a);
                  System.out.println(this.a);
                  System.out.println(Outer.this.a);
            }
      };
};
class Test
{
      public static void main(String[] args)
      {
            Outer o=new Outer();
            Outer.Inner i=o.new Inner();
            i.m1(300);
      }
};