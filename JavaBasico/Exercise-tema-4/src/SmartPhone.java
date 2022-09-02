public class SmartPhone extends SmartDevice {
    double display;
    String memory;

    SmartPhone(){}

    public SmartPhone(String maker, String device, String serialNumber, String color, int year, double display, String memory) {
        super(maker, device, serialNumber, color, year);
        this.display = display;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "display= " + display +
                ", memory='" + memory + '\'' +
                ", maker='" + maker + '\'' +
                ", device='" + device + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                "} ";
    }
}
