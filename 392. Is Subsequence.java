// https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0) {
            return true;
        }

        // init two pointers:
        int i = 0;
        int j = 0;

        // iterating in the longer string;
        while (j < t.length()) {

            // if character is matching
            if (t.charAt(j) == s.charAt(i)) {

                // if 'i' reaches the end of the first string, return true;
                if (i == s.length() - 1) {
                    return true;
                }

                // move i if not at the end;
                i++;
            }

            // iterate 'j' if 'i' did not reach the end
            j++;
        }

        // otherwise return false;
        return false;
    }
}