package system;

public class Product {
    protected String  name;
   protected double price;
   protected int  quantity;

    public void displayInfo(){
        System.out.println("the name of the product:"+name);
        System.out.println("the price of the product:"+price);
        System.out.println("the quantity of the product:"+quantity);




    }
    public void updateQuantity(int newQuantity){
        this.quantity=newQuantity;
        System.out.println("la quantité du produit"+name+"a été modifiée"+newQuantity);
    }
    public double getPrice(){
        return price;
    }
    public static void welcomeMessage(){
        System.out.println("welcome");
    }
    public void updateQuantity(int addedQuantity, boolean addToExisting){
        if (addToExisting) {

            quantity += addedQuantity;
        } else {

            quantity = addedQuantity;
        }


        System.out.println("Updated quantity: " + quantity);
    }


}
