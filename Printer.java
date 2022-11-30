public class Printer {
    private String name;
    private String model;
    private String colour;
    private PrinterType type;
    private double weight; //kg
    private double length; //cm
    private double width; //cm
    private double height; //cm

    public Printer(String name, String model, String colour, PrinterType type, double weight,
                   double length, double width, double height) {
        this.name = name;
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

}
