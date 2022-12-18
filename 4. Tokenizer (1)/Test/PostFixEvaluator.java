import java.io.*;
import java.lang.Exception;

class PostFixEvaluator
{
	static String getLine() {
	String buffer = "";
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	try
	{
		buffer = in.readLine();
	}
	catch (IOException ex)
	{
	}
	return buffer;
	}

	public static void main(String[] args) 
	{
		System.out.println("Type postfix expreesion: (Ex) 1 2 3 + +");

		Stack operands = new Stack();
		while(true)
		{
			String aLine;
			aLine = getLine();
			LineBuffer buffer = new LineBuffer(aLine);

			while(true)
			{
				int value = 0;
				int tokenID = buffer.getNextToken();
				value = buffer.getTokenValue();

				if (tokenID == LineBuffer.ID_QUIT) {
					System.exit(-1);
				} else if ( tokenID == LineBuffer.ID_PLUS ) {
					int a = operands.pop();
					int b = operands.pop();
					operands.push(b+a);
				} else if ( tokenID == LineBuffer.ID_MINUS ) {
					int a = operands.pop();
					int b = operands.pop();
					operands.push(b-a);
				} else if ( tokenID == LineBuffer.ID_MULTIPLY ) {
					int a = operands.pop();
					int b = operands.pop();
					operands.push(b*a);
				} else if ( tokenID == LineBuffer.ID_DIVIDE ) {
					int a = operands.pop();
					int b = operands.pop();
					operands.push(b/a);
				} else if ( tokenID == LineBuffer.ID_EOD ) {
					int data = operands.pop();

					if (operands.isEmpty()) {
						System.out.println("= " + data);
					}
					else {
						System.err.println("incorrerct expression");
					}
					operands.reset();
					break;

				} else {
					operands.push(value);
				}
			}
		}
	}
}
