class Solution {
    public int maxArea(int[] heights) {
        if(heights.length <= 1){
            return 0;
        }
        int left = 0;
        int right = heights.length -1;
        int maxWater = 0;
        while(left<right){
            int waterHeight = Math.min(heights[left] ,  heights[right]);
            int currWater = waterHeight*(right-left);
            maxWater = Math.max(currWater , maxWater);
            if(heights[left] == waterHeight){
                left++;
            }
            else{
                right--;
            }
        }

        return maxWater;
    }
}
