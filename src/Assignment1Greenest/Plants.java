package Assignment1Greenest;

public abstract class Plants implements Irrigate {
    //implementerar från irrigate så att varje enskild subklass inte behöver göra det.

    private double height;
    private String name;

    //inkapsling
    public Plants( double height, String name ) {
        this.height = height;
        this.name = name;
    }


    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public abstract String getLiquidType(); //Polymorfism, de olika klasserna får egna vätske typer
    public abstract double plantLiquidInLitres(); //Polymorfism, de olika klasserna får egen mängd vätska
}

