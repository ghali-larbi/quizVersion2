/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;
import jaco.mp3.player.MP3Player;
import java.awt.*; 
import java.awt.Color;
import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btn1;
    @FXML
    private Label label2;
    @FXML
    private RadioButton r1;
    @FXML
    private RadioButton r3;
    @FXML
    private RadioButton r1_2;
    @FXML
    private RadioButton r2_2;
    @FXML
    private RadioButton r3_2;
    @FXML
    private RadioButton r1_3;
    @FXML
    private RadioButton r2_3;
    @FXML
    private RadioButton r1_4;
    @FXML
    private ToggleGroup r4;
    @FXML
    private RadioButton r2_4;
    @FXML
    private RadioButton r3_4;
    @FXML
    private RadioButton r1_5;
    @FXML
    private RadioButton r2_5;
    @FXML
    private RadioButton r3_5;
    @FXML
    private ToggleGroup r5;
    @FXML
    private ToggleGroup group1;
    @FXML
    private ToggleGroup group2;
    @FXML
    private ToggleGroup group3;
    @FXML
    private Pane p;
    @FXML
    private ToggleGroup group4;
    @FXML
    private ToggleGroup group5;
    @FXML
    private ToggleGroup group6;
    @FXML
    private ToggleGroup group7;
    @FXML
    private Button btn2;
    @FXML
    private Pane p2;
    @FXML
    private RadioButton rn1;
    @FXML
    private RadioButton rn2;
    @FXML
    private RadioButton rn3;
    @FXML
    private RadioButton rn1_2;
    @FXML
    private RadioButton rn2_2;
    @FXML
    private RadioButton rn3_2;
    @FXML
    private RadioButton rn1_3;
    @FXML
    private RadioButton rn2_3;
    @FXML
    private RadioButton rn1_4;
    @FXML
    private RadioButton rn2_4;
    @FXML
    private RadioButton rn3_4;
    @FXML
    private RadioButton rn1_5;
    @FXML
    private ToggleGroup group8;
    @FXML
    private RadioButton rn2_5;
    @FXML
    private RadioButton rn3_5;
    @FXML
    private Pane p3;
    @FXML
    private RadioButton rn3_1;
    @FXML
    private ToggleGroup group11;
    @FXML
    private RadioButton rn3_21;
    @FXML
    private RadioButton rn3_3;
    @FXML
    private RadioButton rn3_11;
    @FXML
    private ToggleGroup group12;
    @FXML
    private RadioButton rn3_22;
    @FXML
    private RadioButton rn3_111;
    @FXML
    private ToggleGroup group13;
    @FXML
    private RadioButton rn3_222;
    @FXML
    private RadioButton rn3_44;
    @FXML
    private ToggleGroup group14;
    @FXML
    private RadioButton rn3_55;
    @FXML
    private RadioButton rn3_7;
    @FXML
    private ToggleGroup group15;
    @FXML
    private RadioButton rn3_777;
    @FXML
    private RadioButton rn3_77;
    @FXML
    private Button btn3;
    @FXML
    private Label lb1;
    @FXML
    private Label time;
    
    static MP3Player mp3;
    Timer timer;
      TimerTask task;
    @FXML
    private Button btnCommencer;
    @FXML
    private Pane paneCommencer;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
      
      int score=0;
				if(r3.isSelected()) {
		    		score=score+20;
                              
                              r3.setStyle("-fx-text-fill:GREEN");
		    	         }
                                if(r2_2.isSelected()) {
		    		score=score+20;	
                                 r2_2.setStyle("-fx-text-fill:GREEN");

		    	         }
                                if(r2_3.isSelected()) {
		    		score=score+20;	
                                 r2_3.setStyle("-fx-text-fill:GREEN");

		    	         }
                                if(r2_4.isSelected()) {
		    		score=score+20;	
                                 r2_4.setStyle("-fx-text-fill:GREEN");

		    	         }
                                if(r1_5.isSelected()) {
		    		score=score+20;	
                                 r1_5.setStyle("-fx-text-fill:GREEN");

		    	         }
                                if(score>=40){
                                p.setVisible(false);

                                p2.setVisible(true);
                                p2.setLayoutY(30);
                                }
                                else{
                               JOptionPane.showMessageDialog(null, "vous ne pouver pas passer au niveau 2", "Alert", JOptionPane.ERROR_MESSAGE);
                            
                                }	
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        p.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
       
    }    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        int score2 = 0;
					  if(rn3.isSelected()) {
				    		score2=score2+20;
                                                rn3.setStyle("-fx-text-fill:GREEN");
				    	}
						 if(rn2_2.isSelected()) {
							score2=score2+20;
                                                        rn2_2.setStyle("-fx-text-fill:GREEN");
						}
						 if(rn2_3.isSelected()) {
							 score2=score2+20;
                                                        rn2_3.setStyle("-fx-text-fill:GREEN");
						 }
						 if(rn2_4.isSelected()) {
							 score2=score2+20;
                                                         rn2_4.setStyle("-fx-text-fill:GREEN");
						 }
						 if(rn2_5.isSelected()) {
							 score2=score2+20;
                                                         rn2_5.setStyle("-fx-text-fill:GREEN");
						 }
                                                  if(score2>=60){
                               
                                p2.setVisible(false);
                                p3.setVisible(true);
                                p3.setLayoutY(30);
                                }
                                else{
                               JOptionPane.showMessageDialog(null, "vous ne pouver pas passer au niveau 2", "Alert", JOptionPane.ERROR_MESSAGE);
                              
                                }
    }

    @FXML
    private void handleButtonAction3(ActionEvent event) {
         int score3 = 0;
						  if(rn3_21.isSelected()) {
					    		score3=score3+20;
                                                   rn3_21.setStyle("-fx-text-fill:GREEN");
					    	}
							 if(rn3_11.isSelected()) {
								score3=score3+20;
						            rn3_11.setStyle("-fx-text-fill:GREEN");		
							}
							 if(rn3_222.isSelected()) {
								 score3=score3+20;
							        rn3_222.setStyle("-fx-text-fill:GREEN");	
							 }
							 if(rn3_55.isSelected()) {
								 score3=score3+20;
							     rn3_55.setStyle("-fx-text-fill:GREEN");	
							 }
							 if(rn3_77.isSelected()) {
								 score3=score3+20;
                                                         rn3_77.setStyle("-fx-text-fill:GREEN");       
							 }
                                                         if(score3>=80){
                                                         JOptionPane.showMessageDialog(null, "you win", "InfoBox: ",JOptionPane.INFORMATION_MESSAGE);
                                                         }
                                                         else
                                                         {
                                                        JOptionPane.showMessageDialog(null, "vous ne pouver pas passer au niveau 2", "Alert", JOptionPane.ERROR_MESSAGE);
 
                                                         }
    }

    @FXML
    private void commencer(ActionEvent event) {
        paneCommencer.setVisible(false);
        p.setVisible(true);
        p.setLayoutY(20);
           timer = new Timer();
    timer.scheduleAtFixedRate(new TimerTask() {
        int i=0;
        @Override
        public void run() {
           
            Platform.runLater(() -> {
                  if(i<=300){
                      time.setText("timer:"+i+++"s");
                  }
                   
            });
            if(i>300){
                JOptionPane.showMessageDialog(null, "time over", "Alert", JOptionPane.ERROR_MESSAGE);
                 timer.scheduleAtFixedRate(this, 0, 0);
            }
        }
    }, 1000, 1000);
  try{
     String song="C:\\Users\\DELL\\Documents\\NetBeansProjects\\quiz2\\music\\kahoot-lobby-music.mp3";
     MP3Player mp3=new MP3Player(new File(song));
     mp3.play();
  }
  catch(Exception e)
  {
      JOptionPane.showMessageDialog(null,"error");
  }       
    }

    
}
