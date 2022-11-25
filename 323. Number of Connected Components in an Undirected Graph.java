class Solution {
    public int countComponents(int n, int[][] edges) {
        // corner case handled by problem constraint;
        
        // number of connected components
        int numberofConnectedComponents = 0;
        
        // creating an adjacency list to apply dfs
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        // the visited array
        boolean[] visited = new boolean[n];
        
        for (int node = 0; node < n; node++) {
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
