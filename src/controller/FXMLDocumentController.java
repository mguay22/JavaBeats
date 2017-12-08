/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javabeats.JavaBeats;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import model.Open;
import model.Record;
import model.Sounds;
import model.Timer;

/**
 *
 * @author mguay22
 */
public class FXMLDocumentController implements Initializable {
    
    private Sounds sounds;
    private Timer timer;
    private Record recorder;
    private boolean recording;
    private Open open;
    private long startTime;
    private ArrayList soundsList;
    public static String currentSoundType;
    
    @FXML
    private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, 
            timerStop, timerStart, playBack, buttonSix;
    
    @FXML
    private Label timerDisplay, onDeck;
    
    @FXML
    private ChoiceBox soundType;
    
    public FXMLDocumentController() {
        sounds = new Sounds();
        timer = new Timer();
        recording = false;
        soundsList = new ArrayList<>();
    }
    
    @FXML    
    public void keyPress(KeyEvent event) throws IOException {
        String soundNum = event.getText();
        int intSoundNum = Integer.parseInt(soundNum);
        playSound(intSoundNum);
                
    }
    
    public void playSound(int soundNum) throws IOException {
        switch (soundNum) {
            case 1:
                buttonOne.requestFocus();
                
                if (currentSoundType.equals("Percussion")) {
                    sounds.playSnare();
                } else {
                    sounds.playMutedFunk();
                }
                
                if (recording) {
                    
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1000000;
                    String stringDuration = Long.toString(duration);
                    
                    recorder.addSound(1, stringDuration);
                    
                    startTime = System.nanoTime();
                }
                break;
            case 2:
                buttonTwo.requestFocus();
                
                if (currentSoundType.equals("Percussion")) {
                    sounds.playKick();
                } else {
                    sounds.playCrunchy();
                }
                
                if (recording) {
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1000000;
                    String stringDuration = Long.toString(duration);
                    
                    recorder.addSound(2, stringDuration);
                    
                    startTime = System.nanoTime();
                }
                break;
            case 3:
                buttonThree.requestFocus();
                
                if (currentSoundType.equals("Percussion")) {
                    sounds.playHandClap();
                } else {
                    sounds.playSlowFunk();
                }
                
                if (recording) {
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1000000;
                    String stringDuration = Long.toString(duration);
                    
                    recorder.addSound(3, stringDuration);
                    
                    startTime = System.nanoTime();
                }
                break;
            case 4:
                buttonFour.requestFocus();
                
                if (currentSoundType.equals("Percussion")) {
                    sounds.playOpenHh();
                } else {
                    sounds.playSpiritFunk();
                }
                
                if (recording) {
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1000000;
                    String stringDuration = Long.toString(duration);
                    
                    recorder.addSound(4, stringDuration);
                    
                    startTime = System.nanoTime();
                }
                break;
            case 5:
                buttonFive.requestFocus();
                
                if (currentSoundType.equals("Percussion")) {
                    sounds.playRimShot();
                } else {
                    sounds.playStretchy();
                }
                
                if (recording) {
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1000000;
                    String stringDuration = Long.toString(duration);
                    
                    recorder.addSound(5, stringDuration);
                    
                    startTime = System.nanoTime();
                }
                break;
            case 6:
                buttonSix.requestFocus();
                
                if (currentSoundType.equals("Percussion")) {
                    sounds.playHiConga();
                } else {
                    sounds.playOnebar();
                }
                
                if (recording) {
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1000000;
                    String stringDuration = Long.toString(duration);
                    
                    recorder.addSound(6, stringDuration);
                    
                    startTime = System.nanoTime();
                }
                break;
            case 7:
                buttonSix.requestFocus();
                
                if (currentSoundType.equals("Percussion")) {
                    sounds.playMaracas();
                } else {
                    sounds.playHiphop();
                }
                
                if (recording) {
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1000000;
                    String stringDuration = Long.toString(duration);
                    
                    recorder.addSound(7, stringDuration);
                    
                    startTime = System.nanoTime();
                }
                break;
            case 8:
                buttonSix.requestFocus();
                
                if (currentSoundType.equals("Percussion")) {
                    sounds.playCowbell();
                } else {
                    sounds.playRiffer();
                }
                
                if (recording) {
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1000000;
                    String stringDuration = Long.toString(duration);

                    recorder.addSound(8, stringDuration);

                    startTime = System.nanoTime();
                }
                break;
            case 9:
            buttonSix.requestFocus();
            
            if (currentSoundType.equals("Percussion")) {
                sounds.playCrashCym();
            } else {
                sounds.playSolid();
            }
            
            if (recording) {
                long endTime = System.nanoTime();
                long duration = (endTime - startTime) / 1000000;
                String stringDuration = Long.toString(duration);

                recorder.addSound(9, stringDuration);

                startTime = System.nanoTime();
            }
            break;
            
            default:
                break;
        }
       
    }
    
    public void clear() {
        timerDisplay.setDisable(false);
        timer.reset();
        soundsList.clear();
        onDeck.setText("On Deck: Empty");
        playBack.setDisable(true);
        changeSoundType();
    }
    
    public void record() {
        timerStop.setDisable(false);
        timerDisplay.setDisable(false);
        timerStart.setDisable(true);
        
        try {
            recorder = new Record();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer.startTimer();
        recording = true;
    }
    
    public void stop() throws FileNotFoundException {
        timer.stopTimer();
        timerStart.setDisable(false);
        timerStop.setDisable(true);
        playBack.setDisable(false);
        
        try {
            if (!recorder.closeFile()) {
                clear();
            }
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        recording = false;
        
        onDeck.setText("On Deck: " + recorder.getFile().getName().substring(0, recorder.getFile().getName().length() - 4));
        open = new Open(recorder.getFile().toString());
        
        soundsList = open.openFile();
        timerDisplay.setDisable(true);
    }
    
    public void playBack() throws IOException, InterruptedException {        
        for (int i = 0; i < soundsList.size() - 1; i++) {
            int currentSound = Integer.parseInt((String)soundsList.get(i));
            
            if (i % 2 == 0) {
                playSound(currentSound);
            } else {
                if (i != 1) {
                    Thread.sleep(currentSound);
                }
            } 
        }
        
    }
    
    public void open() throws FileNotFoundException {
        soundsList.clear();
        
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(JavaBeats.stage);
        
        open = new Open(file.toString());
        soundsList = open.openFile();
        
        onDeck.setText("On Deck: " + file.getName().substring(0, file.getName().length() - 4));
        
        currentSoundType = (String)soundsList.get(soundsList.size() - 1);

        
        timerDisplay.setDisable(true);
        playBack.setDisable(false);
    }
    
    public void changeSoundType() {
        currentSoundType = (String)soundType.getValue();
        clear();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timer.setTimerLabel(timerDisplay);
        timerStop.setDisable(true);
        playBack.setDisable(true);
        currentSoundType = (String)soundType.getValue();
    }    
    
}
