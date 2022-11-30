public class Room {
    public static int count;
    private String name;
    private Book book;
    private Carpet carpet;
    private Computer computer;
    private Keyboard keyboard;
    private Legs legs;
    private Loudspeakers loudspeakers;
    private Monitor monitor;
    private Mouse mouse;
    private Printer printer;
    private Shelf shelf;
    private Sofa sofa;
    private SystemUnit systemUnit;
    private Table table;
    private Tabletop tabletop;
    private TV tv;

    public Room(String name){
        this.name = name;
    }
    public void addBook(Book book){
        this.book = book;
        count += 1;
    }

    public void addCarpet(Carpet carpet){
        this.carpet = carpet;
        count += 1;
    }

    public void addComputer(Computer computer){
        this.computer = computer;
        count += 1;
    }

    public void addKeyboard(Keyboard keyboard){
        this.keyboard = keyboard;
        count += 1;
    }

    public void addLegs(Legs legs){
        this.legs = legs;
        count += 1;
    }

    public void addLoudspeakers(Loudspeakers loudspeakers){
        this.loudspeakers = loudspeakers;
        count += 1;
    }

    public void addMonitor(Monitor monitor){
        this.monitor = monitor;
        count += 1;
    }

    public void addMouse(Mouse mouse){
        this.mouse = mouse;
        count += 1;
    }

    public void addPrinter(Printer printer){
        this.printer = printer;
        count += 1;
    }

    public void addShelf(Shelf shelf){
        this.shelf = shelf;
        count += 1;
    }

    public void addSofa(Sofa sofa){
        this.sofa = sofa;
        count += 1;
    }

    public void addSystemUnit(SystemUnit systemUnit){
        this.systemUnit = systemUnit;
        count += 1;
    }

    public void addTable(Table table){
        this.table = table;
        count += 1;
    }

    public void addTabletop(Tabletop tabletop){
        this.tabletop = tabletop;
        count += 1;
    }

    public void addTV(TV tv){
        this.tv = tv;
        count += 1;
    }

    public int getCount(){
        return count;
    }

}
