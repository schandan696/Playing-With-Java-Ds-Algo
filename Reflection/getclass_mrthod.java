class Simple {

}
class Test{
      void printName(Object obj){
            Class c = obj.getClass();
            System.out.println(c.getName());
      }
      public static void main(String []argv)
      {
            Simple s = new Simple();
            Test t = new Test();
            t.printName(s);
      }
}