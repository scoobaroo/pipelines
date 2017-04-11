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
public abstract class Producer<Data> extends Filter<Data>{
    public Pipe outPipe;
    public Producer(Pipe outPipe){
        this.outPipe=outPipe;
    };
    public abstract void produce(Pipe outPipe);
    public abstract Message<Data> generate();
    public abstract void start();
}
