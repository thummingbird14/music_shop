package musicshop.instruments;

public class Clarinet extends Instrument implements IPlay{

    private int numberOfReeds;

    public Clarinet(String material, String colour, String type, double priceBought, double priceToSell, int numberOfReeds) {
        super(material, colour, type, priceBought, priceToSell);
        this.numberOfReeds = numberOfReeds;
    }

    public int getNumberOfReeds() {
        return numberOfReeds;
    }

    public String play(){
        return("Huduhuhu");
    }
}
