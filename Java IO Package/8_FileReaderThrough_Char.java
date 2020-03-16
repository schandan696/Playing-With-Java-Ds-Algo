import java.io.*;
class FileReaderThrough_Char{
   public static void main(String arfg[])throws Exception{
      File f = new File("abc.txt");//ther must be a file name abc.txt in CWD
      char ch[] = new char[(int)f.length()];
      FileReader fr = new FileReader(f);
      fr.read(ch);
      for(char c : ch){
         System.out.print(c);
      }
   }
};