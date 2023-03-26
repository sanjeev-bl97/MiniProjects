import java.util.ArrayList;

public class dfs {

	static boolean search(int[][] m,int x,int y,ArrayList<Integer> path){
		
		if(m[x][y] == 9){
			path.add(x);
			path.add(y);
			
			return true;
			
		}
		
		if(m[x][y] == 0){
			m[x][y] = 2;
			
			
			
			int[] dx = {-1,1,0,0};
			int[] dy = {0,0,-1,1};
			
			for(int i = 0; i < 4; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(search(m,nx,ny,path)){
					path.add(nx);
					path.add(ny);
					
					return true;
				}
			}
		}
		
		return false;
	}
}
