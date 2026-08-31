class Solution {
    public void dfs(int node , int[][] isConnected, boolean[] visited){

        visited[node] = true;
        for(int i = 0;i<isConnected.length;i++){
            if(!visited[i] && isConnected[node][i]==1){
                dfs(i,isConnected,visited);
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        int prov = 0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        for(int i =0 ;i<n;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                prov++;
            }
        }
        return prov;
    }
}