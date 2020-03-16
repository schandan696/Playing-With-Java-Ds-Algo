import java.util.*;
class LinkedListExa{
      public static void main(String args[]){
            LinkedList l = new LinkedList();
            l.add("durga");
            l.add(30);
            l.add(null);
             System.out.println(l);
            l.set(0,"Software");
             System.out.println(l);
            l.add(0,"hi Durga");
            l.removeLast();
             System.out.println(l);
            l.removeFirst();
            System.out.println(l);
      }
};