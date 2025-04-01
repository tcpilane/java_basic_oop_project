package Bakery.Abstract;

// Chocolate Chip Cookie with a specific decoration style
public class ChocoChipCookie extends Cookie {
    public ChocoChipCookie(String flavor, String shape, int size) {
        super(flavor, shape, size);
    }

    @Override
    public void decorate() {
        System.out.println("Sprinkling chocolate chips on top!");
    }
}
