public class Main {
    public static void main(String[] args) {
        System.out.println(addIva(100));
    }

    /**
     * addIva 21%
     * @param num
     * @return
     */
    static double addIva(double num){
        return num * 1.21;
    }
}