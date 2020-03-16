/*whenver we reassign the reference variable the objects are automatically elgible for
garbage collector. */

class Test
{
public static void main(String[] args)
{
Test t1=new Test();
Test t2=new Test();
System.out.println(t1);
System.out.println(t2);
t1=t2;
System.out.println(t1);
System.out.println(t2);
}
};