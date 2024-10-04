package Assignment1Greenest;

public class Palm extends Plants { //Subklass

    public Palm(double height, String name) {
        super(height, name);
    }
    @Override
    public double plantLiquidInLitres() {
        return 0.5 * getHeight();
    }
    @Override
    public String getLiquidType() {
        return Liquid.MINERAL_WATER.getLiquid();
    }
}

