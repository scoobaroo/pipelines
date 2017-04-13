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
    public static Boolean DATA_DRIVEN = true;
    Message<Data> message;
    Filter inFilter;
    Filter outFilter;
    public Pipe(){
        
    }
    public Message<Data> read(){
        if(!DATA_DRIVEN){
            notifySubscribers();
        }
        return this.message;
    }
    public void write(Message<Data> msg){
        this.message = msg;
        if(DATA_DRIVEN){
            notifySubscribers();
        }
    }
}
