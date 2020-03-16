import java.io.*;
class CreateFileSpecificLocation{
         public static void main(String argv[])throws Exception {
         File f = new File("XYZ");
         f.mkdir();
         File f1 = new File("D:\\XYZ","xyz.txt");
         f1.createNewFile();
         }
};