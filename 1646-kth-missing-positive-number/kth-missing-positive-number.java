class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> cse=new ArrayList<>();
        List<Integer> cse1=new ArrayList<>();
        for(int num:arr)
        {
            cse.add(num);
        }
        int i=1;
        while(cse1.size()<k)
        {
            if(!cse.contains(i))
            {
                cse1.add(i);
            }
            i++;
        }
        return cse1.get(k-1);
        
    }
}