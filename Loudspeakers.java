public class Loudspeakers {
    private String name;
    private String model;
    private String colour;
    private int count;
    private int length; //cm
    private int width; //cm
    private int height; //cm
    private double weight;
    private boolean backlight;
    private String backlightColour;

    public Loudspeakers(String name, String model, String colour, int count, int length, int width,
                        int height, double weight, boolean backlight, String backlightColour) {
        this.name = name;
        this.model = model;
        this.colour = colour;
        this.count = count;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.backlight = backlight;
        this.backlightColour = backlightColour;
    }

}
