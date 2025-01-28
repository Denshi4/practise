package org.college.practise2.task6;

class LinuxOutputStrategy implements OutputStrategy {

    @Override
    public void sendReportFromMail(Document document) {
        System.out.println("The document \"" + document.getDocumentName() + "\"was printed from Linux");
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("The document \"" + document.getDocumentName() + "\"was printed from Linux");
    }
    @Override
    public void printReport(Document document) {
        System.out.println("The document \"" + document.getDocumentName() + "\"was printed from Linux");
    }
}
