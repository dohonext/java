package MazeSolve;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Player p = new PlayerDirection8(); //일단 미로안에서 움직일 플레이어 8디렉션으로 생성(기본)
		
		DirectionConfig dc = new DirectionConfig();   // 파일에서 4방향 8방향 결정. 에러이면 8방향으로 실행.
		dc.directionFromFile = Integer.parseInt(dc.readFile("directionConfig.txt"));
		if(dc.directionFromFile == 4) {
			p = new PlayerDirection4();
		} else if (dc.directionFromFile == 8){
			p = new PlayerDirection8();
		} 
		else {
			System.out.println("Direction config file error. This time we will use 8 directions");
		}
		
		Maze.getInstance().cursor(1, 1);  // 플레이어 위치 초기화
		while(Maze.getInstance().getMap(8,8) == 0){
			p.start();        // 플레이어 미로찾기 시작
			Maze.getInstance().showMaze();   // 미로 현재 상태 출력
			System.out.println("Direction: "+ dc.directionFromFile); // direction 출력
			System.out.print("Count: "); //카운트 출력
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
