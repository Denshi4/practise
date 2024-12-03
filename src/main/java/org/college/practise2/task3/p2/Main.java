package org.college.practise2.task3.p2;

public class Main {
    public static void main(String[] args){
        PictureController pc = new PictureController();

        RemoveDishCommand rm1 = new RemoveDishCommand(4);
        RemoveDishCommand rm2 = new RemoveDishCommand(8);
        RemoveDishCommand rm3 = new RemoveDishCommand(16);

        StopDishCommand rs1 = new StopDishCommand("Chicken butter masala");
        StopDishCommand rs2 = new StopDishCommand("Plain rice");

        rm1.execute();
        rm3.execute();
        rs1.execute();
        rs2.execute();
        rs2.undo();

        pc.addCommand(rm1);
        pc.addCommand(rm2);
        pc.addCommand(rm3);
        pc.addCommand(rs1);
        pc.addCommand(rs2);

        pc.executeAllPendingCommand();
        System.out.println(pc.get_commandHistory());

        rm2.execute();
        rm2.undo();
        pc.undoChanges(1);
        rm2.execute();
        pc.removeCommand(rm2);
        pc.addCommand(rm2);
        rs2.execute();
        pc.addCommand(rs2);
        pc.undoCommand(rs2);
        pc.executeAllPendingCommand();
        System.out.println(pc.get_commandHistory());

    }
}
