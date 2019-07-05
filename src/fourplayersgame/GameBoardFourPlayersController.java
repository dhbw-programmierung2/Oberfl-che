package fourplayersgame;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.SplitPane;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.RollTheDice;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.TouchEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;

import javafx.scene.shape.Circle;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

public class GameBoardFourPlayersController {
	
	@FXML
	public SplitPane splitPane;
	public GridPane gridPaneLeft;
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
	public Circle crcField31;
	public Circle crcField30;
	public Circle crcField29;
	public Circle crcField32;
	public Circle crcAimBlack1;
	public Circle crcField28;
	public Circle crcField33;
	public Circle crcAimBlack2;
	public Circle crcField27;
	public Circle crcField34;
	public Circle crcAimBlack3;
	public Circle crcField26;
	public Circle crcField35;
	public Circle crcAimBlack4;
	public Circle crcField25;
	public Circle crcField36;
	public Circle crcField37;
	public Circle crcField38;
	public Circle crcField39;
	public Circle crcField40;
	public Circle crcField1;
	public Circle crcAimYellow1;
	public Circle crcField2;
	public Circle crcAimYellow2;
	public Circle crcField3;
	public Circle crcAimYellow3;
	public Circle crcAimYellow4;
	public Circle crcField4;
	public Circle crcField5;
	public Circle crcAimGreen4;
	public Circle crcField15;
	public Circle crcField6;
	public Circle crcAimGreen3;
	public Circle crcField14;
	public Circle crcField7;
	public Circle crcAimGreen2;
	public Circle crcField13;
	public Circle crcField8;
	public Circle crcAimGreen1;
	public Circle crcField12;
	public Circle crcField9;
	public Circle crcField10;
	public Circle crcField11;
	public Circle crcField24;
	public Circle crcField23;
	public Circle crcField22;
	public Circle crcField21;
	public Circle crcAimRed3;
	public Circle crcAimRed2;
	public Circle crcAimRed1;
	public Circle crcField20;
	public Circle crcField16;
	public Circle crcAimRed4;
	public Circle crcField17;
	public Circle crcField18;
	public Circle crcField19;
	public GridPane gridPaneRigth;
	public Button btnRollTheDice;
	public ImageView imgDice;
	public Label lblPlayer;
	public TextArea txtPlayerList;
	public Button btnExitGame;

	public void initSelectGUI() {
		Image im1 = new Image("/pictures/Green.jpg", false);
		crcBeginGreen1.setFill(new ImagePattern(im1));
		crcBeginGreen1.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		
		
		/*
		 * geht nicht :(
		 */
		Image image = new Image(getClass().getResourceAsStream("/wuerfel1.png"));
		lblPlayer.setGraphic(new ImageView(image));
		
	}
	
	public void initialize() {
		
		/*
		 * Felder Gr�n
		 */
		
		crcBeginGreen1.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		     
		
		crcBeginGreen2.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		        
		
		crcBeginGreen3.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
				
	
		//crcField33.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		        
		/*
		 * Felder Gelb
		 */
		crcBeginYellow1.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
		        
		
		crcBeginYellow2.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
		      
		
		crcBeginYellow3.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
		    
		
	//	crcField1.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
		        
		/*
		 * Felder Schwarz
		 */
		crcBeginBlack1.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		        
		
		crcBeginBlack2.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		      
		
		crcBeginBlack3.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		       
		
		//crcField9.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		       
		
		/*
		 * Felder Rot
		 */
		crcBeginRed1.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		       
		
		crcBeginRed2.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));

		
		crcBeginRed3.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		       
		
		//crcField25.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		      
		
		
		        
		
		
		// Bef�llen der Spielfiguren
		
		populateRed();
		populateBlack();
		populateGreen();
		populateYellow();
	}
	
	/**
	 * Methode, welche die pinken Spielfiguren belebt
	 */

	
	/**
	 * Methode, welche die roten Spielfiguren belebt
	 */
	public void populateRed() {
		Image im4 = new Image("/pictures/Red.jpg", false);
		crcBeginRed1.setFill(new ImagePattern(im4));
		crcBeginRed2.setFill(new ImagePattern(im4));
		crcBeginRed3.setFill(new ImagePattern(im4));
		
		crcBeginRed4.setFill(new ImagePattern(im4));
	}
	
	/**
	 * Methode, welche die schwarzen Spielfiguren belebt
	 */
	public void populateBlack() {
		Image im3 = new Image("/pictures/Black.jpg", false);
		crcBeginBlack1.setFill(new ImagePattern(im3));
		crcBeginBlack2.setFill(new ImagePattern(im3));
		crcBeginBlack3.setFill(new ImagePattern(im3));
		crcBeginBlack4.setFill(new ImagePattern(im3));
	}
	
	public void populateYellow() {
		Image im2 = new Image("/pictures/Yellow.jpg", false);
		crcBeginYellow1.setFill(new ImagePattern(im2));
		crcBeginYellow2.setFill(new ImagePattern(im2));
		crcBeginYellow3.setFill(new ImagePattern(im2));
		crcBeginYellow4.setFill(new ImagePattern(im2));

	}
	
	public void populateGreen() {
		Image im1 = new Image("/pictures/Green.jpg", false);
		crcBeginGreen1.setFill(new ImagePattern(im1));
		crcBeginGreen2.setFill(new ImagePattern(im1));
		crcBeginGreen3.setFill(new ImagePattern(im1));
		crcBeginGreen4.setFill(new ImagePattern(im1));
	}
	
	
	// Event Listener on Circle[#crcBeginYellow1].onMouseClicked
	@FXML
	public void circleOnActionM(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Circle[#crcBeginYellow1].onTouchPressed
	@FXML
	public void circleOnActionT(TouchEvent event) {
		// TODO Autogenerated
	}
	
	// Event Listener on Button[#btnRollTheDice].onAction
	@FXML
	public void buttonRollTheDiceOnAction(ActionEvent event) {
		
		
		// Erzeugen eines Random Objekts
				Random rnd = new Random();
				
				//Value bekommt eine zuf�llige Zahl zwischen 1 und  zugewiesen
				int value = rnd.nextInt(6) + 1;
				
				lblPlayer.setText(String.valueOf(value));
				
				
		//GameRules gameRules = new GameRules();
		//gameRules.goForward();
	}
	// Event Listener on Button[#btnExitGame].onAction
	@FXML
	public void buttonExitGameOnAction(ActionEvent event) {
		System.exit(0);
	}
}
