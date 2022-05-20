package musicshop.instruments;

public class Piano extends Instrument implements IPlay{

    private int numberOfKeys;

    public Piano(String material, String colour, String type, double priceBought, double priceToSell, int numberOfKeys) {
        super(material, colour, type, priceBought, priceToSell);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "Plink Plonk";
    }
}
