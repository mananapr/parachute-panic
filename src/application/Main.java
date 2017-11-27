package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// FXMLs
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Parent help = FXMLLoader.load(getClass().getResource("Help.fxml"));
		
		// SCENES
		Scene main_scene = new Scene(root, 600, 400);
		main_scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
		Scene help_scene = new Scene(help, 600, 400);
		help_scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
		
		// STAGE SETTINGS
		primaryStage.setResizable(false);
		primaryStage.setScene(main_scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}