class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>stack=new Stack<>();
        int ml=0;
        stack.push(-1);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                stack.push(i);
            }
            else
            {
                   stack.pop();
                    if(stack.isEmpty())
                    {
                        stack.push(i);
                    }
                
                else
                {
                     ml=Math.max(ml,i-stack.peek());
                }
            }
        }
        return ml;
    }
}