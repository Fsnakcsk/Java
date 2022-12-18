import java.io.*;
import java.lang.Exception;

class TestEcho {
   public static void main(String args[])
   {
      String buffer;
      System.out.println("Type characters in a line and <Enter> key:");
      System.out.println("An empty line stops this program:");
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      while(true) {
         try {
            buffer = in.readLine();
            if (buffer.length() == 0) break;
            System.out.println(buffer);
         } catch (IOException ex) {
            // error handling
         }
      }
      System.out.println("Bye !");
   }
}