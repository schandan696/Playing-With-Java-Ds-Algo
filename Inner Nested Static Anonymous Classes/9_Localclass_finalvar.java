class Outer
{
private int a=100;
void m1()
{
final int b=1000;
class Inner
{
void innerMethod()
{
System.out.println("inner class method");
System.out.println(a);
System.out.println(b);
}
};
Inner i=new Inner();
i.innerMethod();
}
};
class Test
{
public static void main(String[] args)
{
Outer o=new Outer();
o.m1();
}
};