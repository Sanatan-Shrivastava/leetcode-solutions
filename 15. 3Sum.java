class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // ...declare list to be returned.
        List<List<Integer>> result = new ArrayList<>();

        // ...error checking
        if (nums == null || nums.length == 0) {
            return result;
        }

        int n = nums.length;

        // ...applying 2 pointers hence need the sorted array;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // ...to avoid the duplicate values that will lead to same solution ([0,0,0,0])
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                // ...target met;
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                    k--;

                    // ...avoid duplicate values;
                    while (j < nums.length && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // ...avoid duplicate values;
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}