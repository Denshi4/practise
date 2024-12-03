package org.college.practise2.task3.p2;

public class StopDishCommand extends AbstractCommand {
    private String _name;

    public StopDishCommand(String _name) {
        this._name = _name;
    }

    @Override
    public void execute() {
        System.out.println("Dish " + this._name + " stopped");
    }

    @Override
    public void undo() {
        System.out.println("The dish is back in the menu ");
    }

    @Override
    public String toString() {
        return "StopDishCommand{" +
                "_name='" + _name + '\'' +
                '}';
    }
}
