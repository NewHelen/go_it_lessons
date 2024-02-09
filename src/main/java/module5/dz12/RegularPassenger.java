package module5.dz12;

import module5.dz12.Passenger;

public class RegularPassenger extends Passenger {
    @Override
    public String getType() {
        return "Regular";
    }

    @Override
    public int getTicketPrice() {
        return 199;
    }
}
