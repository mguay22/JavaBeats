/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.FXMLDocumentController;
import java.util.Date;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 *
 * @author mguay22
 */
public class Timer {
    private Label timerLabel;
    private KeyFrame frame;
    private Timeline timeline;
    public static String stringSeconds;
    private int seconds;

    
    public void setTimerLabel(Label timerLabel) {
        this.timerLabel = timerLabel;
        stringSeconds = "0s";
        
        timerLabel.setText(stringSeconds);
        seconds = 0;
    }
    
    class TimeHandler implements EventHandler<ActionEvent> {
          @Override
          public void handle(ActionEvent e) {;
            stringSeconds = Integer.toString(seconds);
            timerLabel.setText(stringSeconds + "s");
            seconds++;   
          }
      }

    public void startTimer() {
        frame = new KeyFrame(Duration.seconds(1), new TimeHandler());
        timeline = new Timeline(frame);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
    
    public void stopTimer() {
        timeline.stop();
        stringSeconds = Integer.toString(seconds) + "s";
        seconds = 0;
    }
    
    public void reset() {
        seconds = 0;
        stringSeconds = Integer.toString(seconds) + "s";
        timerLabel.setText(stringSeconds);
    }
}
