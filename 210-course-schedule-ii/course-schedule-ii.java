import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
         int[] indegree = new int[numCourses];
        for(int[] edge : prerequisites) {
            adj.get(edge[1]).add(edge[0]);
        } for(int i = 0; i < numCourses; i++) {
            for(int n : adj.get(i)) {
                indegree[n]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }
        int[] result = new int[numCourses];
        int index = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            result[index++] = node;
            for(int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if(indegree[neighbor]== 0) 
                {
                    q.add(neighbor);
                }
            }
        }
      if(index!=numCourses)
      {
        return new int[0];
      }
        return result;
    }
}
