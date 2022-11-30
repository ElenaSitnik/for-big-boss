public class TV {
    private String name;
    private String model;
    private String colour;
    private PanelType type;
    private int diagonal; // "
    private double weight; //kg
    private int length; //cm
    private int width; //cm
    private int thickness; //mm

    public TV(String name, String model, String colour, PanelType type, int diagonal,
              double weight, int length, int width, int thickness) {
        this.name = name;
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.diagonal = diagonal;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
    }
}
