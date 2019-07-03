package fourplayersgame;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class MainFour extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("GameBoardFourPlayers.fxml")); 
	        primaryStage.setTitle("Game Board"); 
	        primaryStage.setScene(new Scene(root, 600, 450)); 
	        primaryStage.show(); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
		public static void main(String[] args) {
		launch(args);
	}
}
