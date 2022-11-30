public class Shelf {
    private String colour;
    private String material;
    private int length; //cm
    private int width; //cm
    private int thickness; //mm
    private double weight; //kg

    public Shelf(String colour, String material, int length, int width, int thickness, double weight){
        this.colour = colour;
        this.material = material;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.weight = weight;
    }
}
