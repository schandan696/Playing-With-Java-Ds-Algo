import java.lang.reflect.*;
class temp{
   private temp(){
         System.out.println("Default Constructor");
   }
   void show(){
         System.out.println("Show");
   }
   private temp(int x){
         System.out.println(x+" via parametrise constructor");

   }
}
class PrivateConstructor{
      public static void main(String argv[]){
            try{
                    Class cl = temp.class;
                    Constructor c = cl.getDeclaredConstructor();
                    c.setAccessible(true);
                    temp t1 = (temp)c.newInstance();
                    t1.show();
                    
                    Constructor cc = cl.getDeclaredConstructor(int.class);
                    cc.setAccessible(true);
                    temp t2 = (temp)cc.newInstance(6887);
                    t2.show();
            }catch(Exception e){System.out.println(e);}
      }
}