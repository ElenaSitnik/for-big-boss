public class Legs {
    private String legsName;
    private String legsForm;
    private int legsCount;
    private String legsColour;
    private String legsMaterial;
    private double legsHeight; // meters
    private double legsDiameter; // cm
    private double legsWidth; // cm
    private double legsLength; // cm

    // if form of legs is round
    public Legs(String legsName){
        this.legsName = legsName;
    }
    public void addLegsCharacteristic(String legsName, String legsForm, int legsCount,
                                      String legsColour, String legsMaterial,
                                      double legsHeight) {
        this.legsName = legsName;
        this.legsForm = legsForm;
        this.legsCount = legsCount;
        this.legsColour = legsColour;
        this.legsMaterial = legsMaterial;
        this.legsHeight = legsHeight;
    }
    public void addLegsCharacteristic(String legsName, String legsForm, int legsCount,
                                      String legsColour, String legsMaterial,
                                      double legsHeight, double legsDiameter) {
        addLegsCharacteristic(legsName, legsForm, legsCount, legsColour,
                legsMaterial, legsHeight);
        this.legsDiameter = legsDiameter;
    }

    // if form of legs is !round
    public void addLegsCharacteristic(String legsName, String legsForm, int legsCount,
                                      String legsColour, String legsMaterial,
                                      double legsHeight, double legsLength,
                                      double legsWidth) {
        addLegsCharacteristic(legsName, legsForm, legsCount, legsColour,
                legsMaterial, legsHeight);
        this.legsDiameter = legsLength;
        this.legsWidth = legsWidth;
    }
    public String toStringLegsRound(){
        return "Name of legs: " + legsName + "\n" +
                "Form of legs: " + legsForm + "\n" +
                "Dimensions of legs: " + legsDiameter + " cm";
    }

    public String toStringLegsRectangle(){
        return "Name of legs: " + legsName + "\n" +
                "Form of legs: " + legsForm + "\n" +
                "Dimensions of legs: " + legsWidth + "x" + legsLength + " cm";
    }
}
