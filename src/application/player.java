package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class player extends Application {
	Scene s1,s2;
	Stage stg;
public static void main(String args[]) {
		Application.launch(args);
}

@Override
public void start(Stage stage) throws Exception {
	stg = stage;
	FXMLLoader loader1 = new FXMLLoader(getClass().getResource("Main.fxml"));
	Parent root1 = loader1.load();	
	s1 = new Scene(root1,800,600);
	
	s1.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
	/*testing
	FXMLLoader l1 = new FXMLLoader (getClass().getResource("thread2.fxml"));
	Parent r1 = l1.load();
	s1 = new Scene(r1,800,600);
	testing*/

	stg.setScene(s1);
	
	stg.show();	
	
}
}
