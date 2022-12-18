class Stack 
{
	// inner class 클레스 안에 또 클레스는 <인널클레스>
   static class StackItem // list node class
   { 
      private int _value;
      private StackItem _next;
      StackItem(int v) 
	  {
         _value = v;
         _next = null;
      }
      int getValue() 
	  {
         return _value;
      }
	  void setValue(int v) 
	  {
		_value = v;
	  }
      StackItem getNextItem()
	  {
         return _next;
      }
      void setNextItem(StackItem item) 
	  {
         _next = item;
      }
   }
   private StackItem _top;
   void initialize() {  
      _top = null;
   }
   void emptyError() {
      System.err.println("Stack empty error occurs.");
      System.exit(-1);
   }
   Stack() {
      initialize();
   }
   void push(int i) {
      if (_top == null) 
         _top = new StackItem(i);
      else {
         StackItem item = new StackItem(i);
         item.setNextItem(_top);
         _top = item;
      }
   }
   int pop() {
      if (_top == null) emptyError();
      StackItem topItem = _top;
      _top = _top.getNextItem();
      return topItem.getValue();
   }
   int peek() {
      if (_top == null) emptyError();
      return (_top.getValue());
   }
   void reset() {
      initialize();
   }
   boolean isEmpty() {
	   if (_top == null) return true;
	   else return false;
   }
}
