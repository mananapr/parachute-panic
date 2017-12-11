package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class player extends Application {
public static void main(String args[]) {
		Application.launch(args);
}

@Override
public void start(Stage stage) throws Exception {
	FXMLLoader loader = new FXMLLoader (getClass().getResource("thread1.fxml"));
	AnchorPane root = loader.load();
	Scene scene = new Scene(root,800,600);
	stage.setScene(scene);
	stage.show();	
}
}
