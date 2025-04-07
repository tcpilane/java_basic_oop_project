package Bakery.NonAbstract;

public class CookieMaker {
    public static void main(String[] args) {
        // Creating objects (cookies)
        Cookie chocoChip = new ChocoChipCookie("Chocolate Chip");
        Cookie sugarCookie = new SugarCookie("Sugar", "Star", 7);

        // Using the objects4
        chocoChip.displayInfo();
        chocoChip.bake();

        System.out.println();

        sugarCookie.displayInfo();
        sugarCookie.bake();

        //USING THE CHILD CLASS

//        ChocoChipCookie chocoCookie = new ChocoChipCookie("Chocolate Chip", "Circle", 5, 20);
//
//        chocoCookie.displayInfo();
//        chocoCookie.bake();
//        chocoCookie.addChips(); // Special feature of ChocoChipCookie
//    }

        //USING POLYMORPHISM

//        Cookie chocoCookie = new ChocoChipCookie("Chocolate Chip", "Circle", 5, 20);
//        Cookie sugarCookie = new SugarCookie("Sugar", "Star", 7);
//
//        chocoCookie.bake();  // Uses bake() from ChocoChipCookie class
//        sugarCookie.bake();  // Uses overridden bake() from SugarCookie class
//    }
    }
}
