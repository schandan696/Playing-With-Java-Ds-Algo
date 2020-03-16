import java.net.*;
import java.io.*;

class URLConnectionReader{
      static String inputLine = "";
      public static void main(String argv[]) throws Exception
      {
            URL google = new URL("http://www.google.com");
            URLConnection uc = google.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            
            while(inputLine!=null)
            {
                  inputLine = in.readLine();
                  System.out.println(inputLine);
            }
            in.close();
      }
}
