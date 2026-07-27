class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr= new int[nums.length-k+1];
        Deque<Integer> dq= new LinkedList<>();
        int index=0;

        for(int i=0;i<nums.length;i++){
            
            while(!dq.isEmpty() && dq.peekFirst()==i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i>=k-1){
                arr[index++]=nums[dq.peekFirst()];
            }


        }
        return arr;
    }
}
