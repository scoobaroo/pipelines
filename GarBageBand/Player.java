/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarBageBand;

/**
 *
 * @author suejanehan
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import pipelines.Consumer;
import pipelines.Message;

/**
 *
 * @author suejanehan
 */
public class Player extends Consumer<Note>{
    float frequency = 44100;

    public Player() {
    }
    
    public void consume(Note note) {
        System.out.println("Inside consumer function of player");
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel channel = synth.getChannels()[0];
            channel.noteOn( note.frequency , note.amplitude );
            Thread.sleep(note.duration);
            channel.noteOff(note.frequency, note.amplitude);
        } catch (MidiUnavailableException | InterruptedException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void start() {
        super.start();
    }
    
    public void activate(){
        Message<Note> msg = inPipe.read();
        consume(msg.getContent()); // do something to val
    }
}
