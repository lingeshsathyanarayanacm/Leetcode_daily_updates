class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        for(Integer i : stones){
            pq.offer(i);
        }

        while(pq.size() > 1){
            int heavy = pq.poll();
            int sec = pq.poll();
            if(heavy != sec){
                pq.offer(heavy - sec);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll(); 
        
    }
}