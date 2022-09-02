public class Main {
    public static void main(String[] args) {
        SmartPhone iPhone8 = new SmartPhone("Apple", "iPhone 8 Plus", "123554234", "red", 2020, 6.8, "128gb");
        System.out.println(iPhone8.toString());

        SmartWatch watchNew = new SmartWatch("Apple", "watch Ultimate", "8898444234", "white", 2018, true, false);
        System.out.println(watchNew.toString());
    }
}