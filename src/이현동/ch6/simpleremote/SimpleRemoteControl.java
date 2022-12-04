package ch6.simpleremote;

public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
