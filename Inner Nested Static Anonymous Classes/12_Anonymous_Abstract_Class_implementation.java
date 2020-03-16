abstract class Animal{
        abstract void eat();
};

class Test{
         Animal a = new Animal()
         {
               void eat()
               {
                     System.out.println("Eating");
               }
         };
         public static void main(String ar[])
         {
               Test t = new Test();
               t.a.eat();      
         }
}