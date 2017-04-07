/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelines;

/**
 *
 * @author suejanehan
 */
public abstract class Transformer<Data> extends Filter{
    Pipe inPipe;
    Pipe outPipe;
    public Transformer(Pipe inPipe, Pipe outPipe){
        inPipe=inPipe;
        outPipe=outPipe;
    }
    public abstract Message<Data> transform(Message<Data> msg);
}
