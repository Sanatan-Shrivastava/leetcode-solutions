class Solution {
    public String frequencySort(String s) {
        // ...error checking
        if (s == null || s.length() < 2) {
            return s;
        }

        // ...map to store frequency;
        Map<Character, Integer> map = new TreeMap<>();

        // ...storing frequency;
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // ...heap -> Max Heap
        PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());
        heap.addAll(map.values());

        // ...StringBuilder because keeping a String and adding characters everytime
        // would be costly;
        StringBuilder sb = new StringBuilder();

        // ...Very costly;
        // String t = "";

        // using heap to extract elements with max count;
        while (!heap.isEmpty()) {
            int f = heap.poll();
            for (char c : map.keySet()) {
                if (map.get(c) == f) {
                    // ...adding them 'f' times in the string;
                    for (int i = 0; i < f; i++) {
                        sb.append(c);
                        // ...this particluar operation takes runtime from 17ms -> 2693 ms
                        // t += c;
                    }

                    // ...marking used element as visited;
                    map.put(c, -1);
                }
            }
        }

        // ...return the string;
        return sb.toString();
    }
}