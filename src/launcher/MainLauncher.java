package launcher;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class MainLauncher extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Launcher.fxml")); 
	        primaryStage.setTitle("Game Board"); 
	        primaryStage.setScene(new Scene(root, 700, 450)); 
	        primaryStage.show(); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
		public static void main(String[] args) {
		launch(args);
	}

}
