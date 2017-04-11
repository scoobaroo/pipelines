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
import pipelines.Consumer;
import pipelines.Message;
import pipelines.Pipe;
import org.jfugue.player.Player;

/**
 *
 * @author suejanehan
 */
public class MyPlayer<Note> extends Consumer<Note>{

    public MyPlayer(Pipe inPipe) {
        super(inPipe);
    }
    
    public void consume(Message<Note> note) {
        Note realnote = note.content;
    }

    @Override
    public void update() {
    }
    
    @Override
    public void start() {
    }
    public void activate(){
        Message val = inPipe.read();
        consume(val); // do something to val
    }
}
