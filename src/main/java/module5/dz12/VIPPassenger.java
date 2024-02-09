package module5.dz12;

import module5.dz12.Passenger;

public class VIPPassenger extends Passenger {
    @Override
    public String getType() {
        return "VIP";
    }

    @Override
    public int getTicketPrice() {
        return 399;
    }
}
