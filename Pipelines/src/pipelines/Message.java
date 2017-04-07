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
public class Message<Data> {
    private Data content;
    private Boolean quit;
    private Boolean fail;
    public Message(Data content){
        content=content;
    }
    private Data getContent(){
        return content;
    }
    public void setContent(Data content){
        this.content=content;
    }
}
