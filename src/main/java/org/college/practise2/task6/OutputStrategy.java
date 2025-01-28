package org.college.practise2.task6;

interface OutputStrategy {
    void printReport(Document document);

    void sendReportFromMail(Document document);

    void sendReportViaTelegram(Document document);
}
