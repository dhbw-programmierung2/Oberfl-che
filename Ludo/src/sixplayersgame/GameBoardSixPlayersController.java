package sixplayersgame;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import java.util.ArrayList;
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
 * Diese Klasse ist für das Erstellen und veraendern des 6er Spielbrettes zustaendig.
 * 
 * @author Lukas, Kim, Isabelle, Jonas
 * @version 1.0
 *
 */
public class GameBoardSixPlayersController {
	
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
	public Circle crcBeginBlack1;
	public Circle crcBeginBlack2;
	public Circle crcBeginBlack3;
	public Circle crcBeginBlack4;
	public Circle crcBeginRed1;
	public Circle crcBeginRed2;
	public Circle crcBeginRed3;
	public Circle crcBeginRed4;
	public Circle crcBeginBlue1;
	public Circle crcBeginBlue2;
	public Circle crcBeginBlue3;
	public Circle crcBeginBlue4;
	public Circle crcBeginGreen1;
	public Circle crcBeginGreen2;
	public Circle crcBeginGreen3;
	public Circle crcBeginGreen4;
	public Circle crcBeginPurple1;
	public Circle crcBeginPurple2;
	public Circle crcBeginPurple3;
	public Circle crcBeginPurple4;
	
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
	public Circle crcAimBlack1;
	public Circle crcAimBlack2;
	public Circle crcAimBlack3;
	public Circle crcAimBlack4;
	public Circle crcAimPurple1;
	public Circle crcAimPurple2;
	public Circle crcAimPurple3;
	public Circle crcAimBlue1;
	public Circle crcAimBlue2;
	public Circle crcAimBlue3;
	public Circle crcAimBlue4;
		
	public Circle crcField48;
	public Circle crcField45;
	public Circle crcField2;
	public Circle crcField46;
	public Circle crcField28;
	public Circle crcField47;
	public Circle crcField29;
	public Circle crcField43;
	public Circle crcField3;
	public Circle crcField44;
	public Circle crcField20;
	public Circle crcField1;
	public Circle crcField21;
	public Circle crcField22;
	public Circle crcField30;
	public Circle crcField27;
	public Circle crcField35;
	public Circle crcField26;
	public Circle crcField33;
	public Circle crcField24;
	public Circle crcField32;
	public Circle crcField23;
	public Circle crcField31;
	public Circle crcField42;
	public Circle crcField41;
	public Circle crcField38;
	public Circle crcField25;
	public Circle crcField40;
	public Circle crcField36;
	public Circle crcField37;
	public Circle crcField34;
	public Circle crcField39;
	public Circle crcField4;
	public Circle crcField5;
	public Circle crcField6;
	public Circle crcField7;
	public Circle crcField8;
	public Circle crcField9;
	public Circle crcField10;
	public Circle crcField11;
	public Circle crcField12;
	public Circle crcField13;
	public Circle crcField14;
	public Circle crcField15;
	public Circle crcField16;
	public Circle crcField17;
	public Circle crcField18;
	public Circle crcField19;
	
	public Button btnRollTheDice;
	public Button btnExitGame;
	public ImageView imgDice;
	public Label lblPlayer;
	
	public TextField txtPlayer1;
	public TextField txtPlayer2;
	public TextField txtPlayer3;
	public TextField txtPlayer4;
	public TextField txtPlayer5;
	public TextField txtPlayer6;
	
	/*
	 * Zaehlt wie oft der Button Wuerfeln geklickt wurde.
	 */
	public int round = 0;
	
	/*
	 * Diese ArrayLists halten die Felder, diese werden entweder in drei Kategorien eingeteilt den Lauffelder, Hausfeldern/Beginfeldern und Zielfeldern.
	 */
	public ArrayList<Circle> fieldsGui = new ArrayList<Circle>();
	public ArrayList<Circle> beginFieldsGui = new ArrayList<Circle>();
	public ArrayList<Circle> aimFieldsGui = new ArrayList<Circle>();
	
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
		
		/*
		 * Der Name des jeweiligen Spielers wird auf den Textfeldern angezeigt.
		 */
		txtPlayer1.setText(playerName.get(0));
		txtPlayer2.setText(playerName.get(1));
		txtPlayer3.setText(playerName.get(2));
		if(numberOfPlayers == 5) {
			txtPlayer4.setText(playerName.get(3));
			txtPlayer5.setText(playerName.get(4));
		} else if(numberOfPlayers == 6){
			txtPlayer4.setText(playerName.get(3));
			txtPlayer5.setText(playerName.get(4));
			txtPlayer6.setText(playerName.get(5));
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
				
			crcField33.setFill(new ImagePattern(im1));
			crcField33.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
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
		       
			crcField9.setFill(new ImagePattern(im3));
			crcField9.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
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
		       
			crcField25.setFill(new ImagePattern(im4));
			crcField25.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		}
		/*
		 * Wenn ein Spieler die Farbe Blau ausgewaehlt hat werden die Spielfiguren auf die jeweiligen Circles gesetzt.
		 */
		if(color.contains("Blau")) {
			Image im5 = new Image("/pictures/Blue.jpg", false);
			crcBeginBlue1.setFill(new ImagePattern(im5));
			crcBeginBlue1.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLUE));
		      
			crcBeginBlue2.setFill(new ImagePattern(im5));
			crcBeginBlue2.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLUE));

			crcBeginBlue3.setFill(new ImagePattern(im5));
			crcBeginBlue3.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLUE));
		        
			crcField17.setFill(new ImagePattern(im5));
			crcField17.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLUE));
		        
		}
		/*
		 * Wenn ein Spieler die Farbe Lila ausgewaehlt hat werden die Spielfiguren auf die jeweiligen Circles gesetzt.
		 */
		if(color.contains("Lila")) {
			Image im6 = new Image("/pictures/Purple.jpg", false);
			crcBeginPurple1.setFill(new ImagePattern(im6));
			crcBeginPurple1.setEffect(new DropShadow(+25d, 0d, +2d, Color.PURPLE));
		        
			crcBeginPurple2.setFill(new ImagePattern(im6));
			crcBeginPurple2.setEffect(new DropShadow(+25d, 0d, +2d, Color.PURPLE));

			crcBeginPurple3.setFill(new ImagePattern(im6));
			crcBeginPurple3.setEffect(new DropShadow(+25d, 0d, +2d, Color.PURPLE));
		        
			crcField41.setFill(new ImagePattern(im6));
			crcField41.setEffect(new DropShadow(+25d, 0d, +2d, Color.PURPLE));
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
	}

	/*
	 * Der Button Spiel beenden wurde angeklickt.
	 */
	@FXML
	public void buttonExitGameOnAction(ActionEvent event) {
		
		System.exit(0);
	}
	
}
