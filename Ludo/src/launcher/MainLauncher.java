package launcher;


import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.application.Application;


public class MainLauncher extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Launcher.fxml")); 
	        primaryStage.setTitle("Game Selection"); 
	        primaryStage.setScene(new Scene(root, 750, 450)); 
	        primaryStage.show(); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
		public static void main(String[] args) {
		launch(args);
	}

}
