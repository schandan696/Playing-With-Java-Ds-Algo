class isInterface
{
      public static void main(String argv[])throws Exception
      {
            Class clazz = int.class;
            Class ar = int[].class;
            Class c =  java.io.Serializable.class;
            
            boolean isInterface = clazz.isPrimitive();
            boolean inte = c.isInterface();
            boolean a = ar.isArray();
            
            System.out.println("is primitive " +isInterface);
            System.out.println("is Interface " +inte);
            System.out.println("is array " +a);
      }
}