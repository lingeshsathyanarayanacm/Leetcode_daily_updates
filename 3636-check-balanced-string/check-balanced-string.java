class Solution {
    public boolean isBalanced(String num) {
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i=0; i<num.length(); i++){
            if(i%2 == 0){
                leftSum += num.charAt(i) - '0'; 
            }
            else{
                rightSum += num.charAt(i) - '0'; 
            }
        }
        return leftSum == rightSum;
    }
}