import java.io.*;
import java.lang.Exception;

class PostFixEvaluator 
{
	static String getLine()
	{
		String buffer = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			buffer = in.readLine();
		} catch (IOException ex) {
			// error handling
		}
		return buffer;
	}
	public static void main(String[] args) 
	{
		System.out.println("Type postfix expression: (ex) 1 2 3 + + ");
		Stack operands = new Stack();
		while(true) {
			String aLine;

			aLine = getLine();

			LineBuffer buffer = new LineBuffer(aLine);

			while(true) {
				int value = 0;
				int tokenID = buffer.getNextToken();
				value = buffer.getTokenValue();
				try
				{
					if (tokenID == LineBuffer.ID_QUIT) { // "quit"
					System.exit(0);
					} else if (tokenID == LineBuffer.ID_PLUS) { // operator "+"
						int a = operands.pop();
						int b = operands.pop();
						operands.push(a+b);

					} else if (tokenID == LineBuffer.ID_MINUS) { // operator "-"
						int a = operands.pop();
						int b = operands.pop();
						operands.push(b-a);

					} else if (tokenID == LineBuffer.ID_MULTIPLY) { // operator "*"
						int a = operands.pop();
						int b = operands.pop();
						operands.push(a*b);

					} else if (tokenID == LineBuffer.ID_DIVIDE) { // operator "/"
						int a = operands.pop();
						int b = operands.pop();
						operands.push(b/a);

					} else if (tokenID == LineBuffer.ID_EOD) { // end of data
						int data = operands.pop();

						if (operands.isEmpty()) {
							System.out.println("= " + data);

						} else {
							System.err.println("incorrect expression");
						}
						operands.reset();
						break;

					} else { // LineBuffer.ID_OPERAND
						operands.push(value);	
					}
				}
				catch (StackException ex)
				{
					// System.out.println(ex.getClassName() + " " + ex.getFunctionName() + " " + ex.getReason());
					System.err.print("A stack exception (" + ex.getReason() + ") was thrown by ");
					System.err.print("the function (" + ex.getFunctionName() + ") of class ");
					System.err.println(ex.getClassName() + " ");
					System.err.println("The Stack will be reset. Please try again.");
					operands.reset();
					break;
				}

			}
		}
	}
}

