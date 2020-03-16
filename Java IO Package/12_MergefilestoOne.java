import java.io.*;
class MergefilestoOne{
      public static void main(String argv[])throws Exception{
               PrintWriter pw = new PrintWriter("output.txt");
               BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
               String line = br.readLine();
               while(line != null){
                        pw.println(line);
                        line = br.readLine();
               }
               br = new BufferedReader(new FileReader("xyz.txt"));
               line = br.readLine();
               while(line != null){
                        pw.println(line);
                        line = br.readLine();
               }
               pw.flush();
               br.close();
               pw.close();
      }
};