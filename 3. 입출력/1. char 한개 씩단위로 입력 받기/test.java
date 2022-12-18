import java.io.*;
import java.lang.Exception;

class test
{
	public static void main(String[] args) 
	{
		InputStreamReader a = new InputStreamReader(System.in);
		while(true) 
		{
			try
			{
				{
					char ch = (char)a.read();
					if (ch == '\n') break;
					System.out.print(ch);
				}
			}
			catch (IOException ex)
			{
			}					
			System.out.println();
		}
	}
}
