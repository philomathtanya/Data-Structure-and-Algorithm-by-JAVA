import java.util.LinkedList;
  
public class linkedlist_pop_operation  {
    public static void main(String[] args)
    {
        LinkedList<String> stack = new LinkedList<>();
  
        stack.push("hello");
  
        stack.push("heyy");
        String s = stack.pop();
        System.out.println(s);
  
        stack.push("GLA");
  
      
        System.out.println(stack);
    }
}
