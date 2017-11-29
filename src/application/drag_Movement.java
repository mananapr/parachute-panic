package application;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class transition extends Application {
	public static void main(String args[]) {
	launch(args);
	}

	
	public void start(Stage window) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("thread1.fxml"));
		Parent root = loader.load();
		Controller controller = loader.getController();
		//Parent root = FXMLLoader.load(getClass().getResource("thread1_fxml.fxml"));
		
		Scene main_scene = new Scene(root, 600, 400);
		window.setResizable(false);
		window.setScene(main_scene);
		window.show();
		

		
		
	}
}
