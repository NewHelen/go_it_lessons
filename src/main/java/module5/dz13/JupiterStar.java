package module5.dz13;

public class JupiterStar extends Spaceport {

    @Override
    public int calculateTotalPrice(int passengerCount) {
        return (500 + passengerCount*2);
    }
}
