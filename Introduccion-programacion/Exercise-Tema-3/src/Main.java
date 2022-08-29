public class Main {
    public static void main(String[] args) {
        addition(10, 20 ,30);

        Car myCar = new Car();
        myCar.addDoor();
        myCar.addDoor();
        System.out.println(myCar.doors);
    }
    public static void addition(int a, int b, int c){
        int result = a + b + c;
        System.out.println(result);
    }

}
class Car {
    public int doors = 0;
    public void addDoor() {
        this.doors++;
    }
}