public class Main {
    public static void main(String[] args) {

        System.out.println("--------If---------");
        int numberIf = (int)(Math.random()*-20+10);
        if (numberIf > 0){
            System.out.println(numberIf + " is positive");

        } else if (numberIf < 0) {
            System.out.println(numberIf + " is negative");
        }else {
            System.out.println(numberIf + " is zero");
        }


        System.out.println("--------While---------");
        int numberWhile = 0;
        while (numberWhile < 3) {
            System.out.println(numberWhile);
            numberWhile++;
        }


        System.out.println("--------Do While---------");
        int numberDoWhile = 0;
        do {
            System.out.println(numberDoWhile);
            numberDoWhile = numberDoWhile + 3;
        }while (numberDoWhile < 3);


        System.out.println("--------For---------");
        int numberFor = 0;
        for (int i = 3; numberFor <= i; numberFor++ ){
            System.out.println("numberFor is " + numberFor);
        }


        System.out.println("--------Switch---------");
        int numSeason = (int)(Math.random()*5);
        String[] seasons = {"winter", "spring", "summer", "fall", "invalid season"};

        String season = seasons[numSeason];
        switch (season){
            case "spring":
                System.out.println("spring");
                break;
            case "fall":
                System.out.println("fall");
                break;
            case "winter":
                System.out.println("winter");
                break;
            case "summer":
                System.out.println("summer");
                break;
            default:
                System.out.println("Invalid season");
        }
    }

}