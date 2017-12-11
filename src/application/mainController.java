package application;
import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

public class mainController   {
	@FXML 
	Button play;
	int flag;
public void func1(ActionEvent e) throws Exception {
	System.exit(0);
}
public void func(ActionEvent event) throws Exception {
	FXMLLoader loader = new FXMLLoader (getClass().getResource("thread1.fxml"));
	Parent root = loader.load();
	Scene s2 = new Scene(root,800,600);
	Stage stage = new Stage(); 
	Stage window = (Stage)(((Node)event.getSource()).getScene().getWindow());
	window.hide();
	stage.setScene(s2);
	stage.show();
	
	Stage s3 = new Stage();
	
	PauseTransition pause = new PauseTransition(Duration.seconds(50));
	pause.setOnFinished((e) ->{
	   stage.hide();
	   
	   FXMLLoader loader1 = new FXMLLoader (getClass().getResource("thread2.fxml"));
	   FXMLLoader loader3 = new FXMLLoader (getClass().getResource("Main.fxml"));
	   
		Parent root1 = null;
		try {
			if(highscore_lives.scr>0)
			root1 = loader1.load();
			else
			{
				flag = 1;
				root1 = loader3.load();
			}
		} catch (IOException e1) {
		
			e1.printStackTrace();
		}
		Scene s4 = new Scene(root1,800,600);
		if(highscore_lives.scr<1)
			s4.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
		s3.setScene(s4);
		
	   s3.show();
	  
	});
	PauseTransition pause1 =null;
	 if(flag==0) {
		   pause1 = new PauseTransition(Duration.seconds(100));
			pause1.setOnFinished((e) ->{
			   s3.hide();
			   FXMLLoader loader3 = new FXMLLoader (getClass().getResource("Main.fxml"));
			   Parent root1 = null;
				try {
					root1 = loader3.load();
				}
				catch (IOException e1) {
					
					e1.printStackTrace();
				}
				Scene s4 = new Scene(root1,800,600);
				s4.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
				s3.setScene(s4);
				s3.show();
				
	   });
	 }
	pause.play();
	if(flag==0) {
		
		pause1.play();
	}
}
}

	/*@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		play.setOnAction(event -> {
		FXMLLoader loader = new FXMLLoader (getClass().getResource("thread1.fxml"));
		AnchorPane root = null;
		
			try {
				root = loader.load();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		
		Scene s2 = new Scene(root,800,600);
		Stage window = (Stage)(((Node)event.getSource()).getScene().getWindow());
		window.setScene(s2);
		window.show();
				});
		
	}
	*/
	
	

