class Solution {
    public int minimumOperations(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // if only one element, and it is 0, then return 1;
        if (nums.length == 1) {
            return nums[0] == 0 ? 0 : 1;
        } 
        
        // we need a data structure that helps identify all the duplicate numbers
        Set<Integer> set = new HashSet<>();
        
        for (int n : nums) {
            
            // if num == 0, then we don't need to count its effort
            if (n == 0) {
                continue;
            } else {
                set.add(n);
            }
        }
        
        // the size of set is the number of elements we will need to subtract down to zero
        return set.size();
    }
}


