class Solution {
    public int fib(int n) {

        // fibonacci number via recursion
        // return fibRecursion(n);

        // fibonnaci number via Top-Down approach
        // return fibTopDown(n);

        // fibonnaci number via Bottom-up approach

        int[] memo = new int[n + 1];

        for (int i = 0; i < memo.length; i++) {
            if (i < 2) {
                memo[i] = i;
            } else {
                memo[i] = memo[i - 1] + memo[i - 2];
            }
        }

        return memo[n];
    }

    public int fibRecursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    public int fibTopDown(int n) {
        // fibonacci number via top down

        if (n < 2) { // corner case
            return n;
        }

        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n];
    }
}