package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class Controller implements Initializable {
	@FXML
	ImageView player;
	
	TranslateTransition transition = new TranslateTransition();
    private double startDragX;
    double x = 20;
    int flag = 0;
	   
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	player.setManaged(false);
	player.setTranslateX(20);
	 player.setOnMousePressed(e -> {
         startDragX = e.getSceneX();
         flag = 1;
     });
	 
     player.setOnMouseDragged(e -> {
    	
    	 if(flag ==1) {
    	 double X = e.getSceneX();
    	  if(X - startDragX > 0) {
    		  x = x + 10;
    		  player.setTranslateX(x);
    		  flag = 0;
    	  }
    	 else if (X - startDragX  < 0) {
    		  x = x - 10;
    		  player.setTranslateX(x);
    		  flag = 0;
    	 }
    	 }
     });
	
	//This code makes the player move downwards continuously 
    transition.setDuration(Duration.seconds(15));
	transition.setNode(player);
	transition.setToY(800);
	transition.play();

	
}
	

}
