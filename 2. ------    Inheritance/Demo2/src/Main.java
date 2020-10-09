public class Main {
    public static void main(String[] args) {

        System.out.printf("Card Suits:%n");

        CardSuit[] values = CardSuit.values();

        for (int i = 0; i <  values.length; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", values[i].ordinal(),values[i]);
        }

        System.out.printf("Card Ranks:%n");

        Enum[] values2 = CardRank.values();

        for (int i = 0; i <  values2.length; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", values2[i].ordinal(),values2[i]);
        }




    }
}
