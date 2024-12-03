package org.college.practise2.task3;

public class Main {
    public static void main(String[] args){
        PictureController pc = new PictureController();

        RemovePicrtureCommand rm1 = new RemovePicrtureCommand(3);
        RemovePicrtureCommand rm2 = new RemovePicrtureCommand(6);
        RemovePicrtureCommand rm3 = new RemovePicrtureCommand(4);

        RestPictureCommand rs1 = new RestPictureCommand("Mona Liza");
        RestPictureCommand rs2 = new RestPictureCommand("Sad zemnih naslajdeniy");

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
