package Bakery.NonAbstract;

//INHERITANCE
public class SugarCookie extends Cookie {
    public SugarCookie(String flavor, String shape, int size) {
        super(flavor, shape, size);
    }

    //POLYMORPHISM
    // Overriding the bake method to have special baking instructions
    @Override
    public void bake() {
        System.out.println("Baking the sugar cookie slowly for a crispy finish...");
    }
}

