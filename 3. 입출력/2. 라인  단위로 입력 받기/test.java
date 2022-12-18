import java.io.*;
import java.lang.Exception;

class test
{
	public static void main(String[] args) 
	{
		String buffer;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			try
			{
				buffer = in.readLine();
				if(buffer.length() == 0 ) break;
				System.out.println(buffer);
			}
			catch (IOException ex)
			{
			}
		}
	}
}
