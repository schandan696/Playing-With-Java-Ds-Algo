import java.io.*;
class CreateFile{
         public static void main(String argv[])throws Exception {
         File f = new File("abc.txt");
         System.out.println(f.exists());
         f.createNewFile();
         System.out.println(f.exists());
         }
};