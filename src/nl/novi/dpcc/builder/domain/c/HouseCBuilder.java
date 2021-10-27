package nl.novi.dpcc.builder.domain.c;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.Room;

import java.util.List;

public class HouseCBuilder {
    //Verplicht
    private Address address;
    private HouseType houseType;

    // Niet verplicht
    private Garden garden;
    private Garage garage;

    // Minimaal 1 kamer is verplicht
    private List<Room> rooms;

    public HouseCBuilder(Address address, HouseType houseType, List<Room> rooms) {
        this.address = address;
        this.houseType = houseType;
        this.rooms = rooms;
    }

    public HouseCBuilder(Address address, HouseType houseType) {
        this.address = address;
        this.houseType = houseType;
    }

    public HouseCBuilder withGarden(Garden garden) {
        this.garden = garden;
        return this;
    }

    public HouseCBuilder withGarage(Garage garage) {
        this.garage = garage;
        return this;
    }

    public HouseCBuilder withARoom(Room room) {
        this.rooms.add(room);
        return this;
    }

    public HouseCBuilder withRooms(List<Room> rooms) {
        if(this.rooms == null || this.rooms.isEmpty()) {
            this.rooms = rooms;
        } else {
            this.rooms.addAll(rooms);
        }
        return this;
    }

    public HouseC build() {
        if (rooms == null || rooms.isEmpty()) {
            throw new RuntimeException("Need a minimum of one room");
        }
        HouseC  houseC = new HouseC(this.address, this.houseType);
        houseC.setRooms(this.rooms);
        if(this.garden != null) {
            houseC.setGarden(this.garden);
        }

        if(this.garage != null) {
            houseC.setGarage(this.garage);
        }
        return houseC;

    }


}
