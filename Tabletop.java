public class Tabletop {
    private String name;
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
    public Tabletop(String name){
        this.name = name;
    }

    public void addTabletopCharacteristic(String name, String tabletopForm,
                                          String tabletopColour,String tabletopMaterial,
                                          double tabletopThickness, double tabletopWeight,
                                          boolean tabletopHotResistance, boolean tabletopWaterResistance) {
        this.name = name;
        this.tabletopForm = tabletopForm;
        this.tabletopColour = tabletopColour;
        this.tabletopMaterial = tabletopMaterial;
        this.tabletopThickness = tabletopThickness;
        this.tabletopWeight = tabletopWeight;
        this.tabletopHotResistance = tabletopHotResistance;
        this.tabletopWaterResistance = tabletopWaterResistance;
    }

    //if form of tabletop is !round
    public void addTabletopCharacteristic(String name, String tabletopForm,
                                          String tabletopColour,String tabletopMaterial,
                                          double tabletopThickness, double tabletopWeight,
                                          boolean tabletopHotResistance, boolean tabletopWaterResistance,
                                          double tabletopWidth, double tabletopLength) {
        addTabletopCharacteristic(name, tabletopForm, tabletopColour,tabletopMaterial,
                tabletopThickness, tabletopWeight,tabletopHotResistance, tabletopWaterResistance);
        this.tabletopWidth = tabletopWidth;
        this.tabletopLength = tabletopLength;

    }
    // if form of tabletop is round
    public void addTabletopCharacteristic(String name, String tabletopForm,
                                          String tabletopColour,String tabletopMaterial,
                                          double tabletopThickness, double tabletopWeight,
                                          boolean tabletopHotResistance, boolean tabletopWaterResistance,
                                          double tabletopDiameter ) {
        addTabletopCharacteristic(name, tabletopForm, tabletopColour,tabletopMaterial,
                tabletopThickness, tabletopWeight,tabletopHotResistance, tabletopWaterResistance);
        this.tabletopDiameter = tabletopDiameter;
    }
}
