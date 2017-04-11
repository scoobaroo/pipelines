/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarBageBand;

import pipelines.Message;
import pipelines.Pipe;
import pipelines.Tester;
/**
 *
 * @author suejanehan
 */
public class NoiseFilter extends Tester{

    public NoiseFilter(Pipe inPipe, Pipe outPipe) {
        super(inPipe, outPipe);
    }
    
    public void activate(){
        Message val = inPipe.read();
        Boolean validity = test(val); // do something to val
        if (validity){
            outPipe.write(val);
        }
    }
    @Override
    public Boolean test(Message msg) {
        return true;
    }

    @Override
    public void write(Message msg) {
        outPipe.write(msg);
    }

    @Override
    public void update() {
    }
    
}
