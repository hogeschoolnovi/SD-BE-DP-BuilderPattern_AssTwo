package nl.novi.dpcc.builder.domain;

public class Address {
    private String streetName;
    private int houseNumber;
    private String postalCode;
    private String city;

    //Niet verplicht
    private String houseNumberAddition;

    public Address(String streetName, int houseNumber, String postalCode, String city) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    public void setHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getHouseNumberAddition() {
        return houseNumberAddition;
    }
}
