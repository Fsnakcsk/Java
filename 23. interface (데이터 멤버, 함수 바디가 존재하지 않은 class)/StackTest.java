public class StackTest {
   public static void main(String[] args) {
      Stack aStack = new Stack();
      aStack.push(new IntItem(10));
      aStack.push(new StringItem("kim"));
      aStack.push(new ComplexNumberItem(1.5,5.9));
      aStack.push(new ComplexNumberItem(2.4,7.1));
      aStack.push(new StringItem("lee"));
      aStack.push(new IntItem(9));
      System.out.println("Item removed : "+aStack.pop());
      System.out.println("Item removed : "+aStack.pop());
      System.out.println("Item removed : "+aStack.pop());
      aStack.printAll();
   }
}