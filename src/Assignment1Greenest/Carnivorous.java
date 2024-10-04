package Assignment1Greenest;

public class Carnivorous extends Plants {

    public Carnivorous(double height, String name) {
        super(height, name);
    }
    @Override
    public double plantLiquidInLitres() {
        return 0.1 + (0.2 * getHeight());
    }
    @Override
    public String getLiquidType() {
        return Liquid.PROTEIN_FLUID.getLiquid();
    }
}
