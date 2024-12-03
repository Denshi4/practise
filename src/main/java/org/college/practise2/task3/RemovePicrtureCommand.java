package org.college.practise2.task3;

public class RemovePicrtureCommand extends AbstractCommand{
    private int roomNumber;

    public RemovePicrtureCommand(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void execute() {
        System.out.println("Picture removed into room number " + this.roomNumber);
    }

    @Override
    public void undo() {
        System.out.println("Picture remove into back room ");
    }

    @Override
    public String toString() {
        return "RemovePicrtureCommand{" +
                "roomNumber=" + roomNumber +
                '}';
    }
}
