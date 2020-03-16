class Queue{
      Node front,rear;
      class Node{
            int data;
            Node next;
            public Node(int d){
            next = null;
            data = d;
            }
      };
      void enqueue(int key){
            Node newNode = new Node(key);
            if(this.rear == null){
                  this.front = this.rear = newNode;
                  return;
            }
            this.rear.next = newNode;
            this.rear = newNode;
      }
      Node dequeue(){
            if(this.front == null)
                  return null;
            Node temp = this.front;
            this.front = this.front.next;
            
            if (this.front == null)
                  this.rear = null;
            return temp;      
      }
      public static void main(String[] args) 
      {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
   
        System.out.println("Dequeued item is "+ q.dequeue().data);
    }
};