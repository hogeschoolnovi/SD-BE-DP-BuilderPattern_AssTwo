package nl.novi.dpcc.builder.domain.b;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;

public class HouseBBuilder {

    //Verplicht
    private Address address;
    private HouseType houseType;

    // Niet verplicht
    private Garden garden;
    private Garage garage;

    public HouseBBuilder(Address address, HouseType houseType) {
        this.address = address;
        this.houseType = houseType;
    }

    public HouseBBuilder withGarden(Garden garden) {
        this.garden = garden;
        return this;
    }

    public HouseBBuilder withGarage(Garage garage) {
        this.garage = garage;
        return this;
    }

    public HouseB build() {
        HouseB houseB = new HouseB();
        houseB.setAddress(this.address);
        houseB.setHouseType(this.houseType);

        if(this.garden != null) {
            houseB.setGarden(this.garden);
        }

        if(this.garage != null) {
            houseB.setGarage(this.garage);
        }
        return houseB;
    }
}
