/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarBageBand;

import pipelines.Message;
import pipelines.Pipe;
import pipelines.Producer;
import java.util.Random;

/**
 *
 * @author suejanehan
 */
public class Composer extends Producer<Note>{

    public Composer() {

    }
    
    public Note produce() {
        for(int i=0;i<50;i++){
            Note note = generate();
            Message msg = new Message(note);
            outPipe.write(msg);
            return note;
        }
        return null;
    }
    
    public Note generate() {
        Random rand = new Random();
        int frequency = rand.nextInt(127);
        int amplitude = rand.nextInt(1000);
        int duration = rand.nextInt(1000);
        Note note = new Note(frequency,amplitude,duration);
        return note;
    }

    @Override
    public void update() {
    }

    @Override
    public void start() {
        System.out.println("Composer started producing notes");
        produce();
    }
    
}
