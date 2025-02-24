class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(startFuel>=target) return 0;
        Queue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0,n=stations.length,stops=0,maxl=startFuel;
        while(maxl<target)
        {
            while(i<n&&maxl>=stations[i][0])
            {
                pq.offer(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()) return -1;
            maxl+=pq.peek();
            pq.poll();
            stops++;
        }
        return stops;
    }
}