public class Main {
    public static void main(String[] args) {
        Tabletop tabletop1 = new Tabletop("Tabletop1");
        Tabletop tabletop2 = new Tabletop("Tabletop2");
        Tabletop tabletop3 = new Tabletop("Tabletop3");

        Legs legs1 = new Legs("Legs1");
        Legs legs2 = new Legs("Legs2");
        Legs legs3 = new Legs("Legs3");

        tabletop1.addTabletopCharacteristic("Tabletop1", "Rectangle",
                "Yellow","Chipboard",20,10,
                true, true, 60, 120);

        tabletop2.addTabletopCharacteristic("Tabletop2", "Rectangle",
                "Black", "Chipboard", 10, 3,
                false, false,44,60);
        tabletop3.addTabletopCharacteristic("Tabletop3", "Rectangle",
                "Brown", "Chipboard", 10, 10,
                false, false, 90, 165);

        legs1.addLegsCharacteristic("Legs1", "Round", 4,
                "Chrome", "Smith", 0.7, 6.5);
        legs2.addLegsCharacteristic("Legs2", "Square", 4,
                "Black", "Smith", 0.695, 5, 5);
        legs3.addLegsCharacteristic("Legs3", "Rectangle", 4,
                "Brown", "Wood", 0.74, 10, 8);

        Table table1 = new Table("Table1", "For work",
                false, 0.73, 15.0, 6,
                tabletop1, legs1);
        Table table2 = new Table("Table2", "Coffee table",
                false, 0.705, 5, 2, tabletop2, legs2);
        Table table3 = new Table("Table3", "For dinner",
                true,0.75, 20,8,tabletop3, legs3);

        Sofa sofa = new Sofa("Sofa", "Black and Brown", "Textile and EcoLeather",
                "Corner", 4000, 800, 1400, 900,
                1400, 40, 6,3.5, true,
                true, "round", "wood", 8, "Black");

        Carpet carpet = new Carpet("Rectangle", "Black and white", "Animals",
                2.5, 400, 200);

        Shelf shelf1 = new Shelf("Black", "Wood", 50, 20, 12, 1.0);
        Shelf shelf2 = new Shelf("Black", "Wood", 75, 20, 12, 1.5);
        Shelf shelf3 = new Shelf("Black", "Wood", 100, 20, 12, 2.0);

        TV tv = new TV("Samsung", "UE55NU7450U", "Black and grey", 55, 20,
                123, 714, 6);

        SystemUnit systemUnit = new SystemUnit("Zalman", "Black", 55, 25, 48,
                10, 16, 800, "Intel", true, "Blue");

        Keyboard keyboard1 = new Keyboard("4TECH", "KV-300H", "Black and grey", 0.7,
                 44, 12.5, 8, false, false, "No");

        Keyboard keyboard2 = new Keyboard("Logitech", "K400+", "Grey", 0.4, 35.5,
                14, 10, true, false, "No");

        Mouse mouse = new Mouse("AULA", "SI-928", "Black", false, true,
                "Blue");

        Monitor monitor = new Monitor("LG", "24MK600M", "Black and grey", 24,
                54.0, 32.5, 45, 3.2);

        Loudspeakers loudspeakers = new Loudspeakers("Sven", "Q.C.1", "Black", 2,
                12, 11, 18,0.8, false, "No");

        Computer computer = new Computer(systemUnit, monitor, mouse, keyboard1, loudspeakers);

        Book book1 = new Book("Upgrade your English grammar", "Е.В. Макарова, Т.В. Пархимович",
                "ООО Попурри", 2010, 448,24, 16.5,
                20, 0.5);

        Book book2 = new Book("Java Полное руководство", "Г. Шилдт", "Диалектика",
                2018, 1488, 24, 17.2, 68, 2.1);

    }
}
