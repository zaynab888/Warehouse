package system;

public class Food extends Product{
    String expirationdate;
    public void displayInfo() {
        System.out.println("the expirationdate of the product:" + expirationdate);
    }

    public Food(String expirationdate) {
        this.expirationdate = expirationdate;
    }
}
