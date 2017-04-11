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
public abstract class Tester<Data> extends Filter<Data> {
    public Pipe inPipe;
    public Pipe outPipe;
    public Tester(Pipe inPipe, Pipe outPipe){
        this.inPipe=inPipe;
        this.outPipe=outPipe;
    }
    public abstract Boolean test(Message<Data> msg);
    public abstract void write(Message<Data> msg);
}
