import java.io.*;
class Bufferedwriter{
   public static void main(String arg[])throws Exception{
      FileWriter fw = new FileWriter("xyz.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(100);
      bw.newLine();
      char ch[] = {'k','i','t','e','s'};
      bw.write(ch);
      bw.newLine();
      bw.write("Durga");
      bw.newLine();
      bw.write("Softwar Solution");
      bw.flush();
      bw.close();
   }
}