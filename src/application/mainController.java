package application;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

public class mainController  implements Initializable {
	highscore_lives h = new highscore_lives();
	@FXML 
	Button play;
	int flag;
	@FXML
	Label highscore;
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
		Parent root1 = null;
		try {
			if(highscore_lives.lvs>0)
			{
			FXMLLoader loader1 = new FXMLLoader (getClass().getResource("thread2.fxml"));
			root1 = loader1.load();
			
			}
			else
			{
				flag = 1;
				FXMLLoader loader3 = new FXMLLoader (getClass().getResource("Main.fxml"));
				root1 = loader3.load();
			}
		} catch (IOException e1) {
		
			e1.printStackTrace();
		}
		Scene s4 = new Scene(root1,800,600);
		if(highscore_lives.lvs==0)
		{
			s4.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
		/*	if(highscore_lives.scr > highscore_lives.hiscr)
			{
				highscore_lives.hiscr = highscore_lives.scr;
				writer();
			}*/
		}
		s3.setScene(s4);
		
	   s3.show();
	  
	});
	
	
	PauseTransition pause1 =null;
	pause1 = new PauseTransition(Duration.seconds(100));
	
		   
			pause1.setOnFinished((e) ->{
				 if(flag==0) {
				s3.hide();
			   if(highscore_lives.scr > h.hiscr)
				{
					h.hiscr = highscore_lives.scr;
					writer();
				}
			  
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
				 }	
	   });
	 
	pause.play();
	pause1.play();
	
}

public  void writer(){
	try{
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("/home/kush/Documents/codes/pp/src/application/h.txt"));
		os.writeObject(h);
		os.close();				
	}
	catch(FileNotFoundException e){
		e.printStackTrace();
	}
		catch(IOException e){
		e.printStackTrace();
	}
}

@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	reader();
	highscore.setText("High Score:. "+h.hiscr);
	
}

public  void reader(){
	File file2 = new File("/home/kush/Documents/codes/pp/src/application/h.txt");
	 if(file2.exists()){
  		
  			try{
  			ObjectInputStream is = new ObjectInputStream(new FileInputStream("/home/kush/Documents/codes/pp/src/application/h.txt"));
  		h = (highscore_lives) is.readObject();
  			
  			   }
  				catch(FileNotFoundException e){
				e.printStackTrace();
			}
				catch(IOException e){
				e.printStackTrace();
			}
				catch(ClassNotFoundException e){
				e.printStackTrace();
			}	
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
	
	

