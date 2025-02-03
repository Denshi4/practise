package org.college.practise2.task8.p2;

import java.time.LocalDateTime;

class Chef extends Staff {
    private String specialty;
    private LocalDateTime hireDate;

    public Chef(String firstName, LocalDateTime birthDate, Address address, String specialty, LocalDateTime hireDate) {
        super(firstName, birthDate, address);
        this.specialty = specialty;
        this.hireDate = hireDate;
    }

    public String getSpecialty() {
        return specialty;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "specialty='" + specialty + '\'' +
                ", hireDate=" + hireDate +
                "} " + super.toString();
    }
}
