import java.util.*;
class EnumerationExa{
      public static void main(String args[]){
            Vector v = new Vector();
            for(int i=1; i<11; i++){
                  v.add(i);
            } 
            System.out.println(v);
            Enumeration e = v.elements();
            while(e.hasMoreElements()){
                  Integer i = (Integer) e.nextElement();
                  if(i%2==0)
                  System.out.println(i);
            }
       
      }
};