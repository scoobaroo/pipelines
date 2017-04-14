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
public class Amplifier extends Transformer<Note>{
    
    float magnitude = 2;
    public Amplifier() {
    }
    
    @Override
    public Note transform(Note note){
        System.out.println("Inside transform function of amplifier");
        note.amplitude = (int)  magnitude*note.amplitude;
        return note;
    }
    
    @Override
    public void update(){
        Message<Note> message = inPipe.read();
        Note note = message.getContent();
        Note newNote = transform(note); // do something to val
        Message newMessage = new Message(newNote);
        outPipe.write(newMessage);
    }

}
