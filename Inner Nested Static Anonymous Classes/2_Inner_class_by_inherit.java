class Outer{
      int x = 10;
      static int y =20;
      static class Inner{
            static void show(){
                  System.out.println(y);
            }
      };
};
class Temp extends Outer.Inner{
      public static void main(String []arg)
      {
                    Outer.Inner.show();
                    Temp t = new Temp();
                    t.show();
       }
}