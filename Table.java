public class Table {
    private String name;
    private String appointment;
    private String producer;
    private boolean tableTransformer;
    private double height; // meters
    private double weight; // kilo
    private int seatsNumber;
    private Tabletop tabletop;
    private Legs legs;

    public Table(String name, String appointment, String producer,
                 boolean tableTransformer, double height, double weight,
                 int seatsNumber, Tabletop tabletop, Legs legs) {
        this.name = name;
        this.appointment = appointment;
        this.producer = producer;
        this.tableTransformer = tableTransformer;
        this.height = height;
        this.weight = weight;
        this.seatsNumber = seatsNumber;
        this.tabletop = tabletop;
        this.legs = legs;
    }
}
