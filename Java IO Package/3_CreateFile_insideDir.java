import java.io.*;
class CreateFileinsideDir{
         public static void main(String argv[])throws Exception {
         File f = new File("XYZ");
         f.mkdir();
         //File f1 = new File("XYZ","xyz.txt");
         File f1 = new File(f,"xyz.txt");
         f1.createNewFile();
         }
};