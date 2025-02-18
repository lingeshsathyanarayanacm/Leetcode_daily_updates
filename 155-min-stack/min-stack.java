import java.util.HashMap;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private HashMap<Integer, Integer> minMap;     
    public MinStack() {
        stack = new Stack<>();
        minMap = new HashMap<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (stack.size() == 1) {
            minMap.put(stack.size(), val);  
        }
        else {
            int currentMin = Math.min(val, minMap.get(stack.size() - 1));  
            minMap.put(stack.size(), currentMin);
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minMap.remove(stack.size() + 1);  
        }
    }
    
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1; 
    }
    
    public int getMin() {
        if (!stack.isEmpty()) {
            return minMap.get(stack.size());
        }
        return -1;  
    }


}
