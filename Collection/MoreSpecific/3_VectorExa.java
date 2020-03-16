import java.util.*;
class VectorExa{
      public static void main(String args[]){
            Vector v = new Vector();
            System.out.println(v.capacity());
            for(int i=1; i<11; i++){
                  v.add(i);
            } 
            System.out.println(v.capacity());
            v.addElement("A");
            System.out.println(v.capacity());
            v.remove(2);
            System.out.println(v);
       
      }
};