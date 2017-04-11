package pipelines;


import pipelines.AbstractFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suejanehan
 */
public class Assembly {
    private Transformer transformer;
    private Producer producer;
    private Tester tester;
    private Consumer consumer;
    Pipe pipe1;
    Pipe pipe2;
    Pipe pipe3;
    public Assembly(AbstractFactory factory) {
        transformer = factory.makeTransformer(pipe1,pipe2);
        producer = factory.makeProducer(pipe1);
        tester = factory.makeTester(pipe2,pipe3);
        consumer = factory.makeConsumer(pipe3);
    }
}
