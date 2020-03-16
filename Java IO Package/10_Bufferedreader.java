import java.io.*;
class Bufferedreader{
   public static void main(String argv[])throws Exception{
      FileReader fr = new FileReader("xyz.txt");
      BufferedReader br = new BufferedReader(fr);
      String line = br.readLine();
      while(line != null){
         System.out.println(line);
         line = br.readLine();
      }
      br.close();
   }
};