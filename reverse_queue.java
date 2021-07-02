package Stack_Queues_others;
import java.util.LinkedList;
import java.util.Queue;

public class reverse_queue {

	public static void reverseQueue(Queue<Integer> input) {
	if(input.size()<=1)
        return;
        int front=input.remove();
        reverseQueue(input);
        input.add(front);
	}

}