package Assignment1Greenest;

public class Cactus extends Plants { //Subklass


    public Cactus(double height, String name) {
        super(height, name);
    }
    @Override
    public double plantLiquidInLitres() {
        return 0.02;
    }

    @Override
    public String getLiquidType() {
        return Liquid.WATER.getLiquid();

    }
}