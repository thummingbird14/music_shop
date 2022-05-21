package musicshop.instruments;

import musicshop.ISell;

public class Clarinet extends Instrument implements IPlay,ISell {

    private int numberOfReeds;

    public Clarinet(String material, String colour, InstrumentType type, double priceBought, double priceToSell, int numberOfReeds) {
        super(material, colour, type, priceBought, priceToSell);
        this.numberOfReeds = numberOfReeds;
    }

    public int getNumberOfReeds() {
        return numberOfReeds;
    }

    public String play(){
        return("Huduhuhu");
    }

    public double calculateMarkup() {
        return this.getPriceToSell() - this.getPriceBought();
    }
}
