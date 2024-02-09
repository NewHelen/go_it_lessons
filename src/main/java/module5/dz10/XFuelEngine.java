package module5.dz10;

import module5.dz10.Engine;

public class XFuelEngine extends Engine {

    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFuelType() {
        return "XFuel";
    }

}
