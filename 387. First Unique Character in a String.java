class Solution {
    public int firstUniqChar(String s) {
        // corner case
        if (s == null || s.length() == 0) {
            return -1;
        }
        
        // count array (26 because it's only lowercase):
        int[] counts = new int[26];
        
        // populate the frequency map
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        
        System.out.println(Arrays.toString(counts));
        
        // finding the index in the frequency map
        for (int i = 0; i < s.length(); i++) {
            // s.charAt(i) - 'a' = index of the character in the frequency map;
            if (counts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        // if it doesn't exist, return -1
        return -1;
    }
}
