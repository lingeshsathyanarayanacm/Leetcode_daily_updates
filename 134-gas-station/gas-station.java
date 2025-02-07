class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int currentgas=0;
        int netgas=0;
        int idx=0;
        for(int i=0;i<gas.length;i++)
        {
            netgas=gas[i]-cost[i];
            totalgas+=netgas;
            currentgas+=netgas;
            if(currentgas<0)
            {
                idx=i+1;
                currentgas=0;
            }
        }
        return (totalgas>=0)?idx:-1;
    }
}