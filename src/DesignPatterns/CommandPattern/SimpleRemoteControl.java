package DesignPatterns.CommandPattern;

public class SimpleRemoteControl {

    Command slot;  // only one button

    public void setCommand(Command command)
    {
        // set the command the remote will
        // execute
        slot = command;
    }

    public void buttonWasPressed()
    {
        slot.execute();
    }

}
