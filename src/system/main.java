package system;

public class main {
    public static void main(String[] args) {

        Product.welcomeMessage();


        Electronics laptop = new Electronics("DELL");
        Electronics laptopp = new Electronics(3);

        Food apple = new Food("12decembre");


        System.out.println("Informations sur le produit :");
        laptop.displayInfo();
        System.out.println();
        apple.displayInfo();
        System.out.println();

        System.out.println("Mise à jour de la quantité du produit Laptop :");
        laptop.updateQuantity(5); // Remplacer la quantité
        laptop.updateQuantity(3, true); // Ajouter à la quantité existante
        System.out.println();

        System.out.println("Mise à jour de la quantité du produit Apple :");
        apple.updateQuantity(90); // Remplacer la quantité
        apple.updateQuantity(20, true); // Ajouter à la quantité existante
    }
}