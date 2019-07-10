package fourplayersgame;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;

import javafx.scene.control.SplitPane;

import java.util.ArrayList;
import java.util.HashMap;

import game.GameBoard;
import game.GameRules;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.TouchEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;

import javafx.scene.shape.Circle;
import launcher.LauncherController;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

/**
 * Diese Klasse ist für das Erstellen und veraendern des 4er Spielbrettes zustaendig.
 * 
 * @author Lukas, Kim, Isabelle, Jonas
 * @version 1.0
 *
 */
public class GameBoardFourPlayersController {
	/*
	 * FXML Komponenten
	 */
	@FXML
	public SplitPane splitPane;
	public GridPane gridPaneLeft;
	public GridPane gridPaneRigth;
	
	public Circle crcBeginYellow1;
	public Circle crcBeginYellow2;
	public Circle crcBeginYellow3;
	public Circle crcBeginYellow4;
	public Circle crcBeginBlack3;
	public Circle crcBeginBlack1;
	public Circle crcBeginBlack4;
	public Circle crcBeginBlack2;
	public Circle crcBeginRed4;
	public Circle crcBeginRed3;
	public Circle crcBeginRed1;
	public Circle crcBeginRed2;
	public Circle crcBeginGreen1;
	public Circle crcBeginGreen2;
	public Circle crcBeginGreen3;
	public Circle crcBeginGreen4;
	
	public Circle crcAimBlack1;
	public Circle crcAimBlack2;
	public Circle crcAimBlack3;
	public Circle crcAimBlack4;
	public Circle crcAimYellow1;
	public Circle crcAimYellow2;
	public Circle crcAimYellow3;
	public Circle crcAimYellow4;
	public Circle crcAimGreen1;
	public Circle crcAimGreen2;
	public Circle crcAimGreen3;
	public Circle crcAimGreen4;
	public Circle crcAimRed1;
	public Circle crcAimRed2;
	public Circle crcAimRed3;
	public Circle crcAimRed4;
	
	public Circle crcField31;
	public Circle crcField30;
	public Circle crcField29;
	public Circle crcField32;
	public Circle crcField28;
	public Circle crcField33;
	public Circle crcField27;
	public Circle crcField34;
	public Circle crcField26;
	public Circle crcField35;
	public Circle crcField25;
	public Circle crcField36;
	public Circle crcField37;
	public Circle crcField38;
	public Circle crcField39;
	public Circle crcField40;
	public Circle crcField1;
	public Circle crcField2;
	public Circle crcField3;
	public Circle crcField4;
	public Circle crcField5;
	public Circle crcField15;
	public Circle crcField6;
	public Circle crcField14;
	public Circle crcField7;
	public Circle crcField13;
	public Circle crcField8;
	public Circle crcField12;
	public Circle crcField9;
	public Circle crcField10;
	public Circle crcField11;
	public Circle crcField24;
	public Circle crcField23;
	public Circle crcField22;
	public Circle crcField21;
	public Circle crcField20;
	public Circle crcField16;
	public Circle crcField17;
	public Circle crcField18;
	public Circle crcField19;
		
	public Button btnRollTheDice;
	public Button btnExitGame;
	public ImageView imgDice;
	public TextField txtPlayer1;
	public TextField txtPlayer2;
	public TextField txtPlayer3;
	public TextField txtPlayer4;
	
	/*
	 * Zaehlt wie oft der Button Wuerfeln geklickt wurde.
	 */
	public int round = 0;
	
	/*
	 * Diese ArrayLists halten die Felder, diese werden entweder in drei Kategorien eingeteilt den Lauffelder, Hausfeldern/Beginfeldern und Zielfeldern.
	 * Der HashMap wird die ID des Circles sowie ein interner Name als Wert uebergeben.
	 */
	public ArrayList<Circle> fieldsGui = new ArrayList<Circle>();
	public ArrayList<Circle> beginFieldsGui = new ArrayList<Circle>();
	public ArrayList<Circle> aimFieldsGui = new ArrayList<Circle>();
	public HashMap<String, String> tokenID = new HashMap<String, String>();
	

	/*
	 * Die ArrayList werden mit den entsprechenden Circles gefuellt.
	 */
	public void initialize(ArrayList<String> playerName, ArrayList<String> color, ArrayList<String> rival, int numberOfPlayers) {
		
		ObservableList<Node> l_circleList = gridPaneLeft.getChildren();
		for (Node l_node : l_circleList) {
			Circle l_circle = (Circle) l_node;
			if (l_circle.getId().startsWith("crcField")) {
				fieldsGui.add(l_circle);
			} else if (l_circle.getId().startsWith("crcAim")) {
				aimFieldsGui.add(l_circle);
			} else {
				beginFieldsGui.add(l_circle);
			}
		}
		
		// zur Überprüfung
		System.out.println(fieldsGui);
		System.out.println(playerName);
		System.out.println(color);
		System.out.println(rival);
		System.out.println(numberOfPlayers);
		
		/*
		 * Der Name des jeweiligen Spielers wird auf den Textfeldern angezeigt.
		 */
		txtPlayer1.setText(playerName.get(0));
		txtPlayer2.setText(playerName.get(1));
		if(numberOfPlayers == 4) {
			txtPlayer3.setText(playerName.get(2));
			txtPlayer4.setText(playerName.get(3));
		}		
		
		/*
		 * Wenn ein Spieler die Farbe Gruen ausgewaehlt hat werden die Spielfiguren auf die jeweiligen Circles gesetzt.
		 */
		if(color.contains("Gruen")) {
			Image im1 = new Image("/pictures/Green.jpg", false);
			crcBeginGreen1.setFill(new ImagePattern(im1));
			crcBeginGreen1.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		     
			crcBeginGreen2.setFill(new ImagePattern(im1));
			crcBeginGreen2.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		        
			crcBeginGreen3.setFill(new ImagePattern(im1));
			crcBeginGreen3.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
				
			crcField11.setFill(new ImagePattern(im1));
			crcField11.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
			
			tokenID.put("crcBeginGreen1", "green1");
			tokenID.put("crcBeginGreen2", "green2");
			tokenID.put("crcBeginGreen3", "green3");
			tokenID.put("crcField11", "green4");
		}
		/*
		 * Wenn ein Spieler die Farbe Gelb ausgewaehlt hat werden die Spielfiguren auf die jeweiligen Circles gesetzt.
		 */
		if(color.contains("Gelb")) {
			Image im2 = new Image("/pictures/Yellow.jpg", false);
			crcBeginYellow1.setFill(new ImagePattern(im2));
			crcBeginYellow1.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
		        
			crcBeginYellow2.setFill(new ImagePattern(im2));
			crcBeginYellow2.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
			
			crcBeginYellow3.setFill(new ImagePattern(im2));
			crcBeginYellow3.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
			
			crcField1.setFill(new ImagePattern(im2));
			crcField1.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
			
			tokenID.put("crcBeginYellow1", "yellow1");
			tokenID.put("crcBeginYellow2", "yellow2");
			tokenID.put("crcBeginYellow3", "yellow3");
			tokenID.put("crcField1", "yellow4");
		}
		/*
		 * Wenn ein Spieler die Farbe Schwarz ausgewaehlt hat werden die Spielfiguren auf die jeweiligen Circles gesetzt.
		 */
		if(color.contains("Schwarz")) {
			Image im3 = new Image("/pictures/Black.jpg", false);
			crcBeginBlack1.setFill(new ImagePattern(im3));
			crcBeginBlack1.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		        
			crcBeginBlack2.setFill(new ImagePattern(im3));
			crcBeginBlack2.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		      
			crcBeginBlack3.setFill(new ImagePattern(im3));
			crcBeginBlack3.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		       
			crcField31.setFill(new ImagePattern(im3));
			crcField31.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
			
			tokenID.put("crcBeginBlack1", "black1");
			tokenID.put("crcBeginBlack2", "black2");
			tokenID.put("crcBeginBlack3", "black3");
			tokenID.put("crcField31", "black4");
		}
		/*
		 * Wenn ein Spieler die Farbe Rot ausgewaehlt hat werden die Spielfiguren auf die jeweiligen Circles gesetzt.
		 */
		if(color.contains("Rot")) {
			Image im4 = new Image("/pictures/Red.jpg", false);
			crcBeginRed1.setFill(new ImagePattern(im4));
			crcBeginRed1.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		       
			crcBeginRed2.setFill(new ImagePattern(im4));
			crcBeginRed2.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));

			crcBeginRed3.setFill(new ImagePattern(im4));
			crcBeginRed3.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		       
			crcField21.setFill(new ImagePattern(im4));
			crcField21.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
			
			tokenID.put("crcBeginRed1", "red1");
			tokenID.put("crcBeginRed2", "red2");
			tokenID.put("crcBeginRed3", "red3");
			tokenID.put("crcField21", "red4");
		}
		
		
	}
	
	/*
	 * Es wurde ein Circle angeklickt.
	 */
	@FXML
	public void circleOnActionM(MouseEvent event) {
		
	}
	
	/*
	 * Es wurde ein Circle angeklickt.
	 */
	@FXML
	public void circleOnActionT(TouchEvent event) {
		
	}
	
	/*
	 * Der Button Wuerfeln wurde angeklickt.
	 */
	@FXML
	public void buttonRollTheDiceOnAction(ActionEvent event) {
		round++;
		GameRules gr = new GameRules();
		gr.GameRules();
	
		//GameRules gameRules = new GameRules();
		//gameRules.goForward();
	}
	
	/*
	 * Der Button Spiel beenden wurde angeklickt.
	 */
	@FXML
	public void buttonExitGameOnAction(ActionEvent event) {
		System.exit(0);
	}
}
