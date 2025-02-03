package org.college.practise2.task8.p2;

import java.time.LocalDateTime;

class Staff implements MenuItem {
    private String firstName;
    private LocalDateTime birthDate;
    private Address address;

    public Staff(String firstName, LocalDateTime birthDate, Address address) {
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public LocalDateTime getCreationDate() {
        return birthDate;
    }

    @Override
    public String accept(RestaurantVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + firstName + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                '}';
    }
}
