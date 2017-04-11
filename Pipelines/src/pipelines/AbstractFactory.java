package pipelines;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suejanehan
 */
public interface AbstractFactory {
    Consumer makeConsumer(Pipe inPipe);
    Producer makeProducer(Pipe outPipe);
    Tester makeTester(Pipe inPipe, Pipe outPipe);
    Transformer makeTransformer(Pipe inPipe, Pipe outPipe);
}
