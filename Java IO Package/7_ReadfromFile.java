import java.io.*;
class Fileread_from_file{
   public static void main(String argv[])throws Exception 
   {
      File f = new File("abc.txt");
      FileReader fr = new FileReader(f);
      int i = fr.read();
      while(i != -1){
         System.out.print((char)i);
         i = fr.read();
      }
   }
};