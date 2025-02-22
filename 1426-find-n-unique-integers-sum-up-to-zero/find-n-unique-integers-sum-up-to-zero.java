class Solution {
    public int[] sumZero(int n) {
        int [] result=new int[n];
        if(n%2==0){
            for(int i=1;i<result.length;i+=2){
                result[i-1]=i;
                result[i]=-i;
            }
            return result;
        }
        else{
            result[0]=0;
             for(int i=1;i<result.length;i+=2){
                result[i]=i;
                result[i+1]=-i;
             }return result;
        }

    }
}