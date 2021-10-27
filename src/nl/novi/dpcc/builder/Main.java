package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.AddressBuilder;
import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.Room;
import nl.novi.dpcc.builder.domain.a.HouseA;
import nl.novi.dpcc.builder.domain.a.HouseABuider;
import nl.novi.dpcc.builder.domain.b.HouseB;
import nl.novi.dpcc.builder.domain.b.HouseBBuilder;
import nl.novi.dpcc.builder.domain.c.HouseC;
import nl.novi.dpcc.builder.domain.c.HouseCBuilder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	 Address address = new AddressBuilder()
             .withStreetName("Straatweg")
             .withHouseNumber(12)
             .withPostalCode("1212AA")
             .withCity("Heerhugowaard").build();

        HouseA houseA = new HouseABuider()
                .withAddress(address)
                .withHouseType(HouseType.VILLA)
                .build();

        //Zou jij een builder voor Garden en Garage gebruikt hebben? Waarom?
        Garden garden = new Garden(0, 2.22, 3.33);
        Garage garage = new Garage(14.44, 3.66, "klapdeur");

        HouseB houseB = new HouseBBuilder(address, HouseType.APPARTMENT)
                .withGarage(garage)
                .withGarden(garden)
                .build();

        // Meerdere opties om te bouwen!
        Room roomA = new Room(12, 12, "a");
        Room roomB = new Room(12, 12, "b");
        Room roomC = new Room(12, 12, "c");
        Room roomD = new Room(12, 12, "d");

        HouseC houseC = new HouseCBuilder(address, HouseType.HOUSE, Arrays.asList(roomA, roomB, roomC, roomD)).build();

        HouseC palazzio = new HouseCBuilder(address, HouseType.HOUSE)
                .withGarage(garage)
                .withGarden(garden)
                .withRooms(Arrays.asList(roomA, roomB, roomC, roomD))
                .build();

        HouseC aRoomAndAroomAndARoom = new HouseCBuilder(address, HouseType.HOUSE)
                .withGarage(garage)
                .withGarden(garden)
                .withARoom(roomA)
                .withARoom(roomB)
                .withRooms(Arrays.asList(roomC, roomD))
                .build();

    }
}
