public class Main {
    public static void main(String[] args) {
        Tabletop tabletop1 = new Tabletop("Tabletop1");
        Tabletop tabletop2 = new Tabletop("Tabletop2");
        Tabletop tabletop3 = new Tabletop("Tabletop3");

        Legs legs1 = new Legs("Legs1");
        Legs legs2 = new Legs("Legs2");
        Legs legs3 = new Legs("Legs3");

        tabletop1.addTabletopCharacteristic("Tabletop1", "Rectangle",
                "Yellow","Chipboard",25,10,
                true, true, 85, 120);

        tabletop2.addTabletopCharacteristic("Tabletop2", "Rectangle",
                "Black", "Chipboard", 20, 3,
                false, false,50,80);
        tabletop3.addTabletopCharacteristic("Tabletop3", "Rectangle",
                "Brown", "Chipboard", 25, 10,
                false, false, 110, 200);

        legs1.addLegsCharacteristic("Legs1", "Round", 4,
                "Chrome", "Smith", 0.9, 6.5);
        legs2.addLegsCharacteristic("Legs2", "Square", 4,
                "Black", "Smith", 0.8, 5, 5);
        legs3.addLegsCharacteristic("Legs3", "Rectangle", 4,
                "Brown", "Wood", 0.9, 10, 8);

        Table table1 = new Table("Table1", "For work",
                false, 0.9, 15.0, 6,
                tabletop1, legs1);
        Table table2 = new Table("Table2", "Coffee table",
                false, 0.85, 5, 2, tabletop2, legs2);
        Table table3 = new Table("Table3", "For dinner",
                true,0.9, 20,8,tabletop3, legs3);

        Sofa sofa = new Sofa("Sofa", "Black and Brown", "Textile and EcoLeather",
                "Corner", 4000, 800, 1400, 1000,
                1400, 40, 6,10, true,
                true, "round", "wood", 8, "Black");

        Carpet carpet = new Carpet("Rectangle", "Black and white", "Animals",
                2.5, 400, 200);

        Shelf shelf1 = new Shelf("Black", 50, 20, 12, 1.0);
        Shelf shelf2 = new Shelf("Black", 75, 20, 12, 1.5);
        Shelf shelf3 = new Shelf("Black", 100, 20, 12, 2.0);

        TV tv = new TV("Samsung", "Black and grey", 55, 20,
                123, 714, 6);
    }
}
