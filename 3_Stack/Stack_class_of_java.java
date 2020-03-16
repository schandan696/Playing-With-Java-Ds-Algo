import java.util.*;
class Stack_class{
      public static void main(String argv[]){
            Stack s = new Stack();
            int i=0;
            while(++i< 10){
                  s.push(i);
            }
            System.out.println(s.search(15));
            System.out.println(s.pop());
            System.out.println(s.peek());
            System.out.println(s.pop());
            System.out.println(s.peek());
            System.out.println(s.empty());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.empty());
      }
};