package org.college.practise2.task6;

class AndroidOutputStrategy implements OutputStrategy {

    @Override
    public void sendReportFromMail(Document document) {
        System.out.println("The document \"" + document.getDocumentName() + "\" was printed from Android.");
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("The document \"" + document.getDocumentName() + "\" was printed from Android");
    }

    @Override
    public void printReport(Document document) {
        System.out.println("The document \"" + document.getDocumentName() + "\" was printed from Android");
    }
}
