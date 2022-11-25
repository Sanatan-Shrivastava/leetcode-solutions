class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // error checking
        if (image == null || image.length == 0) {
            return image;
        }
        
        // ...the old color
        int oldColor = image[sr][sc];
        
        // ...the new color
        int newColor = color;
        
        // like anyother bfs, always have visited array OR just use newColor as visiting reference;
        
        // explore the neighbors; if oldColored -> then paint them;
        // no loop on full matrix required; just start from the starting point
        
        dfs(image, sr, sc, oldColor, newColor);
        
        // return the painted matrix;
        return image;
    }
    
    public void dfs(int[][] image, int i, int j, int oldColor, int newColor) {
        // check for bounds; if it's not a oldcolor; if it's already newColor -> return;
        if (i < 0 || j < 0 || i >= image.length || j >= image[i].length || image[i][j] != oldColor || image[i][j] == newColor) {
            return;
        }
        
        // paint the newColor; This in itself is marking it as visited;
        image[i][j] = newColor;
        
        dfs(image, i + 1, j, oldColor, newColor);
        dfs(image, i - 1, j, oldColor, newColor);
        dfs(image, i, j + 1, oldColor, newColor);
        dfs(image, i, j - 1, oldColor, newColor);
        return;
    }
}
