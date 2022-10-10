// Link: https://leetcode.com/problems/3sum-closest/
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // sort the array for two pointers
        Arrays.sort(nums);

        // init the closestSum : we have to minimize this value which will be 'target -
        // sum'
        int closestSum = Integer.MAX_VALUE;

        // start the 3 pointers;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                // this is the required value : sum
                int sum = nums[i] + nums[j] + nums[k];

                // update the minimum value;
                if (Math.abs(target - sum) < Math.abs(closestSum)) {
                    closestSum = target - sum;
                }

                // generic 2 pointer algo
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        // closestSum = target - sum
        // Thus, sum = target - closestSum
        return target - closestSum;
    }
}