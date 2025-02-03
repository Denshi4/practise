package org.college.practise2.task8.p2;

class Address {
    private String country;
    private String city;
    private String street;
    private String buildingNumber;
    private String additionalNotes;

    public Address(String country, String city, String street, String buildingNumber, String additionalNotes) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.additionalNotes = additionalNotes;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", additionalNotes='" + additionalNotes + '\'' +
                '}';
    }
}
