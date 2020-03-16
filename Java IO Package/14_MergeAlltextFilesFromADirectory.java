//merge all text files from an specific dir to a specific output file.
import java.io.*;
class MergeAlltextFilesFromADirectory{
      public static void main(String argv[])throws Exception{
               PrintWriter pw = new PrintWriter("output.txt");
               File f = new File("D:\\f");
               String s[] = f.list();
               for(String s1 : s){
               BufferedReader br = new BufferedReader(new FileReader(new File(f,s1)));
               String line = br.readLine();
                     while( line != null){
                             pw.println(line);
                             line = br.readLine();
                     }
                     br.close();
               }               
               pw.flush();
               pw.close();
      }
};