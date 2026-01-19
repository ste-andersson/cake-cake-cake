package cake;

public class TasteTester {
    public static void main(String[] args) {
        Cake regularStrawberryCake = new Cake("Strawberry");
        BirthdayCake cakeForDave = new BirthdayCake("Vanilla");
        cakeForDave.setCandles(40);
        WeddingCake jackAndJillsCake = new WeddingCake("Blueberry");
        jackAndJillsCake.setTiers(6);
        jackAndJillsCake.setPrice(75);

        System.out.printf("This week we sold cakes for $%.2f.", regularStrawberryCake.getPrice() + cakeForDave.getPrice() + jackAndJillsCake.getPrice());
    }
}
