class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxArea=Integer.MIN_VALUE;

        while(left<right){
            int width=right-left;
            int minHeight=Math.min(heights[left], heights[right]);

            int area=width*minHeight;

            if(area>maxArea){
                maxArea=area;
            }

            if(heights[left]<heights[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxArea;
    }
}
