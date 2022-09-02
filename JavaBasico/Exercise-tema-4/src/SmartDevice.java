public class SmartDevice {
    protected String maker;
    protected String device;
    protected String serialNumber;
    protected String color;
    protected int year;

    public SmartDevice(){}

    public SmartDevice(String maker, String device, String serialNumber, String color, int year) {
        this.maker = maker;
        this.device = device;
        this.serialNumber = serialNumber;
        this.color = color;
        this.year = year;
    }
}
