class Solution {
    public int findCircleNum(int[][] isConnected) {
        // corner case handled by problem constraint;
        
        // number of connected components
        int numberofConnectedComponents = 0;
        
        // creating an adjacency list to apply dfs
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < isConnected.length; i++) {
            graph.add(new ArrayList<>());
        }
        
        
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        
        // the visited array
        boolean[] visited = new boolean[isConnected.length];
        
        for (int node = 0; node < isConnected.length; node++) {
            if (!visited[node]) {
                // increase connected component by 1
                // .. start of new cc;
                numberofConnectedComponents++;
                
                // call dfs() or bfs();
                dfs(graph, node, visited);
            }
        }
        
        // .. return the number of connected components;
        return numberofConnectedComponents;
    }
    
    public void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        // explore the neighbor of 'node'
        for (int neighbor : graph.get(node)) {
            // if not visited; visit them and explore them too
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
        
        return;
    }
}
