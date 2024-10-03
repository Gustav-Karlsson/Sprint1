package Assignment1Greenest;

public class Cactus extends Plants {

    private double mineralWaterInLitres = 0.02;

    public Cactus(double mineralWaterInLitres) {
        this.mineralWaterInLitres = mineralWaterInLitres;
    }

    public double getMineralWaterInLitres() {
        return mineralWaterInLitres;
    }

    public void setMineralWaterInLitres(double mineralWaterInLitres) {
        this.mineralWaterInLitres = mineralWaterInLitres;
    }
}
