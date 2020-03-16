/* Whenevr garbage collector is destroying useless objects just before destroying the objects the
garbage collector is calling finalize() method on that object to perform final operation of particular
object. */
 class Gc{
      public void finalize(){
               System.out.println(this +" Object Destroyed");
      } 
      public static void main(String argv[]){
               Gc T1 = new Gc();
               Gc T2 = new Gc();
               System.out.println(T1);
               System.out.println(T2);
               T1 = null;
               T2 = null;
               //for(int i=0; i<200; i++){
               System.gc();
               //new Gc();
               //}
      }
 }