interface StackItem 
{
   public StackItem getNextItem();
   public void setNextItem(StackItem item);
}

class Stack 
{
   StackItem top;
   Stack() {
      top = null;
   }
   void push(StackItem item) {
      if (top == null) top = item;
      else {
         item.setNextItem(top);
         top = item;
      }
   }
   StackItem pop() {
      if (top == null) {
         System.out.println("stack is empty");   
         java.lang.System.exit(-1);
      }
      StackItem topItem = top;
      top = top.getNextItem();
      return topItem;
   }
   void printAll() {
      System.out.print("This stack has : ");
      StackItem item = top;
      while (item != null) {
	 System.out.print(item+" ");
         item = item.getNextItem();
      }
      System.out.println();
   }
}

class DefaultStackItem implements StackItem {
   StackItem next;
   public StackItem getNextItem() {
      return next;
   }
   public void setNextItem(StackItem item) {
      next = item;
   }
}

class IntItem extends DefaultStackItem {
   int i;
   public IntItem(int i) {
      this.i = i; next = null;  
   }
   public String toString() {
      return i+"";
   }
}

class StringItem extends DefaultStackItem {
   String s;
   public StringItem(String s) {
      this.s = s; next = null;
   }
   public String toString() {
      return s;
   }
}

class ComplexNumberItem extends DefaultStackItem {
   double real;
   double imaginary;
   public ComplexNumberItem(double r,double i) {
      real = r; imaginary = i; next = null;
   }
   public String toString() {
      return real+"+"+imaginary+"i";
   }
}