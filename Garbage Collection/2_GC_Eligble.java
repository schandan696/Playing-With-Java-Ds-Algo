/* whenever we are assigning null constants to our objects then objects are elgible for
gc(garbage collector) */
class Test
{
public static void main(String[] args)
{
Test t1=new Test();
Test t2=new Test();
System.out.println(t1);
System.out.println(t2);
; ; ;
t1=null;//t1 object is elgible for Garbage collector
t2=null;//t2 object is elgible for Garbage Collector
System.out.println(t1);
System.out.println(t2);
}
}