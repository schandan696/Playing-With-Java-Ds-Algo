import java.lang.reflect.*;
class GetAcessPrivatemethod{
      private double div(int numberA , int numberB){
            return numberA/numberB;
      }
}
class Main{
      public static void main(String []argv) throws Exception
      {
            GetAcessPrivatemethod m1 = new GetAcessPrivatemethod();
            Class clazz = m1.getClass();
            
            //method m = clazz.getMethod("div",new class[]={int.class,int.class});
            Method m = clazz.getDeclaredMethod("div",int.class,int.class);
            m.setAccessible(true);
            System.out.println("method name : "+m.getName());
            Double z = (Double)m.invoke(m1,10,5);
            System.out.println(z.doubleValue());
      }
}