import java.util.*;
class ListIteratorExa{
      public static void main(String args[]){
            LinkedList l = new LinkedList();
            l.add("balakrishna");
            l.add("venki");
            l.add("chiru");
            l.add("hasNextbj");
            System.out.println(l);
            ListIterator li = l.listIterator();
            while(li.hasNext()){
                  String s = (String)li.next();
                  if(s.equals("venki"))
                     li.remove();
                  else if(s.equals("hasNextbj"))
                     li.add("chaitu");
                  else if(s.equals("chiru"))
                     li.set("charan");
            }
            System.out.println(l);
      }
};