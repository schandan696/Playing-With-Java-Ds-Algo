import java.util.*;
class ll{
      public static void main(String argv[]){
            LinkedList l = new LinkedList();
            l.add("A");
            l.add("B");
            l.add("C");
            l.add("D");
            l.addLast("E");
            l.addFirst("F");
            l.add(2, "G");
            l.add("H");
            l.add("I");
            System.out.println(l);
            
            // Removing elements from the linked list
            l.remove("B");
            l.remove(3);
            l.removeFirst();
            l.removeLast();
            System.out.println("Linked list after deletion: " + l);
            
            boolean status = l.contains("E");
 
            if(status)
                System.out.println("List contains the element 'E' ");
            else
                System.out.println("List doesn't contain the element 'E'");
 
            // Number of elements in the linked list
            int size = l.size();
            System.out.println("Size of linked list = " + size);
      
            // Get and set elements from linked list
            Object element = l.get(2);
            System.out.println("Element returned by get() : " + element);
            l.set(2, "Y");
            System.out.println("Linked list after change : " + l);
      }
};