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
public abstract class Consumer<Data> extends Filter<Data>{
    public Consumer(){
    }
    public abstract void consume(Data input);
    public void start(){
        Message<Data> message = inPipe.read();
        while(true){
            Data data = message.content;
            consume(data);
            if(message.quit ==true){
                break;
            }
        }
    };
}
