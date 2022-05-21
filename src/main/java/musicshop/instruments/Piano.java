package musicshop.instruments;

import musicshop.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentType type, double priceBought, double priceToSell, int numberOfKeys) {
        super(material, colour, type, priceBought, priceToSell);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "Plink Plonk";
    }

    public double calculateMarkup(){
        return this.getPriceToSell() - this.getPriceBought();
    }
}
