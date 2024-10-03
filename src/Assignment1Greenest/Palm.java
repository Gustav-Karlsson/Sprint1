package Assignment1Greenest;

public class Palm extends Plants {

    private double tapWaterInLitres = getHeight() * 0.5;

    public Palm (double tapWaterInLitres){

        this.tapWaterInLitres = tapWaterInLitres;

    }

    public double getTapWaterInLitres() {
        return tapWaterInLitres;
    }

    public void setTapWaterInLitres(double tapWaterInLitres) {
        this.tapWaterInLitres = tapWaterInLitres;
    }
}
