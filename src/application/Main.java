package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
	Stage window;
	Scene help_scene,main_scene;
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		
		// FXMLs
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Parent help = FXMLLoader.load(getClass().getResource("Help.fxml"));
		
		// SCENES
		main_scene = new Scene(root, 600, 400);
		main_scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
		help_scene = new Scene(help, 600, 400);
	    help_scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
		
		
		// STAGE SETTINGS
		window.setResizable(false);
		window.setScene(main_scene);
		window.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void press_help () {
		window.setScene(help_scene);
	}
	
	public void backfrom_help() {
		window.setScene(main_scene);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}