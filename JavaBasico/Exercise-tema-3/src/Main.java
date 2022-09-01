public class Main {
    public static void main(String[] args) {

        String[] names = {"Patricia","Patric","Jose", "Mabella"};

        System.out.println(concatString("Juan, Jose, Patricia"));

        System.out.println(concatString(names));
    }

    static String concatString(String[] strings) {
        String result = "";
        for (String string : strings){
            result += string + ", ";
        }
       return result;
    }

    static String concatString(String string) {
        return string;
    }
}