/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.media.AudioClip;

/**
 *
 * @author mguay22
 */
public class Sounds {
    private AudioClip snare, kick, handClap, openHh, rimshot, hiConga, maracas, cowbell, crashcym,
            mutedFunk, crunchy, slowFunk, spiritFunk, stretchy, onebar, hiphop, riffer, solid;
    
    public void playSnare() {
        snare = new AudioClip(getClass().getResource("/sounds/snare.aif").toExternalForm());
        snare.play();
    }
    
    public void playKick() {
        kick = new AudioClip(getClass().getResource("/sounds/kick1.aif").toExternalForm());
        kick.play();
    }
    
    public void playHandClap() {
        handClap = new AudioClip(getClass().getResource("/sounds/handclap.aif").toExternalForm());
        handClap.play();
    }
    
    public void playOpenHh() {
        openHh = new AudioClip(getClass().getResource("/sounds/open_hh.aif").toExternalForm());
        openHh.play();
    }
    
    public void playRimShot() {
        rimshot = new AudioClip(getClass().getResource("/sounds/rimshot.aif").toExternalForm());
        rimshot.play();
    }
    
    public void playHiConga() {
        hiConga = new AudioClip(getClass().getResource("/sounds/hi_conga.aif").toExternalForm());
        hiConga.play();
    }
    
    public void playMaracas() {
        maracas = new AudioClip(getClass().getResource("/sounds/maracas.aif").toExternalForm());
        maracas.play();
    }
    
    public void playCowbell() {
        cowbell = new AudioClip(getClass().getResource("/sounds/cowbell.aif").toExternalForm());
        cowbell.play();
    }
    
    public void playCrashCym() {
        crashcym = new AudioClip(getClass().getResource("/sounds/crashcym.aif").toExternalForm());
        crashcym.play();
    }
    
    public void playMutedFunk() {
        mutedFunk = new AudioClip(getClass().getResource("/sounds/070_muted_funkiness2.aif").toExternalForm());
        mutedFunk.play();
    }
    
    public void playCrunchy() {
        crunchy = new AudioClip(getClass().getResource("/sounds/081_deeply-crunchy-guitar-stutter-funk.wav").toExternalForm());
        crunchy.play();
    }
    
    public void playSlowFunk() {
        slowFunk = new AudioClip(getClass().getResource("/sounds/082_revecho_slowfunk.aif").toExternalForm());
        slowFunk.play();
    }
    
    public void playSpiritFunk() {
        spiritFunk = new AudioClip(getClass().getResource("/sounds/090_forest-spiritfunk.aif").toExternalForm());
        spiritFunk.play();
    }
    
    public void playStretchy() {
        stretchy = new AudioClip(getClass().getResource("/sounds/090_stretchy-funk.wav").toExternalForm());
        stretchy.play();
    }
    
    public void playOnebar() {
        onebar = new AudioClip(getClass().getResource("/sounds/092-mr-browns-onebar-funk.wav").toExternalForm());
        onebar.play();
    }
    
    public void playHiphop() {
        hiphop = new AudioClip(getClass().getResource("/sounds/093_hiphop-con-funky-string.wav").toExternalForm());
        hiphop.play();
    }
    
    public void playRiffer() {
        riffer = new AudioClip(getClass().getResource("/sounds/095_funky-guitar-riffer.aif").toExternalForm());
        riffer.play();
    }
    
    public void playSolid() {
        solid = new AudioClip(getClass().getResource("/sounds/105_solidfunk.aif").toExternalForm());
        solid.play();
    }
    
    
}
