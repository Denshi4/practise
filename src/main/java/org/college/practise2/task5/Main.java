package org.college.practise2.task5;

public class Main {
    public static void main(String[] args) {

        Window winq1 = new Window("Window", 1920, 480, "win1");
        WindowManager manager = new WindowManager(winq1);

        VerticalLayout layout = new VerticalLayout("4LoveLayout", 720, 480);
        manager.getWindow().addComponent(layout);

        layout.addComponent(new Button("ButtonFunny", "Smile", "/memPic/smileFace.png"));
        layout.addComponent(new Button("ButtonDontFunny", "Cry", "/memPic/cryBaby.png"));

        manager.draw();

        try {
            Button button = new Button("ButtonScream", "AAAHHHH ", "/memPic/AAAAHHHH.png");
            button.addComponent(new Button("Money", "AddMoney", "/scam/addMoneyScam.png"));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
