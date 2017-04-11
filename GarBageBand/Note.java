/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarBageBand;

import org.jfugue.player.Player;

/**
 *
 * @author suejanehan
 */
public class Note {
    public String frequency;
    public float duration;
    public float amplitude;
    public Note(String freq, float amp, float dur){
        this.frequency=freq;
        this.amplitude=amp;
        this.duration=dur;
    }
    public void play (Note note){
        Player player = new Player();
    }
}
