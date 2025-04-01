package Bakery.NonAbstract;
//Inheritance

// Special Cookie with extra feature: adding chocolate chips
public class ChocoChipCookie extends Cookie {
    private int chipCount;

    public ChocoChipCookie(String flavor, String shape, int size, int chipCount) {
        super(flavor, shape, size); // Reusing the Cookie class's constructor
        this.chipCount = chipCount;
    }

    //METHOD TO MODIFY THE ATRIBUTES OF CHOCCHIP COOKIE

    public void addChips() {
        System.out.println("Adding " + chipCount + " chocolate chips!");
    }
}
