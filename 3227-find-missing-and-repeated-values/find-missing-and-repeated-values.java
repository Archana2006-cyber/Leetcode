class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;  
        boolean[] seen = new boolean[N + 1];
        int repeat = -1, missing = -1;
        for(int[] row : grid){
            for(int num : row){
                if(seen[num]) repeat = num;
                seen[num] = true;
            }
        } 
        for(int i = 1; i <= N; i++){
            if(!seen[i]) missing = i;
        }     
        return new int[]{repeat, missing};
    }
}