public class SystemUnit {
    private String name;
    private String colour;
    private int length; //cm
    private int width; //cm
    private int height; //cm
    private double weight; //kg
    private int RAM; //GigaBite
    private int HDD; //GigaBite
    private String CPUName;
    private boolean backlight;
    private String backlightColour;

    public SystemUnit(String name, String colour, int length, int width, int height,
                      double weight, int RAM, int HDD, String CPUName,
                      boolean backlight, String backlightColour) {
        this.name = name;
        this.colour = colour;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPUName = CPUName;
        this.backlight = backlight;
        this.backlightColour = backlightColour;
    }
}
