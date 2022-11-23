public class Main {
    public static void main(String[] args) {
        Tabletop tabletop1 = new Tabletop("Tabletop1");

        Legs legs1 = new Legs("Legs1");

        tabletop1.addTabletopCharacteristic("Tabletop1", "Rectangle",
                "Yellow","Chipboard",25,10,
                true, true, 120, 85);


        legs1.addLegsCharacteristic("Luxury", "Round", 4,
                "Chrome", "Smith", 0.9, 6.5);

        Table table1 = new Table("Table1", "For work", "PinskWood",
                false, 0.9, 15.0, 6,
                tabletop1, legs1);
    }
}
