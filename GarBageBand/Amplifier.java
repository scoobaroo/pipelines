package GarBageBand;

import pipelines.Message;
import pipelines.Pipe;
import pipelines.Transformer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author suejanehan
 */
public class Amplifier<Note> extends Transformer<Note>{

    public Amplifier(Pipe inPipe, Pipe outPipe) {
        super(inPipe, outPipe);
    }
    
    public Message<Note> transform(Message<Note> msg){
        Note note = (Note) msg.content;
        note.amplitude=10*note.amplitude;
        return new Message(note);
    }
    
    public void activate(){
        Message val = inPipe.read();
        val = transform(val); // do something to val
        outPipe.write(val);
    }
    
    @Override

    public void update() {
    }
}
