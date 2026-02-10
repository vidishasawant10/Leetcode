package CompaniesQues;

import java.util.LinkedList;
import java.util.Queue;

public class NearestDashMart {
   
    public int nearestDashMart(char[][] grid, int[] start) {
        if(grid == null || grid.length == 0)  return -1;
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q= new LinkedList<>();

        q.offer(start);
        visited[start[0]][start[1]] = true;

        int[][] dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int steps = 0;

        while(!q.isEmpty()){
           int size = q.size();

           for(int i= 0; i < size; i++){
            int[] curr = q.poll();

            if(grid[curr[0]][curr[1]] == 'D'){
                System.out.println("Nearest DashMart found at distance: " + steps);
                return steps;
            }
            for(int[]dir: dirs){
                int nr = curr[0]+dir[0];
                int nc = curr[1]+dir[1];

                if(nr<0 || nc<0 || nr>=m|| nc>= n ) continue;
                if(visited[nr][nc] || grid[nr][nc] == 'X') continue;
                visited[nr][nc] = true;
                q.offer(new int[]{nr,nc});
            }
           }
           steps++;
        }
        System.out.println("No DashMart found");
        return -1;
    }

    public static void main(String args[]){
        NearestDashMart ndm = new NearestDashMart();
        char[][] grid = {
            {'O', 'O', 'O', 'X', 'D'},
            {'X', 'X', 'O', 'X', 'O'},
            {'O', 'O', 'O', 'O', 'O'},
            {'D', 'X', 'X', 'X', 'O'},
            {'O', 'O', 'D', 'O', 'O'}
        };
        int[] start = {2, 2};
        ndm.nearestDashMart(grid, start);
    }
    
}
