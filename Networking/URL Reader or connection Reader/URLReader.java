import java.net.*;
import java.io.*;


class URLReader{
      public static void main(String argv[]) throws Exception
      {
               URL google = new URL("http://google.com/");
               BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));
               String inputLine;
               while((inputLine=in.readLine())!= null){
                     System.out.println(inputLine);
               }
               in.close();
      }
}