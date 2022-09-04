public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("Hola Mundo!!"));



    }

    /**
     * Return reverse text
     * @param texto
     * @return
     */
    public static String reverse(String texto) {
        String wordReverse = "";

        for (int i = 0; i < texto.length(); i++) {
            wordReverse += texto.charAt(texto.length() - i - 1);
        }
        return wordReverse;
    }
}