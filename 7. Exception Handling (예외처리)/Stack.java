class Stack 
{
	// inner class Ŭ���� �ȿ� �� Ŭ������ <�γ�Ŭ����>
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
   int pop() throws StackException {
      if (_top == null) throw new StackException("Stack","pop()","Stack empty error");

      StackItem topItem = _top;
      _top = _top.getNextItem();
      return topItem.getValue();
   }
   int peek() throws StackException {
      if (_top == null) throw new StackException("Stack","peek()","Stack empty error");
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
