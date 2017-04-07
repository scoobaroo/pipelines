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
public abstract class Producer<Data> extends Filter{
    Pipe outPipe;
    public Producer(Pipe outPipe){
        outPipe=outPipe;
    };
    public abstract Message<Data> produce();
    public abstract void generate();
}
