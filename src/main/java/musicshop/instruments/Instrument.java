package musicshop.instruments;

public abstract class Instrument {

    private String material;
    private String colour;
    private String type;
    private double priceBought;
    private double priceToSell;

    public Instrument(String material, String colour, String type, double priceBought, double priceToSell) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.priceBought = priceBought;
        this.priceToSell = priceToSell;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceToSell() {
        return priceToSell;
    }
}
