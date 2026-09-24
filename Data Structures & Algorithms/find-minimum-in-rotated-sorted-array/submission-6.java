class Solution {
    public int findMin(int[] nums) {
        if(nums.length <= 0 ){
            return Integer.MIN_VALUE;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length <= 2){
            return Math.min(nums[0],nums[1]);
        }
      for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return nums[i]; 
            }
        }
        
        return nums[0];

        // int start = 0;
        // int end = nums.length -1;
        // while(start < end){
        //     if(nums[start]<nums[end]) return nums[start];
        //     int mid = start + (end - start)/2;

        //     if(nums[mid]>nums[end]){
        //         start = mid+1;
        //     }else{
        //         end = mid;
        //     }
        // }

        // return nums[start];

    }

}
