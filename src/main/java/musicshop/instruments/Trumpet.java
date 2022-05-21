package musicshop.instruments;

import musicshop.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private int numberOfValves;

    public Trumpet(String material, String colour, InstrumentType type, double priceBought, double priceToSell, int numberOfValves) {
        super(material, colour, type, priceBought, priceToSell);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "Buuup";
    }

    @Override
    public double calculateMarkup() {
        return this.getPriceToSell() - this.getPriceBought();
    }
}
