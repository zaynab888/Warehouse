package system;

public class Electronics extends Product {
   protected String brand;
   protected int warranty;
    public void displayInfo() {
        System.out.println("the brand of the product:" + brand);
        System.out.println("the warranty of the product:" + warranty);
    }

    public Electronics(int warranty) {
        this.warranty = warranty;
    }

    public Electronics(String brand) {
        this.brand = brand;

    }
}
