class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> cse=new ArrayList<>();
        for(int num:nums[0])
        {
            cse.add(num);
        }
        for(int i=1;i<nums.length;i++)
        {
            List<Integer> temp=new ArrayList<>();
            for(int num:nums[i])
            {
                if(cse.contains(num))
                     temp.add(num);
            }
            cse=temp;
        }
        Collections.sort(cse);
        return cse;

    }
}