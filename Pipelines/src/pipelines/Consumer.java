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
public abstract class Consumer<Data> extends Filter{
    public Pipe inPipe;
    public Consumer(Pipe inPipe){
        this.inPipe=inPipe;
    }
    public abstract void consume(Message<Data> input);
    public abstract void start();
}
