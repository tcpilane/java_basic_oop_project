package Bakery.Abstract;

public class CookieMaker {
    public static void main(String[] args) {
        Cookie chocoChip = new ChocoChipCookie("Chocolate Chip", "Circle", 5);
        Cookie sugarCookie = new SugarCookie("Sugar", "Star", 7);

        chocoChip.displayInfo();
        chocoChip.decorate();  // Calls the decorate() method for ChocoChipCookie

        System.out.println();

        sugarCookie.displayInfo();
        sugarCookie.decorate();  // Calls the decorate() method for SugarCookie
    }
}

//What's Happening?
//The Cookie class only says there should be a decorate() method.
//
//Each cookie type (ChocoChipCookie, SugarCookie) implements decorate() differently:
//
//ChocoChipCookie sprinkles chocolate chips.
//
//SugarCookie adds icing and sprinkles.
//
//The user just calls decorate(), without knowing or caring how the decoration happens.
//
//This is Abstraction: Hiding complex details and providing a simple way to interact.
