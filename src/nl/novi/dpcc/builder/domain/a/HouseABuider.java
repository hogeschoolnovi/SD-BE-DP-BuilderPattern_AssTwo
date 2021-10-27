package nl.novi.dpcc.builder.domain.a;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.HouseType;

public class HouseABuider {
    //Verplicht
    private Address address;
    private HouseType houseType;

    public HouseABuider withAddress(Address address) {
        this.address = address;
        return this;
    }

    public HouseABuider withHouseType(HouseType houseType) {
        this.houseType = houseType;
        return this;
    }

    public HouseA build() {
        return new HouseA(this.address, this.houseType);
    }
}
