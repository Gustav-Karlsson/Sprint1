package Assignment1Greenest;

public enum Liquid {
    WATER ("tap water "),
    MINERAL_WATER ("mineral water "),
    PROTEIN_FLUID ("protein fluid ");

    private final String liquidType; //inkapsling

    Liquid(String liquidType) {
        this.liquidType = liquidType;
    }

    public String getLiquid() {
        return liquidType;
    }
}