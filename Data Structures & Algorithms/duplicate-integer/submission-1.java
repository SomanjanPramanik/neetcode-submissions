class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i : nums){
            seen.add(i);
        }

        if(seen.size() != nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}