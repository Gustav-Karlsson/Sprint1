package Assignment1Greenest;

public class Carnivorous extends Plants {

    private double proteinLiquidInLitres = 0.1 + (getHeight() * 0.5);

    public Carnivorous(double proteinLiquidInLitres) {
        this.proteinLiquidInLitres = proteinLiquidInLitres;
    }

    public double getProteinLiquidInLitres() {
        return proteinLiquidInLitres;
    }

    public void setProteinLiquidInLitres(double proteinLiquidInLitres) {
        this.proteinLiquidInLitres = proteinLiquidInLitres;
    }
}
