/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apa;

import pipelines.Pipe;
import pipelines.Transformer;

/**
 *
 * @author suejanehan
 */
public class Map extends Transformer<Data>{

    public Map(Pipe inPipe, Pipe outPipe) {
        super(inPipe, outPipe);
    }
    public Data transform(Data data){
        return;
    };
}
