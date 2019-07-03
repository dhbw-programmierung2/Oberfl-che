package sixplayersgame;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;

import javafx.scene.control.SplitPane;

import java.util.ArrayList;

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

public class GameBoardSixPlayersController {
	@FXML
	public SplitPane splitPane;
	public GridPane gridPaneLeft;
	public Circle crcBeginYellow1;
	public Circle crcBeginYellow2;
	public Circle crcBeginBlack1;
	public Circle crcBeginBlack2;
	public Circle crcBeginRed3;
	public Circle crcBeginRed4;
	public Circle crcBeginRed2;
	public Circle crcBeginRed1;
	public Circle crcBeginGreen2;
	public Circle crcBeginGreen1;
	public Circle crcField48;
	public Circle crcField45;
	public Circle crcBeginBlack4;
	public Circle crcField2;
	public Circle crcField46;
	public Circle crcField28;
	public Circle crcBeginBlack3;
	public Circle crcField47;
	public Circle crcField29;
	public Circle crcField43;
	public Circle crcField3;
	public Circle crcField44;
	public Circle crcField20;
	public Circle crcField1;
	public Circle crcField21;
	public Circle crcAimYellow1;
	public Circle crcField22;
	public Circle crcAimYellow2;
	public Circle crcAimYellow3;
	public Circle crcField30;
	public Circle crcField27;
	public Circle crcBeginGreen3;
	public Circle crcField35;
	public Circle crcField26;
	public Circle crcBeginGreen4;
	public Circle crcField33;
	public Circle crcField24;
	public Circle crcAimGreen2;
	public Circle crcField32;
	public Circle crcField23;
	public Circle crcAimGreen1;
	public Circle crcField31;
	public Circle crcField42;
	public Circle crcField41;
	public Circle crcField38;
	public Circle crcField25;
	public Circle crcAimRed3;
	public Circle crcAimRed2;
	public Circle crcAimRed1;
	public Circle crcField40;
	public Circle crcField36;
	public Circle crcAimRed4;
	public Circle crcField37;
	public Circle crcField34;
	public Circle crcField39;
	public Circle crcBeginBlue1;
	public Circle crcBeginBlue2;
	public Circle crcBeginBlue3;
	public Circle crcBeginBlue4;
	public Circle crcBeginPurple2;
	public Circle crcBeginPurple1;
	public Circle crcAimYellow4;
	public Circle crcBeginYellow3;
	public Circle crcBeginYellow4;
	public Circle crcBeginPurple3;
	public Circle crcBeginPurple4;
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
	public Circle crcAimBlack1;
	public Circle crcAimBlack2;
	public Circle crcAimBlack3;
	public Circle crcAimBlue4;
	public Circle crcAimPurple1;
	public Circle crcAimPurple2;
	public Circle crcAimPurple3;
	public Circle crcAimGreen4;
	public Circle crcAimGreen3;
	public Circle crcAimBlue1;
	public Circle crcAimBlue2;
	public Circle crcAimBlue3;
	public Circle crcAimBlack4;
	public GridPane gridPaneRigth;
	public Button btnRollTheDice;
	public ImageView imgDice;
	public Label lblPlayer;
	public TextArea txtPlayerList;
	public Button btnExitGame;
	
	public void initialize() {
		Image im1 = new Image("/pictures/Green.jpg", false);
		crcBeginGreen1.setFill(new ImagePattern(im1));
		crcBeginGreen1.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		     
		crcBeginGreen2.setFill(new ImagePattern(im1));
		crcBeginGreen2.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		        
		crcBeginGreen3.setFill(new ImagePattern(im1));
		crcBeginGreen3.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
				
		crcField33.setFill(new ImagePattern(im1));
		crcField33.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		        
		Image im2 = new Image("/pictures/Yellow.jpg", false);
		crcBeginYellow1.setFill(new ImagePattern(im2));
		crcBeginYellow1.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
		        
		crcBeginYellow2.setFill(new ImagePattern(im2));
		crcBeginYellow2.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
		      
		crcBeginYellow3.setFill(new ImagePattern(im2));
		crcBeginYellow3.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
		    
		crcField1.setFill(new ImagePattern(im2));
		crcField1.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
		        
		Image im3 = new Image("/pictures/Black.jpg", false);
		crcBeginBlack1.setFill(new ImagePattern(im3));
		crcBeginBlack1.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		        
		crcBeginBlack2.setFill(new ImagePattern(im3));
		crcBeginBlack2.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		      
		crcBeginBlack3.setFill(new ImagePattern(im3));
		crcBeginBlack3.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		       
		crcField9.setFill(new ImagePattern(im3));
		crcField9.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		       
		Image im4 = new Image("/pictures/Red.jpg", false);
		crcBeginRed1.setFill(new ImagePattern(im4));
		crcBeginRed1.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		       
		crcBeginRed2.setFill(new ImagePattern(im4));
		crcBeginRed2.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));

		crcBeginRed3.setFill(new ImagePattern(im4));
		crcBeginRed3.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		       
		crcField25.setFill(new ImagePattern(im4));
		crcField25.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		      
		Image im5 = new Image("/pictures/Blue.jpg", false);
		crcBeginBlue1.setFill(new ImagePattern(im5));
		crcBeginBlue1.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLUE));
		      
		crcBeginBlue2.setFill(new ImagePattern(im5));
		crcBeginBlue2.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLUE));

		crcBeginBlue3.setFill(new ImagePattern(im5));
		crcBeginBlue3.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLUE));
		        
		crcField17.setFill(new ImagePattern(im5));
		crcField17.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLUE));
		        
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
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnExitGame].onAction
	@FXML
	public void buttonExitGameOnAction(ActionEvent event) {
		// TODO Autogenerated
	}
	
	private ArrayList<Node> nodeList = new ArrayList<Node>();
	private ArrayList<Circle> circleList = new ArrayList<Circle>();
	
	public void initSelectGUI() {
		// TODO Auto-generated method stub
		// Liste erstellen die alle Nodes enthält die auf der Splitpane sind
				/**splitPane.getChildren().forEach(x -> nodeList.add(x));
				for (Node tempNode : nodeList) {
					if(tempNode instanceof Circle) {
						circleList.add((Circle) tempNode);
					}
				}
				for(Circle tempCircle : circleList) {
					tempCircle.radiusProperty().bind(splitPane.widthProperty().divide(30));
					tempCircle.centerXProperty().bind(splitPane.widthProperty().divide(30));
					tempCircle.centerYProperty().bind(splitPane.widthProperty().divide(30));
				}
				*/
				
	}
}
