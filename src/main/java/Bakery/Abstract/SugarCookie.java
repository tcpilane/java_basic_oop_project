package Bakery.Abstract;

// Sugar Cookie with a different decoration style
public class SugarCookie extends Cookie {
    public SugarCookie(String flavor, String shape, int size) {
        super(flavor, shape, size);
    }

    @Override
    public void decorate() {
        System.out.println("Adding colorful icing and sprinkles!");
    }
}

