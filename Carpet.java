public class Carpet {
    private String form;
    private String colour;
    private String picture;
    private double weight; //kg
    private int length; //cm
    private int width; //cm
    private int diameter; //cm
    private int corner; //degree

    public Carpet(String form, String colour, String picture, double weight) {
        this.form = form;
        this.colour = colour;
        this.picture = picture;
        this.weight = weight;
    }
    // if carpet is rectangle
    public Carpet(String form, String colour, String picture,double weight,
                  int length, int width){
        this(form, colour, picture, weight);
        this.length = length;
        this.width = width;
    }
    // if carpet is round
    public Carpet (String form, String colour, String picture,double weight, int diameter){
        this(form, colour, picture, weight);
        this.diameter = diameter;
    }
    // if carpet is oval
    public Carpet (String form, String colour, String picture,double weight,
                   int length, int width, int corner) {
        this(form, colour, picture, weight);
        this.length = length;
        this.width = width;
        this.corner = corner;
    }
}
