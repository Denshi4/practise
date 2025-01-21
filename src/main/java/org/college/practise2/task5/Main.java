package org.college.practise2.task5;

public class Main {
    public static void main(String[] args) {

        WindowManager manager = new WindowManager("YOOManeger", 1920, 1080, "PicWindow");

        VerticalLayout layout = new VerticalLayout("4LoveLayout", 720, 480);
        manager.addComponent(layout);

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
