import java.io.*;
import java.util.*;
import java.lang.Exception;

class StringTokenizerTest {
   public static void main(String args[])
   {  
	    char c;
	    int i;
	    double f;
	    String s;

	    System.out.println("Type achar, an integer, a floating number and a String : ");

        String buffer = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
	  		buffer = in.readLine(); 
        } catch (IOException ex) {
        }
      
	    StringTokenizer st = new StringTokenizer(buffer);
	    String tmp;

	    tmp = st.nextToken();
	    c = tmp.charAt(0);

		tmp = st.nextToken();
		i = Integer.parseInt(tmp);

	    tmp = st.nextToken();
	    f = Double.parseDouble(tmp);

		s = st.nextToken();

		System.out.println("c = " + c);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("s = " + s);
		

   }
}