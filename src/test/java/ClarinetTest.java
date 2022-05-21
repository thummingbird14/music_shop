import musicshop.instruments.Clarinet;
import musicshop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    private Clarinet clarinet;

    @Before
    public void before(){
        clarinet = new Clarinet("walnut", "brown", InstrumentType.WOODWIND, 500.00, 750.00, 1);
    }

    @Test
    public void hasMaterial(){
        assertEquals("walnut", clarinet.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", clarinet.getColour());
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.WOODWIND, clarinet.getType());
    }
    @Test
    public void hasPriceBought(){
        assertEquals(500.00, clarinet.getPriceBought(), 0.0);
    }
    @Test
    public void hasPriceToSell(){
        assertEquals(750.00, clarinet.getPriceToSell(), 0.0);
    }

    @Test
    public void hasNumberOfReeds(){
        assertEquals(1, clarinet.getNumberOfReeds());
    }
    @Test
    public void canPlay(){
        assertEquals("Huduhuhu", clarinet.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(250.00, clarinet.calculateMarkup(), 0.0);
    }
}
