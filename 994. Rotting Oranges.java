class Solution {
    public int orangesRotting(int[][] grid) {
        //...error checking
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        //...BFS - because it is asking for 'minimum time' starting at coordinates of rotten orange.
        
        // counter for counting number of fresh oranges;
        int numberOfFreshOranges = 0;
 
        //..Queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        // let's get the coordinates(rotten orange);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                //...put the rotten ones in the queue.
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j, 0});
                    visited[i][j] = true;
                }
                
                //...count the fresh oranges;
                if (grid[i][j] == 1) {
                    numberOfFreshOranges++;
                }
            }
        }
        
        int minimumTime = 0;
        
        // start exploring the neighbors of the rotten stored beforehand;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int time = curr[2];
            
            // This is the minimum time;
            minimumTime = time;
            
            // explore in 4 directions;
            for (int[] d : directions) {
                int newX = x + d[0];
                int newY = y + d[1];
                
                //...constraints;
                if (newX >= 0 && newY >= 0 && newX < grid.length && newY < grid[0].length && !visited[newX][newY] && grid[newX][newY] == 1) {
                    queue.add(new int[]{newX, newY, time + 1});
                    visited[newX][newY] = true;
                    numberOfFreshOranges--;
                }
            }
        }
        
        //...if there are fresh oranges, then return -1;
        if (numberOfFreshOranges != 0) {
            return -1;
        }
        
        return minimumTime;
    }
}
