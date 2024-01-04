public class TShirtorder {
    public static void main(String[] args) {

        String[] sizes1 = {"S", "M", "L"};
        TShirt shirt1 = new TShirt("Gorkhali Batman", 572, 1200.0, "Karuna",
                "You either die a hero or live long enough to see yourself be a villain", sizes1);

        String[] sizes2 = {"M", "L", "XL"};
        TShirt shirt2 = new TShirt("Himalayan Eagle", 681, 1500.0, "Everest Wear",
                "Soar high like the mighty Himalayan eagle", sizes2);

        String[] sizes3 = {"XS", "S", "M"};
        TShirt shirt3 = new TShirt("Kathmandu Sunrise", 789, 1100.0, "Nepal Threads",
                "Welcome the day with the warmth of Kathmandu sunrise", sizes3);


        System.out.println("T-Shirt Details:");
        shirt1.describeTShirt();
        System.out.println();
        shirt2.describeTShirt();
        System.out.println();
        shirt3.describeTShirt();
    }
}
