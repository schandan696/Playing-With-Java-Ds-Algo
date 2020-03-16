/* Instanceof operator:-
it is used check the type of the object.
Instanceof operator return Boolean value as a return value.
Syntax:- Reference-variable instanceof class-name
Ex:- Test t=new Test();
t instanceof Test
while using instanceof operator the reference variable and class Name must have some relationship
(Parent-child or child-parent) otherwise compiler will raise compilation error.
if the reference variable is child of the specified classes at that situation instanceof return true
if the reference variable is parent of the specified classes at that situation instanceof return false
*/



class Fruit{

};
class Apple extends Fruit{
         public static void main(String argv[]){
                  Apple a = new Apple();
                  Object o = new Object();
                  String str = "Hey Guys";
                  Throwable t = new Throwable();
                  
                  System.out.println(a instanceof Fruit);
                  System.out.println(a instanceof Object);
                  System.out.println(str instanceof Object);
                  System.out.println(o instanceof Throwable);
                  System.out.println(t instanceof Throwable);
                  //System.out.println(a instanceof Fruit);
         }
};