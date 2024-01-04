public class Main {
    public static void main(String[] args) {


        String[] availableSizes = {"XL", "Medium", "Large"};
        TShirt shirt = new TShirt("Gorkhali Batman", 572, 1235.0, "Karuna",
                "You either die a hero or live long enough to see yourself be a villain", availableSizes);


        shirt.describeTShirt();
    }
}