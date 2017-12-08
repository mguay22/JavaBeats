/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.FXMLDocumentController;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import javabeats.JavaBeats;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.DirectoryChooser;


/**
 *
 * @author mguay22
 */
public class Record {
    private File file;
    private int fileCount;
    private FileWriter writer;
    
    public Record() throws IOException {
        fileCount = 0;
        file = new File("/Users/mguay22/Desktop/Empty.txt");
        writer = new FileWriter(file);
        fileCount++;
    }
    
    public void addSound(int soundNum, String duration) throws IOException {
        String stringSoundNum = Integer.toString(soundNum);
        writer.write(stringSoundNum + "\n" + duration + "\n");
    }
    
    public boolean closeFile() throws IOException {
        writer.write(FXMLDocumentController.currentSoundType);
        writer.close();
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Save File");
        alert.setHeaderText("Save Recording");
        alert.setContentText("Would you like to save this recording?");

        Optional<ButtonType> result = alert.showAndWait();
        
        if (result.get() == ButtonType.OK) {
            TextInputDialog dialog = new TextInputDialog("My Recording");
            dialog.setTitle("Save File");
            dialog.setHeaderText("Save Recording");
            dialog.setContentText("Name your recording:");
            
            Optional<String> name = dialog.showAndWait();
                   
            DirectoryChooser chooser = new DirectoryChooser();
            chooser.setTitle("Save File");
            File defaultDirectory = new File("/Users/mguay22/Desktop");
            chooser.setInitialDirectory(defaultDirectory);
            File selectedDirectory = chooser.showDialog(JavaBeats.stage);
            String stringSelectedDirectory = selectedDirectory.toString();
            
            File newFile = new File(stringSelectedDirectory + "/" + name.get() + ".txt");
                        
            file.renameTo(newFile);
            file = newFile;
            
            return true;
            
        } else {
            file.delete();
            return false;
        }
    }
    
    public File getFile() {
        return file;
    }
}
