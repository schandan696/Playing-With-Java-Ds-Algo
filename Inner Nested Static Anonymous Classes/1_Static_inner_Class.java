class Outer{
      int x = 10;
      static int y =20;
      static class inner{
            static void show(){
                  System.out.println(y);
            }
      };
};
class Temp{
      public static void main(String []arg)
      {
          System.out.println(Outer.y);
          Outer.inner i = new Outer.inner();
          i.show();
          
       }
}