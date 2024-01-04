public class TShirt {
public String itemName;
 public int productCode;
  public double price;
  public String brand;
  public String description;
   public String[] sizes;


    public TShirt(String itemName, int productCode, double price, String brand, String description, String[] sizes) {
        this.itemName = itemName;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }
    public void describeTShirt() {
        System.out.println("Item name: " + itemName);
        System.out.println("Description: " + description);
        System.out.println("Product code: " + productCode);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes : " + java.util.Arrays.toString(sizes));
    }



}
