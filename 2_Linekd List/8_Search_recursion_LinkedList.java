class LLInsertion{
      Node head;
      static class Node{
            int data;
            Node next;
            Node(int d){
                  data = d;
                  next = null; 
            }
      }
      
      
      void add(int data){
            Node newnode = new Node(data);
            newnode.next =head;
            head = newnode;  
      }
      
      
      boolean search(Node head ,int d){
           if(head==null)
               return false;
               
           if(head.data==d)
               return true;
             
           return search(head.next,d);  
     }
      
      public static void main(String argv[]){
            LLInsertion list = new LLInsertion();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            System.out.println(list.search(list.head,60));
            
            }
}