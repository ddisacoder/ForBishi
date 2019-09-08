package JianzhiOffer;

import java.util.Stack;

public class TwoStack_Queue {
	 Stack<Integer> stack1 = new Stack<Integer>();
     Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        stack1.push(node);
	    }
	    
	    public int pop() {
	    
	    	if(stack2.isEmpty()&&stack1.isEmpty()){
	    		throw new RuntimeException("队列为空");
	    	}else if(stack2.isEmpty()){
	    		while(!stack1.isEmpty()){
	    			stack2.push(stack1.pop());
	    		}
	    	}
	    	return stack2.pop();
	    }
}
