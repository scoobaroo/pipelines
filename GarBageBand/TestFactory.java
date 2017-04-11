package GarBageBand;
import pipelines.Assembly;
import pipelines.AbstractFactory;
import pipelines.Pipe;
import pipelines.Producer;
import pipelines.Tester;
import org.jfugue.player.Player;

/**
 *
 * @author suejanehan
 */
class TestFactory implements AbstractFactory {
    public Amplifier makeTransformer(Pipe inPipe, Pipe outPipe) {
            return new Amplifier(inPipe, outPipe);
    }
    public MyPlayer makeConsumer(Pipe inPipe) {
            return new MyPlayer(inPipe);
    }
    public NoiseFilter makeTester(Pipe inPipe, Pipe outPipe) {
            return new NoiseFilter(inPipe,outPipe);
    }
    public DigitalComposer makeProducer(Pipe outPipe) {
            return new DigitalComposer(outPipe);
    }

    public static void main(String[] args) {
            System.out.println("Inside main function of TestFactory")
            Pipe pipe1 = new Pipe();
            Pipe pipe2 = new Pipe();
            Pipe pipe3 = new Pipe();
            Assembly a = new Assembly(new TestFactory());
            TestFactory tf = new TestFactory();
            DigitalComposer digitalComposer = tf.makeProducer(pipe1);
            Amplifier amplifier = tf.makeTransformer(pipe1,pipe2);
            NoiseFilter noiseFilter = tf.makeTester(pipe2,pipe3);
            MyPlayer myplayer = tf.makeConsumer(pipe3);
            Player player = new Player();
            while(true){
                player.play("C D E F G A B");
            }
    }

}
