package Stack_Queues_others;
import java.util.Stack;
public class reverse_stack {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		while(input.size()!=0)
        {
            extra.push(input.peek());
            input.pop();
        }
        while(extra.size()!=0)
        {
          System.out.print(extra.peek()+" ");
 
            extra.pop();
        }
	}
}