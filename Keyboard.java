public class Keyboard {
    private String name;
    private String model;
    private String colour;
    private double weight;
    private double length; //cm
    private double width; //cm
    private int thickness; //mm
    private boolean wireless;
    private boolean backlight;
    private String backlightColour;

    public Keyboard(String name, String model, String colour, double weight, double length, double width,
                    int thickness,boolean wireless, boolean backlight, String backlightColour) {
        this.name = name;
        this.model = model;
        this.colour = colour;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.wireless = wireless;
        this.backlight = backlight;
        this.backlightColour = backlightColour;
    }
}
