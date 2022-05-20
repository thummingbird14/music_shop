package musicshop.instruments;

public class Trumpet extends Instrument implements IPlay{

    private int numberOfValves;

    public Trumpet(String material, String colour, String type, double priceBought, double priceToSell, int numberOfValves) {
        super(material, colour, type, priceBought, priceToSell);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "Buuup";
    }
}
