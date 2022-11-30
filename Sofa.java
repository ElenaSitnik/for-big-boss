public class Sofa {
    private String name;
    private String colour;
    private String material;
    private String form;
    private int length; //mm
    private int widthMin; //mm
    private int widthMax; //mm
    private int height; //mm
    private int widthSleepingPlace; //mm
    private double weight; //kg
    private int seatsNumber;
    private double floorDistance; //cm
    private boolean sofaTransformer;
    private boolean storageSpace;
    private String legsForm;
    private String legsMaterial;
    private int legsCount;
    private String legsColour;

    public Sofa(String name, String colour, String material, String form, int length,
                int widthMin, int widthMax, int height, int widthSleepingPlace, double weight,
                int seatsNumber, double floorDistance, boolean sofaTransformer,
                boolean storageSpace, String legsForm, String legsMaterial, int legsCount,
                String legsColour) {
        this.name = name;
        this.colour = colour;
        this.material = material;
        this.form = form;
        this.length = length;
        this.widthMin = widthMin;
        this.widthMax = widthMax;
        this.height = height;
        this.widthSleepingPlace = widthSleepingPlace;
        this.weight = weight;
        this.seatsNumber = seatsNumber;
        this.floorDistance = floorDistance;
        this.sofaTransformer = sofaTransformer;
        this.storageSpace = storageSpace;
        this.legsForm = legsForm;
        this.legsMaterial = legsMaterial;
        this.legsCount = legsCount;
        this.legsColour = legsColour;
    }
}
