class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();        
        
        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue= new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer, Integer> iter: map.entrySet()){
            queue.add(iter);

            if(queue.size()>k){
                queue.poll();
            }
        }

        int[] result= new int[k];
        int index=0;
        
        while(!queue.isEmpty()){
            result[index++]=queue.poll().getKey();
        }

        return result;

    }
}
