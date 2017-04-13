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

    /**
     * @param args the command line arguments
     */
    boolean DATA_DRIVEN = true;
    public Pipeline(boolean dataDriven){
        this.DATA_DRIVEN = dataDriven;
    }
    public void connect(Filter filter1,Filter filter2){
        Pipe pipe= new Pipe();
        filter1.setOutputPipe(pipe);
        filter2.setInputPipe(pipe);
    }
    
    public static void main(String[] args) {
        System.out.println("Inside Pipelines Application");// TODO code application logic here
    }
    
}
