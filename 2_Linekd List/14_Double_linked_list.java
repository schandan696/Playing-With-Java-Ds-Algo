class Dll{
      Node head;
      class Node{
            Node next;
            Node prev;
            int data;
            Node(int data){
                  this.data = data;
            }
      };
      void push(int new_data){
            Node newNode = new Node(new_data);
            newNode.next = head;
            newNode.prev = null;
            if(head != null)
                  head.prev = newNode;
                  
            head = newNode;
      }
      public void printlist(Node node)
      {
           Node last = null;
           System.out.println("Traversal in forward Direction");
           while(node != null)
           {
              System.out.print(node.data + " ");
              last = node;
              node = node.next;
           }
           System.out.println();
           System.out.println("Traversal in reverse direction");
            while (last != null)
            {
                System.out.print(last.data + " ");
                last = last.prev;
            }
       }
      public static void main(String argv[])
      {
               Dll obj = new Dll();
               obj.push(10);
               obj.push(20);
               obj.push(30);
               obj.push(40);
               obj.push(50);
               obj.push(60);
               obj.push(70);
               obj.printlist(obj.head);
      }
}