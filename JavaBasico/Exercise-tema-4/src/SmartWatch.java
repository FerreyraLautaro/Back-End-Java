public class SmartWatch extends SmartDevice{
    boolean hourCounter;
    boolean secondCounter;

    public SmartWatch(){}

    public SmartWatch(String maker, String device, String serialNumber, String color, int year, boolean hourCounter, boolean secondCounter) {
        super(maker, device, serialNumber, color, year);
        this.hourCounter = hourCounter;
        this.secondCounter = secondCounter;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "hourCounter=" + hourCounter +
                ", secondCounter=" + secondCounter +
                ", maker='" + maker + '\'' +
                ", device='" + device + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
