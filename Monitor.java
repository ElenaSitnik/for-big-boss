public class Monitor {
    private String name;
    private String model;
    private String colour;
    private int diagonal; //"
    private double length; //cm
    private double width; //cm
    private int thickness; //mm
    private double weight; //kg

    public Monitor(String name, String model, String colour, int diagonal,
                   double length, double width, int thickness, double weight) {
        this.name = name;
        this.model = model;
        this.colour = colour;
        this.diagonal = diagonal;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.weight = weight;
    }


}
