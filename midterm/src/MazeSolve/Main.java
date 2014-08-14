package MazeSolve;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		
		
		Player p = new PlayerDirection8();
		
		DirectionConfig dc = new DirectionConfig();
		dc.directionFromFile = Integer.parseInt(dc.readFile("directionConfig.txt"));

		if(dc.directionFromFile == 4) {
			p = new PlayerDirection4();
		} else if (dc.directionFromFile == 8){
			p = new PlayerDirection8();
		} 
		else {
			System.out.println("Direction config file error. This time we will use 8 directions");
		}
		
		
		Maze.getInstance().cursor(1, 1);
	
			while(Maze.getInstance().getMap(8,8) == 0){
				p.start();
				Maze.getInstance().showMaze();
				System.out.println("Direction: "+ dc.directionFromFile);
				System.out.print("Count: "); 
				p.showPathCount();
				delayOneSec();
				screenClear();
			}
			System.out.print("Maze is solved.");
	}
	
	public static void delayOneSec(){
		try {
		    Thread.sleep(100);                 
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	public static void screenClear(){
		for(int i=0;i<30;i++){
			System.out.println();
		}
	}
	
}
