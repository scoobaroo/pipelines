/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarBageBand;

import pipelines.Message;
import pipelines.Pipe;
import pipelines.Producer;

/**
 *
 * @author suejanehan
 */
public class DigitalComposer extends Producer{

    public DigitalComposer(Pipe outPipe) {
        super(outPipe);
    }
    
    public void activate(){
        produce(outPipe);
    }
    
    @Override
    public void produce(Pipe outPipe) {
        Message<Note> msg = generate();
        outPipe.write(msg);
    }
    
    @Override
    public Message<Note> generate() {
        Note note = new Note("A",2.0f,3.0f);
        return new Message(note);
    }

    @Override
    public void update() {
    }

    @Override
    public void start() {
        activate();
    }
    
}
