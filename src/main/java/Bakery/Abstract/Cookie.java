package Bakery.Abstract;

// Abstract class representing a general Cookie
abstract class Cookie {
    private String flavor;
    private String shape;
    private int size;

    public Cookie(String flavor, String shape, int size) {
        this.flavor = flavor;
        this.shape = shape;
        this.size = size;
    }

    // Abstract method (Must be implemented by child classes)
    abstract void decorate();  // We're using decorate() instead of bake()

    public void displayInfo() {
        System.out.println("Flavor: " + flavor);
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size + "cm");
    }
}
