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
    }
    public static void main(String[] args) {
        GarbageBand gb = new GarbageBand(true);
        System.out.println("Inside main function of GarbageBand");
        Filter composer = new Composer();
        Filter amplifier = new Amplifier();
        Filter frequencyFilter = new FrequencyFilter();
        Filter durationFilter = new DurationFilter();
        Filter amplitudeFilter = new AmplitudeFilter();
        Filter player = new Player();
        GarbageBand.connect(composer,amplifier);
        GarbageBand.connect(amplifier,frequencyFilter);
        GarbageBand.connect(frequencyFilter,durationFilter);
        GarbageBand.connect(durationFilter,amplitudeFilter);
        GarbageBand.connect(amplitudeFilter,player);
        composer.start();
    }

 
}
