import java.util.*;
class ArraylistExa{
      public static void main(String args[]){
            ArrayList l = new ArrayList();
            l.add("hello");
            l.add(10);
            l.add("hii");
           // l.add('hello');  error
            l.add(null);
            System.out.println(l);
            l.remove(2);
            System.out.println(l);
            l.add(2,"hi");
            l.add("n");
            System.out.println(l);
      }
};