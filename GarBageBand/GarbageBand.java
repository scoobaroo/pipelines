package GarBageBand;
import pipelines.Pipe;
import pipelines.Producer;
import pipelines.Tester;
import javax.sound.midi.*;
import pipelines.Filter;
import pipelines.Pipeline;
/**
 *
 * @author suejanehan
 */

public class GarbageBand extends Pipeline{

    private Note amplify(Note n){
        if(n.amplitude<50) n.amplitude = 50;
        if(n.amplitude>127) n.amplitude =127;
        return n;
    }
    public boolean testFrequency(Note n){
        return 0<=n.frequency && n.frequency<=127;
    }
    public boolean testDuration(Note n){
        return 0<=n.duration && n.duration<1500;
    }
    public GarbageBand(boolean dataDriven){
        super(dataDriven);
        Filter composer = new Composer();
        Filter amplifier = new Amplifier();
        Filter frequencyFilter = new FrequencyFilter();
        Filter durationFilter = new DurationFilter();
        Filter amplitudeFilter = new AmplitudeFilter();
        Filter player = new Player();
        connect(composer,amplifier);
        connect(amplifier,frequencyFilter);
        connect(frequencyFilter,durationFilter);
        connect(durationFilter,amplitudeFilter);
        connect(amplitudeFilter,player);
    }
    public static void main(String[] args) {
        public Pipe pipe0 = new Pipe();
        public Pipe pipe1 = new Pipe();
        public Pipe pipe2 = new Pipe();
        public Pipe pipe3 = new Pipe();
        public Pipe pipe4 = new Pipe();
//        setProducer(composer::makeNote);
//        setConsumer(player::play);
        public Filter<Note> composer = new Composer(pipe0);
        public Filter<Note> amplifier = new Amplifier(pipe0,pipe1);
        public Filter<Note> frequencyFilter = new FrequencyFilter(pipe1,pipe2);
        public Filter<Note> durationFilter = new DurationFilter(pipe2,pipe3);
        public Filter<Note> amplitudeFilter = new AmplitudeFilter(pipe3,pipe4);
        public Filter<Note> player = new Player(pipe4);
    
        GarbageBand gb = new GarbageBand(true);
        System.out.println("Inside main function of GarbageBand");
        composer.start();
    }

 
}
