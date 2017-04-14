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
public abstract class Filter<Data> implements Subscriber{
    protected Pipe<Data> inPipe,outPipe;

    public Filter(){
        
    }
    public Filter(Pipe<Data> inPipe,Pipe<Data> outPipe){
        this.inPipe=inPipe;
        this.outPipe=outPipe;
    }
    public void setInputPipe(Pipe<Data> inputPipe){
        this.inPipe = inputPipe;
        if(Pipeline.DATA_DRIVEN){
            inPipe.subscribe(this);
        }
    }
    public void setOutputPipe(Pipe<Data> outputPipe){
        this.outPipe = outputPipe;
    }

    public void start() {
    }

}
