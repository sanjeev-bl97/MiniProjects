import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class maze extends JFrame{

	private int[][] m = {
			
			{1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,1,0,1,0,1,0,0,0,0,0,1},
			{1,0,1,0,0,0,1,0,1,1,1,0,1},
			{1,0,1,1,1,1,1,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,1,1,1,0,1},
			{1,0,1,0,1,1,1,0,1,0,0,0,1},
			{1,0,1,0,1,0,0,0,1,1,1,0,1},
			{1,0,1,0,1,1,1,0,1,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,1,9,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1}
			
			
	};
	
	public ArrayList<Integer> path = new ArrayList<>();
	
	
	maze(){
		setTitle("Maze Solver");
		setSize(640,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		path.add(1);
		path.add(1);
		dfs.search(m,1,1,path);
	}
	
	@Override
	public void paint(Graphics g){
		g.translate(50, 50);
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
		
				Color color;
				
				switch(m[i][j]){
				
				case 1 : 
					color = Color.BLACK;
					break;
				case 9 : 
					color = Color.RED;
					break;
				default:
					color = Color.WHITE;
					break;
				}
				
				g.setColor(color);
				g.fillRect(i*30, j*30, 30, 30);
				g.setColor(Color.RED);
				g.drawRect(i*30, j*30, 30, 30);
				
					
				
				}
		}
		
		
		 for(int i = 0; i < path.size(); i += 2){
			int x = path.get(i);
			int y = path.get(i + 1);
			
			System.out.println(x);
			System.out.println(y);
			
			g.setColor(Color.GREEN);
			g.fillRect(x*30, y*30, 30, 30);
			
			
		}
		
				
				
			}
	
	public static void main(String[] args){
		maze obj = new maze();
		obj.setVisible(true);
		obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
		
	}
	
	

