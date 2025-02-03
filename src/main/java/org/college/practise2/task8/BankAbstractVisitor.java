package org.college.practise2.task8;

interface BankAbstractVisitor {
    String visit(User user);
    String visit(Administrator administrator);
    String visit(BankAccountType accountType);
    String visitBank(BankAccount account);
    String visitInternal(InternalAccount account);
}