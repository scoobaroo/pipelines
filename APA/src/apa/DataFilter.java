/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apa;

import pipelines.Message;
import pipelines.Pipe;
import pipelines.Tester;

/**
 *
 * @author suejanehan
 */
public class DataFilter extends Tester<Data>{

    public DataFilter(Pipe inPipe, Pipe outPipe) {
        super(inPipe, outPipe);
    }

    @Override
    public Boolean test(Data msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void write(Message<Data> msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
