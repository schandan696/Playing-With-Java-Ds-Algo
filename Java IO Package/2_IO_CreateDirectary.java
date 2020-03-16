import java.io.*;
class CreateDirectary{
         public static void main(String argv[])throws Exception {
         File f = new File("ABC");
         System.out.println(f.exists());
         f.mkdir();
         System.out.println(f.exists());
         }
};