class Outer{
      int x = 10;
      static int y =20;
      static class Inner extends Outer{
            static void show(){
                  System.out.println(y);
                //  System.out.println(x);
            }
      };
};
class Temp {
      public static void main(String []arg)
      {
                    //Outer.Inner.show();
                    Outer o = new Outer();
                    Outer.Inner.show();
                    
                           }
}