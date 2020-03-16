abstract class Animal{
        abstract void eat();
};

class Test{
         public static void main(String ar[])
         {
               Animal a = new Animal()
               {
                        void eat()
                        {
                                 System.out.println("Eating");
                         }
               };
               a.eat();      
         }
}