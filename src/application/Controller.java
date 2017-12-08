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
	@FXML
	ImageView playero;
	TranslateTransition transition = new TranslateTransition();
	TranslateTransition transition1 = new TranslateTransition();
    private double startDragX;
    double x = 20;
    int flag = 0;
	   
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	playero.setVisible(false);
	player.setManaged(false);
	player.setTranslateX(20);
	 player.setOnMousePressed(e -> {
		 playero.setTranslateX(player.getTranslateX());
		 playero.setTranslateY(player.getTranslateY());
		 player.setVisible(false);
		 transition1.pause();
		 playero.setVisible(true);
		 paraopen();
     });
	 
     
	
	//This code makes the player move downwards continuously 
    transition1.setDuration(Duration.seconds(15));
	transition1.setNode(player);
	transition1.setToY(800);
	transition1.play();

	
}
public void paraopen() {
	playero.setManaged(false);
	
	
	 playero.setOnMousePressed(e -> {
         startDragX = e.getSceneX();
         flag = 1;
     });
	 
     playero.setOnMouseDragged(e -> {
    	
    	 if(flag ==1) {
    	 double X = e.getSceneX();
    	  if(X - startDragX > 0) {
    		  x = x + 10;
    		  playero.setTranslateX(x);
    		  flag = 0;
    	  }
    	 else if (X - startDragX  < 0) {
    		  x = x - 10;
    		  playero.setTranslateX(x);
    		  flag = 0;
    	 }
    	 }
     });
	
	//This code makes the player move downwards continuously 
    transition.setDuration(Duration.seconds(19));
	transition.setNode(playero);
	transition.setToY(800);
	transition.play();
}
	

}
