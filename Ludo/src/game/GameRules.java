package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import sixplayersgame.GameBoardSixPlayersController;
import fourplayersgame.GameBoardFourPlayersController;

import javafx.scene.shape.Circle;

public class GameRules {
	private List<Field> circleList = new ArrayList<>();
	public int cubeNumber;
	
	public void GameRules() {
		
		
	}
	
	public void goForward() {
		
	}
	
	public void rollTheDice() {
		if(round == 1) {
			
		}
		
		Random random = new Random();
		cubeNumber = random.nextInt(6)+1;
	}

}
