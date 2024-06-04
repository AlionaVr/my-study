package main.java.playground.aliona.newproject.Sounds;
import javax.sound.midi.*;
public class MiniMusicApp {
    public static void main(String[] args) {
        MiniMusicApp mini = new MiniMusicApp();
        mini.play();
    }

    public void play() {

        try {

            // make (and open) a sequencer, make a sequence and track

            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            // now make two midi events (containing a midi message)
            MidiEvent event = null;

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            sequencer.setSequence(seq);
            sequencer.start();
            // new
            Thread.sleep(1000);
            sequencer.close();
            System.exit(0);
        } catch (Exception ex) {ex.printStackTrace();}
    } // close play

} // close class