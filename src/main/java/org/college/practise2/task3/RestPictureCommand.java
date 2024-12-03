package org.college.practise2.task3;

public class RestPictureCommand extends AbstractCommand {
    private String _name;

    public RestPictureCommand(String _name) {
        this._name = _name;
    }

    @Override
    public void execute() {
        System.out.println("Picture " + this._name + " under restoration");
    }

    @Override
    public void undo() {
        System.out.println("The picture is back in the hall ");
    }

    @Override
    public String toString() {
        return "RestPictureCommand{" +
                "_name='" + _name + '\'' +
                '}';
    }
}
