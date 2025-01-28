package org.college.practise2.task6;

public class ApplicationManager {
    private OutputController osController;

    public ApplicationManager(String platform) {

        User denshi4 = new User("Danya", "Filip");
        Document doc1 = new Document("Practise FIle", "My name is Danya", denshi4);
        osController = new OutputController(doc1);

        switch (platform.toLowerCase()) {
            case "android":
                osController.setOutputStrategy(new AndroidOutputStrategy());
                break;
            case "linux":
                osController.setOutputStrategy(new LinuxOutputStrategy());
                break;
            case "windows":
                osController.setOutputStrategy(new WindowsOutputStrategy());
                break;
            case "mac":
                osController.setOutputStrategy(new MacOutputStrategy());
                break;
            default:
                System.out.println("Unsupported platform, sorry");
        }
    }

    public void run() {
        osController.printReport();
        osController.sendReportViaMail();
        osController.sendReportViaTelegram();
    }
}
