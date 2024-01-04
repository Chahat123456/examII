public class Order {
    private String name;
    private String phoneNumber;
    private int[] items;
    private double[] prices;


    public Order(String name, String phoneNumber, int[] items, double[] prices) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.prices = prices;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }


    public void printBill() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        double vat = total * 0.13;
        double totalAmount = total + vat;

        System.out.println("Bill Details:");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Items: " + java.util.Arrays.toString(items));
        System.out.println("Prices: " + java.util.Arrays.toString(prices));
        System.out.println("Total (VAT inclusive): " + totalAmount);
    }

    public static void main(String[] args) {

        String customerName = "John Doe";
        String customerPhone = "1234567890";
        int[] orderedItems = {572, 681}; // Example item codes for the ordered T-shirts
        double[] orderedPrices = {1235.0, 1780.0}; // Example prices for the ordered T-shirts

        // Creating an instance of Order and printing the bill
        Order order = new Order(customerName, customerPhone, orderedItems, orderedPrices);
        order.printBill();
    }
}
