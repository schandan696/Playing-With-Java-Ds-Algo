class Outer{
      int x = 10;
      static int y =20;
      class Inner{
      int x =30;
           void show(){
               
                  System.out.println(y);
                  System.out.println(x); //access local value
            }
      };
};
class Temp {
      public static void main(String []arg)
      {
                    Outer o = new Outer();
                    Outer.Inner i = o.new Inner();
                    i.show();
                    
                           }
}