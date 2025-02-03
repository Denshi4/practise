package org.college.practise2.task8;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("UK", "London region", "London", "GreatBritan street", "District 404", "4", "Entrance 404");
        User user1 = new User("Alex", LocalDateTime.now(), address1);

        Address address2 = new Address("Spain", "Madrid region", "Madrid", "Football street", "District 4", "404", "Entrance 44");
        Administrator admin1 = new Administrator("MArio", LocalDateTime.now(), address2, "IT", LocalDateTime.now());

        BankAccount bankAccount1 = new BankAccount("Client 44", admin1, 44000000, false, BankAccountType.PLATINUM);
        InternalAccount internalAccount1 = new InternalAccount("Acc1", "Own1");

        AccountStorage storage = new AccountStorage();
        storage.addAccount(user1);
        storage.addAccount(admin1);
        storage.addBankAccountInfo(bankAccount1);
        storage.addInternalInfo(internalAccount1);

        System.out.println("JSON: ");
        storage.save("json");
        System.out.println(" ");
        System.out.println("DB: ");
        storage.save("db");
    }
}