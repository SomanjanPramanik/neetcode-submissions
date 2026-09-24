class Solution {
    public int search(int[] nums, int target) {
    
        if(nums.length <= 0 ){
            return -1;
        }
        if(nums.length == 1 && nums[0] != target){
            return -1;
        }

        int bp = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1]>nums[i]){
                bp = i;
                break;
            }
        } 

        int start = 0;
        int end = nums.length-1;
        if (target >= nums[bp] && target <= nums[nums.length - 1]) {
            start = bp;         
        } else {
            end = bp - 1;       
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
     
       return -1;
   }   
}
