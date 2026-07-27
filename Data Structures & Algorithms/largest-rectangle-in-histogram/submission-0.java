class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Integer> stack=new Stack<>();
        int maxArea=0;

        for(int i=0;i<=heights.length;i++){
            int curr= (i==heights.length) ? 0 : heights[i];

            while(!stack.isEmpty() && curr<heights[stack.peek()]){
                int height=heights[stack.pop()];
                int width=stack.isEmpty() ? i : i-stack.peek()-1;
                int area=height*width;
                maxArea=Math.max(area,maxArea);
            }

            stack.push(i);

            

        }

        return maxArea;
    }
}
