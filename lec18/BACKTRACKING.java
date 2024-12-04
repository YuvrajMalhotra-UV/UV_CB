package lec18;
import java.util.*;
public class BACKTRACKING {
    


    // Directions for moving in the maze (Up, Right, Down, Left)
    static int[] rowDir = {-1, 0, 1, 0};
    static int[] colDir = {0, 1, 0, -1};
    
    // Function to check if a position is valid and not visited
    static boolean isSafe(int[][] maze, boolean[][] visited, int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length &&
                maze[x][y] == 1 && !visited[x][y]);
    }

    // Function to print the path
    static void printPath(int[][] parent, int endX, int endY) {
        List<String> path = new ArrayList<>();
        int x = endX;
        int y = endY;
        
        // Trace back the path from (endX, endY) to (0,0)
        while (parent[x][y] != -1) {
            int prevX = parent[x][y] / parent[0].length;
            int prevY = parent[x][y] % parent[0].length;
            
            if (prevX == x - 1) path.add("Down");
            else if (prevX == x + 1) path.add("Up");
            else if (prevY == y - 1) path.add("Right");
            else if (prevY == y + 1) path.add("Left");
            
            x = prevX;
            y = prevY;
        }

        Collections.reverse(path); // Reverse to print path from (0,0) to (3,3)
        System.out.println("Shortest Path: ");
        for (String move : path) {
            System.out.print(move + " ");
        }
    }

    // BFS algorithm to find the shortest path from (0, 0) to (3, 3)
    static boolean bfs(int[][] maze, int startX, int startY, int endX, int endY) {
        // Queue to store the position and path length
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        int[][] parent = new int[maze.length][maze[0].length];
        
        // Initialize the parent matrix with -1 (indicating no parent)
        for (int i = 0; i < maze.length; i++) {
            Arrays.fill(parent[i], -1);
        }

        // Enqueue starting position
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];

            // If we reached the cheese (destination)
            if (x == endX && y == endY) {
                printPath(parent, endX, endY);
                return true;
            }

            // Explore all four possible directions
            for (int i = 0; i < 4; i++) {
                int newX = x + rowDir[i], newY = y + colDir[i];
                
                // If the new position is valid and safe
                if (isSafe(maze, visited, newX, newY)) {
                    visited[newX][newY] = true;
                    parent[newX][newY] = x * maze[0].length + y; // Store the parent position
                    queue.add(new int[]{newX, newY});
                }
            }
        }
        // If there is no valid path to the cheese
        return false;
    }

    public static void main(String[] args) {
        // 4x4 Maze where 1 is a valid path and 0 is a blocked path
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        // Rat's starting position (0, 0) and cheese position (3, 3)
        int startX = 0, startY = 0, endX = 3, endY = 3;

        // Find the shortest path using BFS
        if (!bfs(maze, startX, startY, endX, endY)) {
            System.out.println("No path to the cheese.");
        }
    }
}



