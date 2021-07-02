package Stack_Queues_others;
import java.util.Stack;
public class check_redudant_bracket {

	
	public static int countBracketReversals(String input){
		int len=input.length();
        if(len%2!=0)
            return -1;
        Stack<Character>s=new Stack<Character>();
        int i=0;
        while(i<len)
        {
         if(input.charAt(i)=='{') 
         {
             s.push(input.charAt(i));
         }
            else if(input.charAt(i)=='}')
            {
                if(s.isEmpty())
                    s.push(input.charAt(i));
                else if(!s.isEmpty() && s.peek()=='}')
                    s.push(input.charAt(i));
                else 
                    s.pop();
            }
            i++;
        }
        int count=0;
        while(!s.isEmpty())
        {
            char c1=s.pop();
            char c2=s.pop();
            if(c1==c2)
                count++;
            else
                count=count+2;
            
            
        }
return count;
	}
	
	

}
