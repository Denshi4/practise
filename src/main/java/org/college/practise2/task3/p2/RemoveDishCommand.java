package org.college.practise2.task3.p2;

public class RemoveDishCommand extends AbstractCommand {
    private int tableNumber;

    public RemoveDishCommand(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public void execute() {
        System.out.println("Dish removed into table number " + this.tableNumber);
    }

    @Override
    public void undo() {
        System.out.println("Dish remove into back table ");
    }

    @Override
    public String toString() {
        return "RemoveDishCommand{" +
                "tableNumber=" + tableNumber +
                '}';
    }
}
