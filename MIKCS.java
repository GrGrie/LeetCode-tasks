import java.util.Scanner;

/* Max Increase to Keep City Skyline
 * 
 * In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there.
 * We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings).
 * Height 0 is considered to be a building as well.
 * 
 * At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right,
 * must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all
 * the buildings when viewed from a distance. See the following example.
 * 
 * What is the maximum total sum that the height of the buildings can be increased?
 * */
public class MIKCS {
	    
	    public static int findMin(int x, int y){
	        if(x > y) 
	            return y;
	        else return x;
	    }
	    
	    public static int maxIncreaseKeepingSkyline(int[][] grid) {
	        int[] strokaMax = new int[grid.length];
	        int strokaSize = grid.length;
	        int[] stolbecMax = new int[grid[0].length];
	        int stolbecSize = grid[0].length;
	        int max = 0;
	        for(int i = 0; i < strokaSize; i++){
	            for(int j = 0; j < stolbecSize; j++){
	             if(grid[i][j] > max)
	                max=grid[i][j];   
	            }
	            strokaMax[i] = max;
	            max = 0;
	        }
	        for(int i = 0; i < strokaSize; i++){
	            for(int j = 0; j < stolbecSize; j++){
	             if(grid[j][i] > max)
	                max=grid[j][i];   
	            }
	            stolbecMax[i] = max;
	            max = 0;
	        }
	        
	        int sum = 0;
	        for(int i = 0; i < strokaSize; i++){
	            for(int j = 0; j < stolbecSize; j++){
	                    sum += (findMin(strokaMax[i], stolbecMax[j]) - grid[i][j]);
	            }
	        }
	        return sum;
	    }
	    
	    public static void main(String[] argc) {
	    	Scanner sc = new Scanner(System.in);
	    	int N = sc.nextInt();
	    	int[][] tmpCity = new int[N][N];
	    	for(int i = 0; i < N; i++) {
	    		for(int j = 0; j < N; j++) {
	    			tmpCity[i][j] = sc.nextInt();
	    			}
	    	}
	    	System.out.println(maxIncreaseKeepingSkyline(tmpCity));
	    	sc.close();
	    }
	    
	    
}
