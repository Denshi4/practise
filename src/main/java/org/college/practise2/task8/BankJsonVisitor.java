package org.college.practise2.task8;

class BankJsonVisitor implements BankAbstractVisitor {
    @Override
    public String visit(User user) {
        return "visit(user).json";
    }

    @Override
    public String visit(Administrator administrator) {
        return "visit(Administrator).json";
    }

    @Override
    public String visit(BankAccountType accountType) {
        return "visit(BankAccountType).json";
    }

    @Override
    public String visitBank(BankAccount account) {
        return "visit(BankAccount).json";
    }

    @Override
    public String visitInternal(InternalAccount account) {
        return "visit(InternalAccount).json";
    }
}