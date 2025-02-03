package org.college.practise2.task8;

import java.time.LocalDateTime;

interface Accountable {
    long getId();
    LocalDateTime getCreationDate();
    String accept(BankAbstractVisitor visitor);
}