package ch6.party;

public class Stereo implements Command{
    String location;
    public Stereo(String loc) {
        this.location = loc;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }

    public void off() {
    }

    public void on() {
    }
}
