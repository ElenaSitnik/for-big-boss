public class Table {
    private String name;
    private String appointment;
    private boolean tableTransformer;
    private double height; // meters
    private double weight; // kilo
    private int seatsNumber;
    private Tabletop tabletop;
    private Legs legs;

    public Table(String name, String appointment, boolean tableTransformer, double height,
                 double weight, int seatsNumber, Tabletop tabletop, Legs legs) {
        this.name = name;
        this.appointment = appointment;
        this.tableTransformer = tableTransformer;
        this.height = height;
        this.weight = weight;
        this.seatsNumber = seatsNumber;
        this.tabletop = tabletop;
        this.legs = legs;
    }
    public String toStringTable(){
        return "Table: " + name + "\n" +
                "Appointment: " + appointment + "\n" +
                "Height of table: " + height + "\n" +
                "Tabletop: " + tabletop.toStringTabletopRectangle() + "\n" +
                "Legs: " + legs.toStringLegsRound();
    }
}
