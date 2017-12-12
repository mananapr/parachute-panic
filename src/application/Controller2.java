package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class Controller2 extends highscore_lives implements Initializable {
	
	
	double fx1,fx2,fx3,fx4,fx5,fx6;
	@FXML 
	Label score ;
	
	@FXML
	ImageView player1;
	@FXML
	ImageView playero1;
	@FXML
	ImageView player2;
	@FXML
	ImageView playero2;
	@FXML
	ImageView player3;
	@FXML
	ImageView playero3;
	@FXML
	ImageView player4;
	@FXML
	ImageView playero4;
	@FXML
	ImageView player5;
	@FXML
	ImageView playero5;
	@FXML
	ImageView player6;
	@FXML
	ImageView playero6;
	@FXML
	ImageView boat;
	@FXML
	ImageView plane;
	@FXML
	ImageView boat1;
	
	TranslateTransition boat_transition = new TranslateTransition();
	TranslateTransition transition = new TranslateTransition();
	TranslateTransition transition1 = new TranslateTransition();
	TranslateTransition transition2 = new TranslateTransition();
	TranslateTransition transition2_ = new TranslateTransition();
	TranslateTransition transition3 = new TranslateTransition();
	TranslateTransition transition3_ = new TranslateTransition();
	TranslateTransition transition4 = new TranslateTransition();
	TranslateTransition transition4_ = new TranslateTransition();
	TranslateTransition transition5 = new TranslateTransition();
	TranslateTransition transition5_ = new TranslateTransition();
	TranslateTransition transition6 = new TranslateTransition();
	TranslateTransition transition6_ = new TranslateTransition();
	TranslateTransition transitionp = new TranslateTransition();
	TranslateTransition transitionboat11 = new TranslateTransition();
	TranslateTransition transitionboat12 = new TranslateTransition();
	TranslateTransition transitionboat21 = new TranslateTransition();
	TranslateTransition transitionboat22 = new TranslateTransition();
    private double startDragX;
    double x5 = 3;
    double x4 = 72.5;
    double x3 = 192;
    double x2 = 301.5;
    double x1 = 411;
    double x = 520.5;
    double y,y1,y2,y3,y4,y5;
    int flag1 = 0;
    int flag2 = 0;
    int flag3=0,flag4=0,flag5=0,flag6=0;
	
    ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(7,7,7,7,7,7));
    int a1 = 0;
    int a2 = 0;
    int a3 = 0;
    int a4 = 0;
    int a5 = 0;
    
public void random(int num) {
	if(num == 3) {
	while(a1==a3||a2==a3||a2==a1)
    {
        a1 = (int)Math.floor(Math.random()*6);
        a2 = (int)Math.floor(Math.random()*6);
        a3 = (int)Math.floor(Math.random()*6);
    }
	
	 ar.set(a1, 1);
	 ar.set(a2, 1);
	 ar.set(a3, 1);
	 }
	
	if(num == 4) {
		while(a1==a3||a2==a3||a2==a1||a1==a4||a2==a4||a3==a4)
	    {
	        a1 = (int)Math.floor(Math.random()*6);
	        a2 = (int)Math.floor(Math.random()*6);
	        a3 = (int)Math.floor(Math.random()*6);
	        a4 = (int)Math.floor(Math.random()*6);
	    }
		
		 ar.set(a1, 1);
		 ar.set(a2, 1);
		 ar.set(a3, 1);
		 ar.set(a4, 1);
	}
	
	if(num == 5) {
		while(sum(ar)!=5) {
			ar.set((int)Math.floor(Math.random()*6), 1);
		}
	}
}

public int sum(ArrayList<Integer> list) {
    int sum = 0; 

    for (int i : list)
        sum = sum + i;

    return sum;
}
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	score.setText("Score: "+scr);
	
	//water.setVisible(true);
	plane.setVisible(true);
	player1.setVisible(false);
	player6.setVisible(false);
	player5.setVisible(false);
	player4.setVisible(false);
    player3.setVisible(false);
	player2.setVisible(false);
	playero1.setVisible(false);
	playero6.setVisible(false);
	playero5.setVisible(false);
	playero4.setVisible(false);
	playero3.setVisible(false);
	playero2.setVisible(false);
	boat1.setVisible(false);
	
	random(4);

	
	transitionboat11.setDuration(Duration.seconds(5));
	transitionboat11.setNode(boat);
	transitionboat11.setToX(20);
	transitionboat11.play();
	
	transitionboat12.setDelay(Duration.seconds(45));
	transitionboat12.setNode(boat);
	transitionboat12.setDuration(Duration.seconds(5));
	transitionboat12.setFromX(20);
	transitionboat12.setToX(680);
	transitionboat12.play();
	
	boat1.setVisible(true);
	transitionboat21.setDuration(Duration.seconds(5));
	transitionboat21.setNode(boat1);
	transitionboat21.setToX(500);
	transitionboat21.play();
	
	transitionboat22.setDelay(Duration.seconds(45));
	transitionboat22.setNode(boat1);
	transitionboat22.setDuration(Duration.seconds(5));
	transitionboat22.setFromX(500);
	transitionboat22.setToX(680);
	transitionboat22.play();
/*	transitionboat12.setOnFinished((e)->{
		FXMLLoader loader = new FXMLLoader (getClass().getResource("thread2.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		
		Scene s2 = new Scene(root,800,600);
		Stage window = new Stage();
		window.setScene(s2);
		//window1.hide();
		window.show();	
	});*/
    transitionp.setDuration(Duration.seconds(24));
    transitionp.setNode(plane);
    transitionp.setToX(-743);
    plane.setLayoutX(650);
    transitionp.play();
    
	if(ar.get(0)==1) {
	player1.setVisible(true);
	player1.setManaged(false);
	player1.setTranslateX(x);
	player1.setTranslateY(-75);
	 player1.setOnMousePressed(e -> {
		 playero1.setTranslateX(player1.getTranslateX());
		 y = player1.getTranslateY();
		 playero1.setTranslateY(player1.getTranslateY());
		 player1.setVisible(false);
		 transition1.pause();
		 transition1.stop();
		 playero1.setVisible(true);
		 paraopen();
     });
	 
	//This code makes the player move downwards continuously 
//	transition1.setDelay(Duration.seconds(2));
    transition1.setDuration(Duration.seconds(32.6));
	transition1.setNode(player1);
	transition1.setToY(740);
	transition1.play();
/*	transition1.setOnFinished((e)->{
		if(player1.getTranslateY()>730) {
			--lvs;
			lives.setText("Lives: "+lvs);
		}
			
	});*/
	}
	
	if(ar.get(1)==1) {
		
	player2.setVisible(true);
	player2.setManaged(false);
	player2.setTranslateX(x1);
	player2.setTranslateY(-150);
	 player2.setOnMousePressed(e -> {
		 playero2.setTranslateX(player2.getTranslateX());
		 y1 = player2.getTranslateY();
		 playero2.setTranslateY(player2.getTranslateY());
		 player2.setVisible(false);
		 transition2.pause();
		 transition2.stop();
		 playero2.setVisible(true);
		 paraopen2();
     });
	 
	//This code makes the player move downwards continuously 
//	transition2.setDelay(Duration.seconds(5));
    transition2.setDuration(Duration.seconds(35.6));
	transition2.setNode(player2);
	transition2.setToY(740);
	transition2.play();
/*	transition2.setOnFinished((e)->{
		if(player2.getTranslateY()>730) {
			--lvs;
			lives.setText("Lives: "+lvs);
		}
			
	});*/
	}
	
	if(ar.get(2)==1) {
		player3.setVisible(true);
	
	player3.setManaged(false);
	player3.setTranslateX(x2);
	player3.setTranslateY(-225);
	player3.setOnMousePressed(e -> {
		 playero3.setTranslateX(player3.getTranslateX());
		 y2 = player3.getTranslateY();
		 playero3.setTranslateY(player3.getTranslateY());
		 player3.setVisible(false);
		 transition3.pause();
		 transition3.stop();
		 playero3.setVisible(true);
		 paraopen3();
     });
	 
	//This code makes the player move downwards continuously 
//	transition3.setDelay(Duration.seconds(8));
	transition3.setDuration(Duration.seconds(38.6));
	transition3.setNode(player3);
	transition3.setToY(740);
	transition3.play();
	/*transition3.setOnFinished((e)->{
		if(player3.getTranslateY()>730) {
			--lvs;
			lives.setText("Lives: "+lvs);
		}
			
	});*/
	}
	
	if(ar.get(3)==1) {
		player4.setVisible(true);

	player4.setManaged(false);
	player4.setTranslateX(x3);
	player4.setTranslateY(-300);
	player4.setOnMousePressed(e -> {
		 playero4.setTranslateX(player4.getTranslateX());
		 y3 = player4.getTranslateY();
		 playero4.setTranslateY(player4.getTranslateY());
		 player4.setVisible(false);
		 transition4.pause();
		 transition4.stop();
		 playero4.setVisible(true);
		 paraopen4();
     });
	 
	//This code makes the player move downwards continuously 
	//transition4.setDelay(Duration.seconds(11));
	transition4.setDuration(Duration.seconds(41.6));
	transition4.setNode(player4);
	transition4.setToY(740);
	transition4.play();
	/*transition4.setOnFinished((e)->{
		if(player4.getTranslateY()>730) {
			--lvs;
			lives.setText("Lives: "+lvs);
		}
			
	});*/
	}
	
	if(ar.get(4)==1) {
		player5.setVisible(true);

	player5.setManaged(false);
	player5.setTranslateX(x4);
	player5.setTranslateY(-375);
	player5.setOnMousePressed(e -> {
		 playero5.setTranslateX(player5.getTranslateX());
		 y4 = player5.getTranslateY();
		 playero5.setTranslateY(player5.getTranslateY());
		 player5.setVisible(false);
		 transition5.pause();
		 transition5.stop();
		 playero5.setVisible(true);
		 paraopen5();
		 
     });
	 
	//This code makes the player move downwards continuously 
//	transition5.setDelay(Duration.seconds(14));
	transition5.setDuration(Duration.seconds(44.6));
	transition5.setNode(player5);
	transition5.setToY(740);
	transition5.play();
/*	transition5.setOnFinished((e)->{
		if(player5.getTranslateY()>730) {
			--lvs;
			lives.setText("Lives: "+lvs);
		}
			
	});*/
	}
	
	if(ar.get(5)==1) {
		player6.setVisible(true);
	
	player6.setManaged(false);
	player6.setTranslateX(x5);
	player6.setTranslateY(-450);
	player6.setOnMousePressed(e -> {
		 playero6.setTranslateX(player6.getTranslateX());
		 y5 = player6.getTranslateY();
		 playero6.setTranslateY(player6.getTranslateY());
		 player6.setVisible(false);
		 transition6.pause();
		 transition6.stop();
		 playero6.setVisible(true);
		 paraopen6();
     });
	 
	//This code makes the player move downwards continuously 

	transition6.setDuration(Duration.seconds(47.6));
	transition6.setNode(player6);
	transition6.setToY(740);
	transition6.play();
/*	transition6.setOnFinished((e)->{
		if(player6.getTranslateY()>730) {
			--lvs;
			lives.setText("Lives: "+lvs);
		}
			
	});*/
	}
	 
}
public void paraopen() {
	playero1.setManaged(false);
	
	
	 playero1.setOnMousePressed(e -> {
         startDragX = e.getSceneX();
         flag1 = 1;
     });
	 
     playero1.setOnMouseDragged(e -> {
    	
    	 if(flag1 ==1) {
    	 double X = e.getSceneX();
    	  if(X - startDragX > 0) {
    		  x = x + 20;
    		  playero1.setTranslateX(x);
    		  fx1 = x;
    		  flag1 = 0;
    	  }
    	 else if (X - startDragX  < 0) {
    		  x = x - 20;
    		  fx1 = x;
    		  playero1.setTranslateX(x);
    		  flag1 = 0;
    	 }
    	 }
     });
	
	//This code makes the player move downwards continuously 
    transition.setDuration(Duration.seconds(19));
	transition.setNode(playero1);
	transition.setToY(700);
	transition.play();
	transition.setOnFinished((e) ->{
		if((fx1<=100 && fx1>=10)||(fx1<=670 && fx1>=420)) {
			++scr;
			score.setText("Score: "+scr);
//			URL resource = getClass().getResource("/home/manan/Programs/parachutepanic/win.wav");
//			Media pick = new Media(resource.toString());
//			MediaPlayer player1 = new MediaPlayer(pick);
//			player1.play();
		}
	
	});
}
	
public void paraopen2() {
	playero2.setManaged(false);
	
	
	 playero2.setOnMousePressed(e -> {
         startDragX = e.getSceneX();
         flag2 = 1;
     });
	 
     playero2.setOnMouseDragged(e -> {
    	
    	 if(flag2 ==1) {
    	 double X = e.getSceneX();
    	  if(X - startDragX > 0) {
    		  x1 = x1 + 20;
    		  fx2 = x1;
    		  playero2.setTranslateX(x1);
    		  flag2 = 0;
    	  }
    	 else if (X - startDragX  < 0) {
    		  x1 = x1 - 20;
    		  fx2 = x1;
    		  playero2.setTranslateX(x1);
    		  flag2 = 0;
    	 }
    	 }
     });
	
	//This code makes the player move downwards continuously 
    double r = ((700-y1)*19)/(700-y);
    transition2_.setDuration(Duration.seconds(r));
	transition2_.setNode(playero2);
	transition2_.setToY(700);
	transition2_.play();
	transition2_.setOnFinished((e) ->{
		if((fx2<=100 && fx2>=10)||(fx2<=670 && fx2>=420)) {
			++scr;
			score.setText("Score: "+scr);
		//	Media pick = new Media(Paths.get("win.mp3").toUri().toString());
		//	MediaPlayer player1 = new MediaPlayer(pick);
		//	player1.play();
		}
	
	});
}

public void paraopen3() {
	playero3.setManaged(false);
	
	
	 playero3.setOnMousePressed(e -> {
         startDragX = e.getSceneX();
         flag3 = 1;
     });
	 
     playero3.setOnMouseDragged(e -> {
    	
    	 if(flag3 ==1) {
    	 double X = e.getSceneX();
    	  if(X - startDragX > 0) {
    		  x2 = x2 + 20;
    		  fx3 = x2;
    		  playero3.setTranslateX(x2);
    		  flag3 = 0;
    	  }
    	 else if (X - startDragX  < 0) {
    		  x2 = x2 - 20;
    		  fx3 = x2;
    		  playero3.setTranslateX(x2);
    		  flag3 = 0;
    	 }
    	 }
     });
	
	//This code makes the player move downwards continuously 
     double r = ((700-y2)*19)/(700-y);
    transition3_.setDuration(Duration.seconds(r));
	transition3_.setNode(playero3);
	transition3_.setToY(700);
	transition3_.play();
	transition3_.setOnFinished((e) ->{
		if((fx3<=100 && fx3>=10)||(fx3<=670 && fx3>=420)) {
			++scr;
	//		score.setText("Score:. "+scr);
	//		Media pick = new Media(Paths.get("win.mp3").toUri().toString());
		//	MediaPlayer player1 = new MediaPlayer(pick);
		//	player1.play();
		}
		
	});
}

public void paraopen4() {
	playero4.setManaged(false);
	 playero4.setOnMousePressed(e -> {
         startDragX = e.getSceneX();
         flag4 = 1;
     });
	 
     playero4.setOnMouseDragged(e -> {
    	
    	 if(flag4 ==1) {
    	 double X = e.getSceneX();
    	  if(X - startDragX > 0) {
    		  x3 = x3 + 20;
    		  fx4 = x3;
    		  playero4.setTranslateX(x3);
    		  flag4 = 0;
    	  }
    	 else if (X - startDragX  < 0) {
    		  x3 = x3 - 20;
    		  fx4 = x3;
    		  playero4.setTranslateX(x3);
    		  flag4 = 0;
    	 }
    	 }
     });
	
	//This code makes the player move downwards continuously 
     double r = ((700-y3)*19)/(700-y);
    transition4_.setDuration(Duration.seconds(r));
	transition4_.setNode(playero4);
	transition4_.setToY(700);
	transition4_.play();
	transition4_.setOnFinished((e) ->{
		if((fx4<=100 && fx4>=10)||(fx4<=670 && fx4>=420)) {
			++scr;
			score.setText("Score: "+scr);
		//	Media pick = new Media(Paths.get("win.mp3").toUri().toString());
		//	MediaPlayer player = new MediaPlayer(pick);
		//	player.play();
		}
		
	});
}

public void paraopen5() {
	playero5.setManaged(false);
	
	
	 playero5.setOnMousePressed(e -> {
         startDragX = e.getSceneX();
         flag5 = 1;
     });
	 
     playero5.setOnMouseDragged(e -> {
    	
    	 if(flag5 ==1) {
    	 double X = e.getSceneX();
    	  if(X - startDragX > 0) {
    		  x4 = x4 + 20;
    		  fx5 = x4;
    		  playero5.setTranslateX(x4);
    		  flag5 = 0;
    	  }
    	 else if (X - startDragX  < 0) {
    		  x4 = x4 - 20;
    		  fx5 = x4;
    		  playero5.setTranslateX(x4);
    		  flag5 = 0;
    	 }
    	 }
     });
	
	//This code makes the player move downwards continuously 
     double r = ((700-y4)*19)/(700-y);
    transition5_.setDuration(Duration.seconds(r));
	transition5_.setNode(playero5);
	transition5_.setToY(700);
	transition5_.play();
	transition5_.setOnFinished((e) ->{
		if((fx5<=100 && fx5>=10)||(fx5<=670 && fx5>=420)) {
			++scr;
			score.setText("Score: "+scr);
		//	Media pick = new Media(Paths.get("win.mp3").toUri().toString());
		//	MediaPlayer player = new MediaPlayer(pick);
		//	player.play();
		}
	
	});
}

public void paraopen6() {
	playero6.setManaged(false);
	
	
	 playero6.setOnMousePressed(e -> {
         startDragX = e.getSceneX();
         flag6 = 1;
     });
	 
     playero6.setOnMouseDragged(e -> {
    	
    	 if(flag6 ==1) {
    	 double X = e.getSceneX();
    	  if(X - startDragX > 0) {
    		  x5 = x5 + 20;
    		  fx6 = x5;
    		  playero6.setTranslateX(x5);
    		  flag6 = 0;
    	  }
    	 else if (X - startDragX  < 0) {
    		  x5 = x5 - 20;
    		  fx6 = x5;
    		  playero6.setTranslateX(x5);
    		  flag6 = 0;
    	 }
    	 }
     });
	
	//This code makes the player move downwards continuously
     double r = ((700-y5)*19)/(700-y);
    transition6_.setDuration(Duration.seconds(r));
	transition6_.setNode(playero6);
	transition6_.setToY(760);
	transition6_.play();
	transition6_.setOnFinished((e) ->{
		if((fx6<=100 && fx6>=10)||(fx6<=670 && fx6>=420)) {
			++scr;
			score.setText("Score:. "+scr);
		//	Media pick = new Media(Paths.get("win.mp3").toUri().toString());
		//	MediaPlayer player = new MediaPlayer(pick);
		//	player.play();
		}
		
	});
}

}
