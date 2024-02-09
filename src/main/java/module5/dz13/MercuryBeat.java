package module5.dz13;

public class MercuryBeat extends Spaceport {

    @Override
    public int calculateTotalPrice(int passengerCount) {
        return 15*passengerCount;
    }
}
