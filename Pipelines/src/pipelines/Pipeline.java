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
public class Pipeline{

    public static boolean DATA_DRIVEN;

    /**
     * @param args the command line arguments
     */

    public Pipeline(boolean bool){
        this.DATA_DRIVEN = bool;
    }
    
    public static void connect(Filter filter1,Filter filter2){
        Pipe pipe= new Pipe();
        if (DATA_DRIVEN) pipe.subscribe(filter2);
        else pipe.subscribe(filter1);
        filter1.setOutputPipe(pipe);
        filter2.setInputPipe(pipe);
    }
    
    public static void main(String[] args) {
        System.out.println("Inside Pipelines Application");// TODO code application logic here
    }
    
}
