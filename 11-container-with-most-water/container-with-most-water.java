class Solution {
    public int maxArea(int[] height) {
        int b,l;
        int max=-999;
        int a;
        int i=0;
        int j=height.length-1;
         while(i<j)
         {
                b=Math.min(height[i],height[j]);
                l=j-i;
                a=l*b;
                if(a>max)
                {
                    max=a;
                }
                if(b==height[i])
                {
                    i++;
                }
                else{
                    j--;
                }
         }
         return max;
    }
}