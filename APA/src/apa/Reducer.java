/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apa;

import pipelines.Consumer;
import pipelines.Pipe;

/**
 *
 * @author suejanehan
 */
public class Reducer extends Consumer<Data>{

    public Reducer(Pipe inPipe) {
        super(inPipe);
    }
    public void consume(Data input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
