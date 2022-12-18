class StackException extends Exception
{
	private String _className;
	private String _functionName;
	private String _reason;
	StackException(String cName,String fName,String reason) {
		_className = cName;
		_functionName = fName;
		_reason = reason;
	}
	String getClassName() {
		return _className;
	}
	String getFunctionName() {
		return _functionName;
	}
	String getReason() {
		return _reason;
	}
}
