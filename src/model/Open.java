/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author mguay22
 */
public class Open {
    private Scanner scanner;
    private File file;
    private ArrayList sounds;
    
    public Open(String URL) {
        file = new File(URL);
        sounds = new ArrayList<>();
    }
    
    public ArrayList openFile() throws FileNotFoundException {
        scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String soundNum = scanner.nextLine();
            sounds.add(soundNum);
        }
        
        return sounds;
    }
    
}
