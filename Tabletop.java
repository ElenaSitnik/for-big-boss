public class Tabletop {
    private String tabletopName;
    private String tabletopForm;
    private String tabletopColour;
    private String tabletopMaterial;
    private double tabletopDiameter; // meters
    private double tabletopThickness; // cm
    private double tabletopWidth; // cm
    private double tabletopLength; // cm
    private double tabletopWeight; // kilo
    private boolean tabletopHotResistance;
    private boolean tabletopWaterResistance;
    public Tabletop(String tabletopName){
        this.tabletopName = tabletopName;
    }

    public void addTabletopCharacteristic(String tabletopName, String tabletopForm,
                                          String tabletopColour,String tabletopMaterial,
                                          double tabletopThickness, double tabletopWeight,
                                          boolean tabletopHotResistance, boolean tabletopWaterResistance) {
        this.tabletopName = tabletopName;
        this.tabletopForm = tabletopForm;
        this.tabletopColour = tabletopColour;
        this.tabletopMaterial = tabletopMaterial;
        this.tabletopThickness = tabletopThickness;
        this.tabletopWeight = tabletopWeight;
        this.tabletopHotResistance = tabletopHotResistance;
        this.tabletopWaterResistance = tabletopWaterResistance;
    }

    //if form of tabletop is !round
    public void addTabletopCharacteristic(String tabletopName, String tabletopForm,
                                          String tabletopColour,String tabletopMaterial,
                                          double tabletopThickness, double tabletopWeight,
                                          boolean tabletopHotResistance, boolean tabletopWaterResistance,
                                          double tabletopWidth, double tabletopLength) {
        addTabletopCharacteristic(tabletopName, tabletopForm, tabletopColour,tabletopMaterial,
                tabletopThickness, tabletopWeight,tabletopHotResistance, tabletopWaterResistance);
        this.tabletopWidth = tabletopWidth;
        this.tabletopLength = tabletopLength;

    }
    // if form of tabletop is round
    public void addTabletopCharacteristic(String tabletopName, String tabletopForm,
                                          String tabletopColour,String tabletopMaterial,
                                          double tabletopThickness, double tabletopWeight,
                                          boolean tabletopHotResistance, boolean tabletopWaterResistance,
                                          double tabletopDiameter ) {
        addTabletopCharacteristic(tabletopName, tabletopForm, tabletopColour,tabletopMaterial,
                tabletopThickness, tabletopWeight,tabletopHotResistance, tabletopWaterResistance);
        this.tabletopDiameter = tabletopDiameter;
    }
    public String toStringTabletopRectangle(){
        return "Name tabletop: " + tabletopName + "\n" +
                "Form of tabletop: " + tabletopForm + "\n" +
                "Dimensions of tabletop: " + tabletopWidth + "x" + tabletopLength + " cm \n" +
                "Colour: " + tabletopColour;
    }
    public String toStringTabletopRound(){
        return "Name tabletop: " + tabletopName + "\n" +
                "Form of tabletop: " + tabletopForm + "\n" +
                "Dimensions of tabletop: " + tabletopDiameter + " cm \n" +
                "Colour: " + tabletopColour;
    }
}
