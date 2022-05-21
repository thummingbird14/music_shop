package musicshop.instruments;

import musicshop.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType type, double priceBought, double priceToSell, int numberOfStrings) {
        super(material, colour, type, priceBought, priceToSell);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Strum Strum";
        }

    public double calculateMarkup(){
        return this.getPriceToSell() - this.getPriceBought();
    }


}
