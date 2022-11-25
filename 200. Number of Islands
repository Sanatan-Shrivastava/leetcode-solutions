class Solution {
    public int numIslands(char[][] grid) {
        // corner case or error checking handled by the problem statement;
        
        // .. if we hit a 1; we explore it and mark all other as visited
        // return number of 1 hits;
        
        // return the number of islands;
        int numberOfIslands = 0;
        
        // visited array to mark visited points;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for (int i = 0; i < grid.length; i++ ){
            for (int j = 0; j < grid[i].length; j++) {
                // if there is an island;
                if (grid[i][j] == '1' && !visited[i][j]) {
                    
                    // increase it by one;
                    numberOfIslands += dfs(grid, i, j, visited);
                    
                    
                }
            }
        }
        
        // once dfs is run all over grid, we shall have numberOfIslands;
        
        return numberOfIslands;
    }
    
    public int dfs(char[][] grid, int i, int j, boolean[][] visited) {
        // check boundary conditions;
        // if out of bounds OR if already visited OR if it is not an island-> return;
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || visited[i][j] || grid[i][j] == '0') {
            return 0;
        }
        
        // else lets mark it visited;
        visited[i][j] = true;
        
        // run dfs on four directional neighbors;
        dfs(grid, i + 1, j, visited);
        dfs(grid, i - 1, j, visited);
        dfs(grid, i, j + 1, visited);
        dfs(grid, i, j - 1, visited);
        
        return 1;
    }
}
