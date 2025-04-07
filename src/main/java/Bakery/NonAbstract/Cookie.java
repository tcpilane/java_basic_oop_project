package Bakery.NonAbstract;

public class Cookie {
    // Attributes (Properties of the cookie)
    protected static String flavor;
    private String shape;
    private int size; // in cm

    // Constructor (The recipe to make a cookie)
    public Cookie(String flavor, String shape, int size) {
        this.flavor = flavor;
        this.shape = shape;
        this.size = size;
    }

    //we can have mutiple constrcutors as long as they have different signatures
    //perhaps we have a limitied edition cookie(Winter cookies for example) and we do not want to allow the shape and size to be customised
    public Cookie(String flavor){
        this.flavor = flavor;
    }

    // Methods (What the cookie can do)
    public void bake() {
        System.out.println("Baking the " + flavor + " cookie...");
    }

    public void displayInfo() {
        System.out.println("Flavor: " + flavor);
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size + "cm");
    }

    public static void jar(int size1, int size2) {
        // There can only be 13 cookies in the jar
        System.out.println("Jaring the " + flavor + " cookie...");
        int size3 = size1+size2;
        System.out.println("The jar size is: " + size3);
        if (size3 > 13) {
            System.out.println("Too many cookies in the jar!");
        }
    }

    public static void main(String[] args) {
        jar(10, 5);
    }
}

