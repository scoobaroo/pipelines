/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelines;

import java.util.Queue;

/**
 *
 * @author suejanehan
 */
public class Pipe<Data> extends Publisher{
    
    Queue<Message<Data>> queue;
    
    public Message<Data> read(){
        Message<Data> msg = queue.poll();
        return msg;
    }
    
    public void write(Message<Data> msg){
        queue.add(msg);
        return;
    }
    
}
