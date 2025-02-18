class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> cse=new ArrayList<>();
        for(int num:asteroids)
        {
            cse.add(num);
        }
        checksign(cse);
        int[] arr=new int[cse.size()];
        for(int i=0;i<cse.size();i++ )
        {
            arr[i]=cse.get(i);
        }
        return arr;
        


    }
    public void checksign(List<Integer> cse)
    {
        if(cse.stream().allMatch(x -> x > 0) || cse.stream().allMatch(x->x<0))
        {
            return;
        }
        else
        {
            reducing(cse);
        }

    }
    public void reducing(List<Integer> cse)
    {
        int i = 0;
        while (i < cse.size() - 1) {
            if (cse.get(i) > 0 && cse.get(i + 1) < 0) {
                if (Math.abs(cse.get(i)) < Math.abs(cse.get(i + 1))) {
                    cse.remove(i);  
                } else if (Math.abs(cse.get(i)) > Math.abs(cse.get(i + 1))) {
                    cse.remove(i + 1);  
                } else {
                    cse.remove(i);  
                    cse.remove(i);  
                }
                if (i > 0) {
                    i--;  
                }
            } else {
                i++;  
            }
        }


    }

}