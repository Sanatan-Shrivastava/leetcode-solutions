class Solution {
    public int[][] merge(int[][] intervals) {
        // ...error checking
        if (intervals.length == 1) {
            return intervals;
        }

        // ...Array sorting
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // ...result list;
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        int ptr = 0;

        // ...logic block
        for (int i = 1; i < intervals.length; i++) {
            int[] prev = list.get(ptr);
            int[] curr = intervals[i];

            if (prev[1] >= curr[0]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                list.add(curr);
                ptr++;
            }
        }

        // ...formatting the result;
        int[][] res = new int[ptr + 1][2];
        for (int i = 0; i <= ptr; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}