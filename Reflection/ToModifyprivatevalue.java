// change the value of final variable 


import java.lang.reflect.*;
class ToGetFieldWithName
{
      public static void main(String argv[]) throws Exception
      {
            Class cls = Temp.class;
            Temp t = new Temp();
            //t.x=13
            Field field = cls.getDeclaredField("x");
            field.setAccessible(true);
            System.out.println(field);
            System.out.println(field.get(t));
            field.set(t,40);
            System.out.println(field.get(t));
            
      }
}
class Temp
{
      private final int x = 1000;
}