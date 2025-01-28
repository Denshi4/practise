package org.college.practise2.task6;

class OutputController {
    private Document document;
    private OutputStrategy outputStrategy;

    public OutputController(Document document) {
        this.document = document;
    }

    public void setOutputStrategy(OutputStrategy strategy) {
        this.outputStrategy = strategy;
    }

    public void printReport() {
        if (outputStrategy != null) {
            outputStrategy.printReport(document);
        } else {
            System.out.println("No strategy");
        }
    }

    public void sendReportViaMail() {
        if (outputStrategy != null) {
            outputStrategy.sendReportFromMail(document);
        } else {
            System.out.println("No strategy");
        }
    }

    public void sendReportViaTelegram() {
        if (outputStrategy != null) {
            outputStrategy.sendReportViaTelegram(document);
        } else {
            System.out.println("No strategy");
        }
    }
}
