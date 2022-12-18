import java.io.*;
import java.lang.Exception;

class TestEcho {
   public static void main(String args[])
   {
      System.out.println("Type characters and <Enter> key:");
      InputStreamReader in = new InputStreamReader(System.in);
      while(true) {
         try {
            char ch = (char)in.read();
            if (ch == '\n') break;
            System.out.print(ch);
         } catch (IOException ex) {
            // error handling
         }
      }
      System.out.println();
   }
}