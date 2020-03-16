import java.util.*;
class IteratorExa{
      public static void main(String args[]){
            ArrayList a = new ArrayList();
            for(int i=0; i<10; i++){
                  a.add(i);
            } 
            System.out.println(a);
            Iterator i = a.iterator();
            while(i.hasNext()){
                  Integer I =(Integer) i.next();
                  if(I%2==0)
                        System.out.println(I);
                  else
                        i.remove();
            }         
             System.out.println(a);

      }
};