public class Legs {
    private String name;
    private String legsForm;
    private int legsCount;
    private String legsColour;
    private String legsMaterial;
    private double legsHeight; // meters
    private double legsDiameter; // cm
    private double legsWidth; // cm
    private double legsLength; // cm
    // if form of legs is round
    public Legs(String name){
        this.name = name;
    }
    public void addLegsCharacteristic(String name, String legsForm, int legsCount,
                                      String legsColour, String legsMaterial,
                                      double legsHeight) {
        this.name = name;
        this.legsForm = legsForm;
        this.legsCount = legsCount;
        this.legsColour = legsColour;
        this.legsMaterial = legsMaterial;
        this.legsHeight = legsHeight;
    }
    public void addLegsCharacteristic(String name, String legsForm, int legsCount,
                                      String legsColour, String legsMaterial,
                                      double legsHeight, double legsDiameter) {
        addLegsCharacteristic(name, legsForm, legsCount, legsColour,
                legsMaterial, legsHeight);
        this.legsDiameter = legsDiameter;
    }

    // if form of legs is !round
    public void addLegsCharacteristic(String name, String legsForm, int legsCount, String legsColour,
                                      String legsMaterial, double legsHeight, double legsLength, double legsWidth) {
        addLegsCharacteristic(name, legsForm, legsCount, legsColour,
                legsMaterial, legsHeight);
        this.legsDiameter = legsLength;
        this.legsWidth = legsWidth;
    }
}
